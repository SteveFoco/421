package Controllers;

import BusinessObjects.*;
import Helpers.DatabasePinger;
import java.sql.*;

public class DBMgr {
  private Connection conn;
  private Statement st;
  private PreparedStatement pst;
  private ResultSet rs;
  DatabasePinger pinger;
  
  public DBMgr() {
    try {

      Class.forName("com.mysql.jdbc.Driver");
      
      conn = DriverManager.getConnection("jdbc:mysql://160.153.57.72:3306/csms","sjfoco","Password01");
      st = conn.createStatement();
      
    } catch(Exception ex) {
      System.out.println("Error: " +ex);
    }
    
    this.pinger = new DatabasePinger(conn);
  }
  
  public void startPinger() {
    pinger.ping();
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
  
  public ResultSet getCourseSections() {
    try {
      String query = "SELECT cs.course_number, c.title, cs.id, cs.professor, md.day, md.start_time,"
        + "md.end_time, md.room_number, cs.student_count FROM course_sections AS cs, courses AS c, meeting_days AS md "
        + "WHERE cs.course_number = c.course_number AND md.course_section_id = cs.id";
      rs = st.executeQuery(query);
      
      return rs;      
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    return null;
  }
  
  public ResultSet getDepartments() {
    try {
      String query = "SELECT name FROM departments ORDER BY name ASC";
      rs = st.executeQuery(query);
      
      return rs;
    } catch(Exception ex) {
      System.out.println(ex);    
    }
    
    return null;
  }
  
  public ResultSet getTimes() {
    ResultSet results = null;
    
    String select = "SELECT TIME_FORMAT(time, '%h:%i %p') AS time FROM times";
    
    try
    {
      pst = conn.prepareStatement(select);
      results = pst.executeQuery();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return results;
  }
  
  public ResultSet getRooms(int capacity) {
    ResultSet results = null;
    
    String select = "SELECT * FROM rooms WHERE capacity >= ?";
    
    try
    {
      pst = conn.prepareStatement(select);
      pst.setInt(1, capacity);
      results = pst.executeQuery();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return results;
  }
  
  public ResultSet getTerms() {
    rs = null;
    
    try {
      String query = "SELECT term, id FROM terms ORDER BY id ASC";
      rs = st.executeQuery(query);
      
    } catch(Exception ex) {
      System.out.println(ex);    
    }
    
    return rs;
  }
  
  public ResultSet getProfessors(String dept) {
    rs = null;
    
    try {
      String query = "SELECT last_name, first_name "
                   + "FROM professors "
                   + "WHERE department = '" + dept + "' "
                   + "ORDER BY last_name ASC";
      rs = st.executeQuery(query);
      
    } catch(Exception ex) {
      System.out.println(ex);    
    }  
    
    return rs;
  }
  
  public ResultSet getCourseNumbers(String dept) {
    rs = null;
    
    try {
      String query = "SELECT course_number FROM courses WHERE department = '" + dept + "'";
      rs = st.executeQuery(query);
      
    } catch(Exception ex) {
      System.out.println(ex);    
    }  
    
    return rs;
  }
  
  public ResultSet getCourseName(String courseNum) {
    rs = null;
    
    try {
      String query = "SELECT title FROM courses WHERE course_number = '" + courseNum + "'";
      rs = st.executeQuery(query);
      
    } catch(Exception ex) {
      System.out.println(ex);    
    }  
    
    return rs;  
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
    
    String select = "SELECT * " +
                    "FROM course_sections " +
                    "WHERE ( ";
    
    if (section.course_number != null)
      select += "course_number LIKE '%" + section.course_number + "%' AND ";
    if (section.section_number != 0)
      select += "section_number = " + section.section_number + " AND ";
    if (section.capacity != 0)
      select += "capacity = " + section.capacity + " AND ";
    if (section.seats_available != 0)
      select += "seats_available = " + section.seats_available + " AND ";
    if (section.status != null)
      select += "status LIKE '%" + section.status + "%' AND ";
    if (section.student_count != 0)
      select += "student_count = " + section.student_count + " AND ";
    if (section.type != null)
      select += "type LIKE '%" + section.type + "%' AND ";
    if (section.start_date != null)
      select += "start_date = " + section.start_date + " AND ";
    if (section.last_date != null)
      select += "last_date = " + section.last_date + " AND ";
    if (section.term != null)
      select += "term LIKE '%" + section.term + "%' ";
    else
      select += "term LIKE '%%' ";
      
    select += ") " +
              "ORDER BY section_number ASC";
    
    try
    {
      pst = conn.prepareStatement(select);
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
    
    String insert = "INSERT INTO course_sections (" +
                    "course_number," +
                    "section_number," +
                    "available," +
                    "capacity," +
                    "seats_available," +
                    "status," +
                    "term," +
                    "student_count," +
                    "type," +
                    "start_date," +
                    "last_date" +
                    ")" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try
    {
      pst = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
      
      pst.setString(1, section.course_number);
      pst.setInt(2, section.section_number);
      pst.setInt(3, section.available ? 1 : 0);
      pst.setInt(4, section.capacity);
      pst.setInt(5, section.seats_available);
      pst.setString(6, section.status);
      pst.setString(7, section.term);
      pst.setInt(8, section.student_count);
      pst.setString(9, section.type);
      pst.setDate(10, section.start_date);
      pst.setDate(11, section.last_date);
      
      pst.execute();
      result = pst.getGeneratedKeys();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return result;
  }
  
  public ResultSet saveMeetingDay(MeetingDay meeting_day) {
    ResultSet result = null;
    
    String insert = "INSERT INTO meeting_days (" +
                    "course_section_id," +
                    "room_number," +
                    "day," +
                    "start_time," +
                    "end_time" +
                    ")" +
                    "VALUES (?, ?, ?, ?, ?)";
    
    try
    {
      pst = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
      pst.setInt(1, meeting_day.course_section_id);
      pst.setString(2, meeting_day.room_number);
      pst.setString(3, meeting_day.day);
      pst.setTime(4, meeting_day.start_time);
      pst.setTime(5, meeting_day.end_time);
      
      pst.execute();
      
      result = pst.getGeneratedKeys();
    }
    catch (SQLException ex)
    {
      System.out.println(ex);
    }
    
    return result;
  }
}