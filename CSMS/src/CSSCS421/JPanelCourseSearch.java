/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CSSCS421;

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
    jComBoxDeptSearchCS = new javax.swing.JComboBox();
    jComBoxInstructorCS = new javax.swing.JComboBox();
    jLabelUsername = new javax.swing.JLabel();
    jComBoxCreditsCS = new javax.swing.JComboBox();
    jComBoxSemesterCS = new javax.swing.JComboBox();
    jtxtLineNumberCS2 = new javax.swing.JTextField();
    jComBoxLevelCS = new javax.swing.JComboBox();
    jComBoxDaysCS = new javax.swing.JComboBox();
    jLabelPassword = new javax.swing.JLabel();
    jtxtNumberCS = new javax.swing.JTextField();
    jBtnSearchCS = new javax.swing.JButton();
    jLabelPassword2 = new javax.swing.JLabel();

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

    jComBoxDeptSearchCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxDeptSearchCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept.", "Accounting", "Art", "Biology", "Black Studies", "Col Business & Management", "Communication & Digital Media", "Chemistry", "Computer Info Syst", "Criminal Justice", "Communication", "Computer Science", "Elec & Computer Engr", "Economics", "Education Leadership", "English Lang Program", "English", "Educational Tech & Development", "Engineering Tech Management", "Finance", "French", "Geography", "German", "Gender Studies", "History", "Honors", "Health Sciences", "Japanese", "Kinesiology", "Latin", "Law", "Leadership and Service", "Administrative Science", "Mathematical Sciences", "Mechanical Engr", "Master of Energy & Materials", "Modern Foreign Lang", "Management", "Marketing", "Medical Laboratory Science", "Music Education", "Music", "Natural Science", "Nursing", "Occupational Therapy", "Philosophy", "Physics", "Political Science", "Psychology", "Robert Fellows Seminar", "Rhetoric & Prof Writing", "Sociology", "Spanish", "Social Work", "Teaching Chinese As a Foreign", "Teacher Education--Mis/Sec Sch", "Teacher Education", "Theater", "Youth Services" }));

    jComBoxInstructorCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxInstructorCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Instructor", "Cho, I", "James, Scott" }));

    jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername.setText("Department:");

    jComBoxCreditsCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxCreditsCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Credits", "1", "2", "3", "4", "5" }));

    jComBoxSemesterCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxSemesterCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sem.", "Fall 14", "Winter 15", "Spring 15", "Summer 15", "Fall 15", "Winter 16" }));

    jtxtLineNumberCS2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jComBoxLevelCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxLevelCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Level", "100", "200", "300", "400", "500", "600" }));

    jComBoxDaysCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxDaysCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));
    jComBoxDaysCS.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComBoxDaysCSActionPerformed(evt);
      }
    });

    jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword.setText("Semester:");

    jtxtNumberCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel3)
        .addGap(457, 457, 457))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelUsername1)
              .addComponent(jComBoxLevelCS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jtxtNumberCS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword1)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jtxtLineNumberCS2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jComBoxDaysCS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword2)))
          .addComponent(jLabelUsername2)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelUsername)
            .addGap(198, 198, 198)
            .addComponent(jLabelPassword))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jComBoxDeptSearchCS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(59, 59, 59)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelUsername3)
              .addComponent(jComBoxSemesterCS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jComBoxInstructorCS, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jComBoxCreditsCS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword3))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addComponent(jBtnSearchCS, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(29, Short.MAX_VALUE))
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
          .addComponent(jComBoxDeptSearchCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxSemesterCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUsername1)
          .addComponent(jLabelPassword1)
          .addComponent(jLabelUsername3))
        .addGap(2, 2, 2)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComBoxLevelCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtxtNumberCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxInstructorCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUsername2)
          .addComponent(jLabelPassword2)
          .addComponent(jLabelPassword3))
        .addGap(4, 4, 4)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jtxtLineNumberCS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxDaysCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxCreditsCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
        .addComponent(jBtnSearchCS)
        .addGap(25, 25, 25))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jComBoxDaysCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBoxDaysCSActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jComBoxDaysCSActionPerformed

  private void jBtnSearchCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchCSActionPerformed
    CSMS.switchTo("COURSE LISTING");
  }//GEN-LAST:event_jBtnSearchCSActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnSearchCS;
  private javax.swing.JComboBox jComBoxCreditsCS;
  private javax.swing.JComboBox jComBoxDaysCS;
  private javax.swing.JComboBox jComBoxDeptSearchCS;
  private javax.swing.JComboBox jComBoxInstructorCS;
  private javax.swing.JComboBox jComBoxLevelCS;
  private javax.swing.JComboBox jComBoxSemesterCS;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelPassword;
  private javax.swing.JLabel jLabelPassword1;
  private javax.swing.JLabel jLabelPassword2;
  private javax.swing.JLabel jLabelPassword3;
  private javax.swing.JLabel jLabelUsername;
  private javax.swing.JLabel jLabelUsername1;
  private javax.swing.JLabel jLabelUsername2;
  private javax.swing.JLabel jLabelUsername3;
  private javax.swing.JTextField jtxtLineNumberCS2;
  private javax.swing.JTextField jtxtNumberCS;
  // End of variables declaration//GEN-END:variables
}
