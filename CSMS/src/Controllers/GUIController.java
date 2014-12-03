/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers;

import BusinessObjects.CourseSection;
import GUI.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GUIController {
  // Controllers
  public static Controllers.DBMgr db = new Controllers.DBMgr();
  public static Controllers.UsersController users = new Controllers.UsersController();
  public static Controllers.CourseSectionController coursesections = new Controllers.CourseSectionController();
  
  //CardLayout cards;
  static JPanel cardPanel;
  public static JPanelNewSection newSectionCard = new JPanelNewSection();
  public static JPanelCourseListing courseListingCard = new JPanelCourseListing();
  public static JPanelCourseSearch courseSearchCard = new JPanelCourseSearch();
  
  public void addComponentToPane(Container pane) {
    
    //Create the cards
    JPanelLogin loginCard = new JPanelLogin();
    JPanelHome homeCard = new JPanelHome(); 
    JPanelConflicts conflictsCard = new JPanelConflicts();
    JPanelModify modifyCard = new JPanelModify();
    JPanelScheduleView scheduleViewCard = new JPanelScheduleView();
    JPanelChairHome chairHomeCard = new JPanelChairHome();
    JPanelDeleteAccount deleteAccountCard = new JPanelDeleteAccount();
    JPanelNewUserAccount newUserAccountCard = new JPanelNewUserAccount();
    JPanelUpdateAccount updateAccountCard = new JPanelUpdateAccount();
    JPanelAddCourse addCourseCard = new JPanelAddCourse();
    JPanelChooseSchedule chooseScheduleCard = new JPanelChooseSchedule();
    JPanelRequiredChanges requiredChangesCard = new JPanelRequiredChanges();
    
    
    //Create the panel to contain the cards
    cardPanel = new JPanel(new CardLayout());
    
    //Add the cards to the panel
    cardPanel.add(loginCard, "LOGIN");
    cardPanel.add(homeCard, "HOME");
    cardPanel.add(courseSearchCard, "COURSE SEARCH");
    cardPanel.add(courseListingCard, "COURSE LISTING");
    cardPanel.add(conflictsCard, "CONFLICTS");
    cardPanel.add(modifyCard, "MODIFY");
    cardPanel.add(scheduleViewCard, "SCHEDULE VIEW");
    cardPanel.add(chairHomeCard, "CHAIR HOME");
    cardPanel.add(deleteAccountCard, "DELETE ACCOUNT");
    cardPanel.add(newUserAccountCard, "NEW USER");
    cardPanel.add(updateAccountCard, "UPDATE ACCOUNT");
    cardPanel.add(addCourseCard, "ADD COURSE");
    cardPanel.add(newSectionCard, "NEW SECTION");
    cardPanel.add(chooseScheduleCard, "CHOOSE SCHEDULE");
    cardPanel.add(requiredChangesCard, "REQUIRED CHANGES");
    
    //Add cards panel to pane
    pane.add(new JPanelHeader(), BorderLayout.PAGE_START);
    pane.add(cardPanel, BorderLayout.CENTER);
  }
  
  public static void switchTo(String cardCode) {
    CardLayout c1 = (CardLayout)(cardPanel.getLayout());
    c1.show(cardPanel, cardCode);
  }
  
  public static void buildDeptComboBox() {
    ArrayList<String> names = new ArrayList<>();
    
    ResultSet rs = db.getDepartments();
    
    try {
      while(rs.next()) {
        names.add(rs.getString("name"));
      }        
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    DefaultComboBoxModel model = new DefaultComboBoxModel(names.toArray());
    newSectionCard.jCmbDept.setModel(model);
  }
  
  public static void buildTermComboBox() {
    ArrayList<String> terms = new ArrayList<>();
    
    ResultSet rs = db.getTerms();
    
    try {
      while(rs.next()) {
        terms.add(rs.getString("term"));
      }        
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    DefaultComboBoxModel model = new DefaultComboBoxModel(terms.toArray());
    newSectionCard.jCmbTerm.setModel(model);
  }
  
  public static void buildProfComboBox() {
    ArrayList<String> names = new ArrayList<>();
    
    ResultSet rs = db.getProfessors(newSectionCard.jCmbDept.getSelectedItem().toString());
    
    try {
      while(rs.next()) {
        names.add(rs.getString("last_name") + ", " + rs.getString("first_name"));
      }        
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    DefaultComboBoxModel model = new DefaultComboBoxModel(names.toArray());
    newSectionCard.jCmbInstructor.setModel(model);
  }
  
  public static void buildCourseNameTextBox() {
    ResultSet rs = db.getCourseName(newSectionCard.jCmbCourseNum.getSelectedItem().toString());
    String title = new String();
    
    try {
      rs.next();
      title = rs.getString("title");
    } catch (Exception ex) {
      System.out.println(ex);
    }
    
    newSectionCard.jtxtCourseName.setText(title);
  }
  
  public static void buildCourseNumComboBox() {
    ArrayList<String> numbers = new ArrayList<>();
    
    ResultSet rs = db.getCourseNumbers(newSectionCard.jCmbDept.getSelectedItem().toString());
    
    try {
      while(rs.next()) {
        numbers.add(rs.getString("course_number"));
      }
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    DefaultComboBoxModel model = new DefaultComboBoxModel(numbers.toArray());
    newSectionCard.jCmbCourseNum.setModel(model);
  }
  
  public static DefaultComboBoxModel buildTimeComboBox() {
    ArrayList<String> times = new ArrayList<>();
    
    ResultSet rs = db.getTimes();
    
    try {
      while(rs.next()) {
        times.add(rs.getString("time"));
      }
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    DefaultComboBoxModel model = new DefaultComboBoxModel(times.toArray());
    
    // Return combo box model
    return model;
  }
  
  public static DefaultComboBoxModel buildRoomComboBox(int capacity) {
    ArrayList<String> roomNumbers = new ArrayList<>();
    
    ResultSet rs = db.getRooms(capacity);
    
    try {
      while(rs.next()) {
        roomNumbers.add(rs.getString("room_number"));
      }
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    DefaultComboBoxModel model = new DefaultComboBoxModel(roomNumbers.toArray());
    
    // Return combo box model
    return model;
  }
  
  public static String buildSectionNumberText(CourseSection section) {
    int nextSectionNumber = 1;
    
    ResultSet rs = db.findCourseSections(section);
    
    try {
      while(rs.next()) {
        if (nextSectionNumber == rs.getInt("section_number")) {
          nextSectionNumber++;
        }
      }
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    return String.valueOf(nextSectionNumber);
  }

  public static DefaultTableModel buildTable() throws SQLException {
    ResultSet rs = db.getCourseSections();
    ResultSetMetaData metaData = rs.getMetaData();
    int rowCount = 0;
    
    // names of columns
    Vector<String> columnNames = new Vector<>();
    int columnCount = metaData.getColumnCount();

    columnNames.add("Course #");
    columnNames.add("Name");
    columnNames.add("Line No.");
    columnNames.add("Professor");
    columnNames.add("Days");
    columnNames.add("Start");
    columnNames.add("End");
    columnNames.add("Room");
    columnNames.add("Students");
    
    // data of the table
    Vector<Vector<Object>> data = new Vector<>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
        rowCount++;
    }

    courseListingCard.jlblResultCount.setText(rowCount + " Course(s) Found");
    
    return new DefaultTableModel(data, columnNames);
  }
  
  public static void createGui() {
    //JFrameMain mainFrame = new JFrameMain();
    JFrame mainFrame = new JFrame();
    
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(750,600);
    mainFrame.setTitle("Course Scheduling Management System");
    mainFrame.setBackground(new java.awt.Color(255, 51, 51));
    
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setLayout(new BorderLayout());
    
    GUIController csms = new GUIController();
    csms.addComponentToPane(mainFrame.getContentPane());
    
    //Display the window.
    mainFrame.setVisible(true);
    
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        createGui();
      }
    }); 
  }
  
  public GUIController() {        
    
  }
}