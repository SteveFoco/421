/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controllers;

import GUI.*;
import java.awt.*;
import javax.swing.*;

public class GUIController {

  //CardLayout cards;
  static JPanel cardPanel;
  public static Controllers.DBMgr db = new Controllers.DBMgr();
  public static Controllers.UsersController users = new Controllers.UsersController();
  public static Controllers.CourseSectionController coursesections = new Controllers.CourseSectionController();
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
    JPanelNewSection newSectionCard = new JPanelNewSection();
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