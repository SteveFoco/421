package Controllers;

import BusinessObjects.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class DBMgr {
  private Connection conn;
  private Statement st;
  private PreparedStatement pst;
  private ResultSet rs;
  
  public DBMgr() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      
      conn = DriverManager.getConnection("jdbc:mysql://160.153.57.72:3306/csms","sjfoco","Password01");
      st = conn.createStatement();
      
    } catch(Exception ex) {
      System.out.println("Error: " +ex);
    }
  }
  
  public void getData() {
    try {
      String query = "select * from professors";
      rs = st.executeQuery(query);
      System.out.println("Records from Database");
      
      while(rs.next()) {
        String id = rs.getString("id");
        String firstName = rs.getString("first_name");
        
        System.out.println("ID: " + id + " Name: " + firstName);
      }
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }
  
  public String getPassword(String user) {
    try {
      String query = "SELECT password FROM users WHERE username = '" + user + "'";
      rs = st.executeQuery(query);
      rs.next();
      String password = rs.getString("password");
      
      System.out.println("Password: " + password);
      
      return password;
      
    } catch (Exception ex) {
      System.out.println(ex);
    }
    
    return null;
  }
  
  public DefaultTableModel getCourseSections() {
    try {
      String query = "SELECT cs.course_number, c.title, cs.id, cs.professor, md.day, md.start_time,"
        + "md.end_time, md.room_number, cs.student_count FROM course_sections AS cs, courses AS c, meeting_days AS md "
        + "WHERE cs.course_number = c.course_number AND md.course_section_id = cs.id";
      rs = st.executeQuery(query);
      
      //JTable table = new JTable(buildTable(rs));
      DefaultTableModel model = buildTable(rs);
      return model;
      
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    return null;
  }

  public static DefaultTableModel buildTable(ResultSet rs) throws SQLException {
    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    //for (int column = 1; column <= columnCount; column++) {
        columnNames.add("Course #");
        columnNames.add("Name");
        columnNames.add("Line No.");
        columnNames.add("Professor");
        columnNames.add("Days");
        columnNames.add("Start");
        columnNames.add("End");
        columnNames.add("Room");
        columnNames.add("Students");
    //}

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);
  }
  
  public ResultSet getCourseSection(int id) {
    ResultSet results = null;
    
    String select = "SELECT *" +
                    "FROM course_sections" +
                    "WHERE (" +
                    "id = ?" +
                    ")";
    
    try
    {
      pst = conn.prepareStatement(select);
      pst.setInt(1, id);
      results = pst.executeQuery();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return results;
  }

  public ResultSet findCourseSections(CourseSection section) {
    ResultSet result = null;
    
    String select = "SELECT *" +
                    "FROM course_sections" +
                    "WHERE (" +
                    "course_number LIKE ? AND" +
                    "section_number = ? AND" +
                    "available = ? AND" +
                    "capacit?y = ? AND" +
                    "seats_available = ? AND" +
                    "status LIKE ? AND" +
                    "term LIKE ? AND" +
                    "student_count = ? AND" +
                    "type LIKE ? AND" +
                    "first_date = ? AND" +
                    "last_date = ?" +
                    ")";
    
    try
    {
      pst = conn.prepareStatement(select);
      pst.setString(1, "%"+section.course_number+"%");
      pst.setInt(2, section.section_number);
      pst.setInt(3, section.available ? 1 : 0);
      pst.setInt(4, section.capacity);
      pst.setInt(5, section.seats_available);
      pst.setString(6, "%"+section.status+"%");
      pst.setString(7, "%"+section.term+"%");
      pst.setInt(8, section.student_count);
      pst.setString(9, "%"+section.type+"%");
      pst.setDate(10, section.first_date);
      pst.setDate(11, section.last_date);
      result = pst.executeQuery();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return result;
  }
    
  public ResultSet saveCourseSection(CourseSection section) {
    ResultSet result = null;
    
    String insert = "INSERT INTO course_sections VALUES(" +
                    "course_number," +
                    "section_number," +
                    "available," +
                    "capacity," +
                    "seats_available," +
                    "status," +
                    "term," +
                    "student_count," +
                    "type," +
                    "first_date," +
                    "last_date" +
                    ")" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try
    {
      pst = conn.prepareStatement(insert);
      
      pst.setString(1, section.course_number);
      pst.setInt(2, section.section_number);
      pst.setInt(3, section.available ? 1 : 0);
      pst.setInt(4, section.capacity);
      pst.setInt(5, section.seats_available);
      pst.setString(6, section.status);
      pst.setString(7, section.term);
      pst.setInt(8, section.student_count);
      pst.setString(9, section.type);
      pst.setDate(10, section.first_date);
      pst.setDate(11, section.last_date);
      
      result = pst.executeQuery();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return result;
  }
}