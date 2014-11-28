package Controllers;

import java.sql.*;

public class DBMgr {
  private Connection conn;
  private Statement st;
  private ResultSet rs;
  
  public DBMgr() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      
      conn = DriverManager.getConnection("jdbc:mysql://192.168.1.8:3306/csms","root","");
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

}
