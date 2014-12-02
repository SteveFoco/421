/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Controllers.GUIController;
import java.sql.SQLException;

/**
 *
 * @author Steve
 */
public class JPanelCourseSearch extends javax.swing.JPanel {

    /**
     * Creates new form JPanelCourseSearch
     */
    public JPanelCourseSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabelUsername1 = new javax.swing.JLabel();
    jLabelUsername2 = new javax.swing.JLabel();
    jLabelPassword1 = new javax.swing.JLabel();
    jLabelPassword3 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabelUsername3 = new javax.swing.JLabel();
    jCmbDept = new javax.swing.JComboBox();
    jCmbInstructor = new javax.swing.JComboBox();
    jLabelUsername = new javax.swing.JLabel();
    jCmbCredits = new javax.swing.JComboBox();
    jCmbSemester = new javax.swing.JComboBox();
    jtxtLineNumber = new javax.swing.JTextField();
    jCmbLevel = new javax.swing.JComboBox();
    jCmbDays = new javax.swing.JComboBox();
    jLabelPassword = new javax.swing.JLabel();
    jtxtNumber = new javax.swing.JTextField();
    jBtnSearchCS = new javax.swing.JButton();
    jLabelPassword2 = new javax.swing.JLabel();
    jBtnBackCS = new javax.swing.JButton();

    setPreferredSize(new java.awt.Dimension(736, 408));

    jLabelUsername1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername1.setText("Level:");

    jLabelUsername2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername2.setText("Line Number:");

    jLabelPassword1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword1.setText("Number:");

    jLabelPassword3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword3.setText("Credits:");

    jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
    jLabel3.setText("Course Search");

    jLabelUsername3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername3.setText("Instructor:");

    jCmbDept.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept.", "Accounting", "Art", "Biology", "Black Studies", "Col Business & Management", "Communication & Digital Media", "Chemistry", "Computer Info Syst", "Criminal Justice", "Communication", "Computer Science", "Elec & Computer Engr", "Economics", "Education Leadership", "English Lang Program", "English", "Educational Tech & Development", "Engineering Tech Management", "Finance", "French", "Geography", "German", "Gender Studies", "History", "Honors", "Health Sciences", "Japanese", "Kinesiology", "Latin", "Law", "Leadership and Service", "Administrative Science", "Mathematical Sciences", "Mechanical Engr", "Master of Energy & Materials", "Modern Foreign Lang", "Management", "Marketing", "Medical Laboratory Science", "Music Education", "Music", "Natural Science", "Nursing", "Occupational Therapy", "Philosophy", "Physics", "Political Science", "Psychology", "Robert Fellows Seminar", "Rhetoric & Prof Writing", "Sociology", "Spanish", "Social Work", "Teaching Chinese As a Foreign", "Teacher Education--Mis/Sec Sch", "Teacher Education", "Theater", "Youth Services" }));

    jCmbInstructor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbInstructor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Instructor", "Cho, I", "James, Scott" }));

    jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername.setText("Department:");

    jCmbCredits.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbCredits.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Credits", "1", "2", "3", "4", "5" }));

    jCmbSemester.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbSemester.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sem.", "Fall 14", "Winter 15", "Spring 15", "Summer 15", "Fall 15", "Winter 16" }));

    jtxtLineNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jCmbLevel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Level", "100", "200", "300", "400", "500", "600" }));

    jCmbDays.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));
    jCmbDays.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbDaysActionPerformed(evt);
      }
    });

    jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword.setText("Semester:");

    jtxtNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jBtnSearchCS.setBackground(new java.awt.Color(0, 204, 255));
    jBtnSearchCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnSearchCS.setText("Search");
    jBtnSearchCS.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnSearchCSActionPerformed(evt);
      }
    });

    jLabelPassword2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword2.setText("Days:");

    jBtnBackCS.setBackground(new java.awt.Color(0, 204, 255));
    jBtnBackCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnBackCS.setText("Back");
    jBtnBackCS.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnBackCSActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(128, Short.MAX_VALUE)
        .addComponent(jLabel3)
        .addGap(457, 457, 457))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelUsername1)
              .addComponent(jCmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jtxtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword1)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jtxtLineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCmbDays, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword2)))
          .addComponent(jLabelUsername2)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUsername)
            .addGap(198, 198, 198)
            .addComponent(jLabelPassword))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jBtnBackCS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(58, 58, 58)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelUsername3)
              .addComponent(jCmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCmbInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jCmbCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword3)
              .addComponent(jBtnSearchCS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addGap(37, 37, 37)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUsername)
          .addComponent(jLabelPassword))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jCmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCmbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUsername1)
          .addComponent(jLabelPassword1)
          .addComponent(jLabelUsername3))
        .addGap(2, 2, 2)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jCmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtxtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCmbInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUsername2)
          .addComponent(jLabelPassword2)
          .addComponent(jLabelPassword3))
        .addGap(4, 4, 4)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jtxtLineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCmbDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCmbCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnSearchCS)
          .addComponent(jBtnBackCS))
        .addGap(41, 41, 41))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jCmbDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDaysActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbDaysActionPerformed

  private void jBtnSearchCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchCSActionPerformed

      try {
        GUIController.courseListingCard.jTblResults.setModel(GUIController.buildTable());
      } catch (SQLException ex) {
        System.out.println(ex);
      }
    
    GUIController.switchTo("COURSE LISTING");
  }//GEN-LAST:event_jBtnSearchCSActionPerformed

  private void jBtnBackCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackCSActionPerformed
    GUIController.switchTo("HOME");
  }//GEN-LAST:event_jBtnBackCSActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnBackCS;
  private javax.swing.JButton jBtnSearchCS;
  private javax.swing.JComboBox jCmbCredits;
  private javax.swing.JComboBox jCmbDays;
  private javax.swing.JComboBox jCmbDept;
  private javax.swing.JComboBox jCmbInstructor;
  private javax.swing.JComboBox jCmbLevel;
  private javax.swing.JComboBox jCmbSemester;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelPassword;
  private javax.swing.JLabel jLabelPassword1;
  private javax.swing.JLabel jLabelPassword2;
  private javax.swing.JLabel jLabelPassword3;
  private javax.swing.JLabel jLabelUsername;
  private javax.swing.JLabel jLabelUsername1;
  private javax.swing.JLabel jLabelUsername2;
  private javax.swing.JLabel jLabelUsername3;
  private javax.swing.JTextField jtxtLineNumber;
  private javax.swing.JTextField jtxtNumber;
  // End of variables declaration//GEN-END:variables
}
