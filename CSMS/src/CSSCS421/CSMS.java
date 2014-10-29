/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CSSCS421;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
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

  JFrame mainFrame;
  CardLayout cards;
  JPanel cardPanel;
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new CSMS();
      }
    });
  }
  
  public CSMS() {
    mainFrame = new JFrame();
    
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Course Scheduling Management System");
    mainFrame.setSize(500,400);
    
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setLayout(new BorderLayout());
    
    Border outline = BorderFactory.createLineBorder(Color.black);
    
    
  }
}
