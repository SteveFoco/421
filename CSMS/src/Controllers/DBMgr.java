package Controllers;

import java.sql.*;

public class DBMgr {
  private Connection conn;
  private Statement st;
  private ResultSet rs;
  
  public DBMgr() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/csms","root","");
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

}
