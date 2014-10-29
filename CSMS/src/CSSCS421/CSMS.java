/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CSSCS421;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author steev_000
 */
public class CSMS {

  //CardLayout cards;
  static JPanel cardPanel;
  
  public void addComponentToPane(Container pane) {
    
    //Create the cards
    JPanelLogin loginCard = new JPanelLogin();
    JPanelHome homeCard = new JPanelHome();
    JPanelCourseSearch courseSearchCard = new JPanelCourseSearch();
    JPanelCourseListing courseListingCard = new JPanelCourseListing();
    JPanelConflicts conflictsCard = new JPanelConflicts();
    JPanelModify modifyCard = new JPanelModify();
    JPanelScheduleView scheduleViewCard = new JPanelScheduleView();
    
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
    
    //Add cards panel to pane
    pane.add(cardPanel, BorderLayout.CENTER);
  }
  
  public static void switchTo(String cardCode) {
    CardLayout c1 = (CardLayout)(cardPanel.getLayout());
    c1.show(cardPanel, cardCode);
  }

  //public static void switchToCourseSearchCard() {
  //  CardLayout c2 = (CardLayout)(cardPanel.getLayout());
  //  c2.show(cardPanel, "HOME");
  //}
    
  public static void createGui() {
    JFrame mainFrame = new JFrame("Course Scheduling Management Ssytem");
    
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setSize(500,400);
    
    mainFrame.setLocationRelativeTo(null);
    //mainFrame.setLayout(new BorderLayout());
    
    CSMS csms = new CSMS();
    csms.addComponentToPane(mainFrame.getContentPane());
    
    //Display the window.
    mainFrame.pack();
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
  
  public CSMS() {        
    
  }
}
