/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Steve
 */
public class JPanelModify extends javax.swing.JPanel {

    /**
     * Creates new form JPanelModify
     */
    public JPanelModify() {
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

    jPanel2 = new javax.swing.JPanel();
    jBtnSubmitMod = new javax.swing.JButton();
    jLabelUsername1 = new javax.swing.JLabel();
    jLabelPassword1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabelUsername = new javax.swing.JLabel();
    jLabelPassword = new javax.swing.JLabel();
    jBtnBackMod = new javax.swing.JButton();
    jtxtNumberMod = new javax.swing.JTextField();
    jtxtNameMod = new javax.swing.JTextField();
    jtxtNumberCS = new javax.swing.JTextField();
    jLabelPassword2 = new javax.swing.JLabel();
    jLabelPassword5 = new javax.swing.JLabel();
    jLabelPassword6 = new javax.swing.JLabel();
    jLabelPassword7 = new javax.swing.JLabel();
    jLabelPassword8 = new javax.swing.JLabel();
    jLabelPassword9 = new javax.swing.JLabel();
    jtxtCapacityMod = new javax.swing.JTextField();
    jLabelPassword10 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextAreaDescMod = new javax.swing.JTextArea();
    jComBoxDaysMod = new javax.swing.JComboBox();
    jComBoxInstructorCS = new javax.swing.JComboBox();
    jComBoxDaysMod1 = new javax.swing.JComboBox();
    jComBoxDaysMod2 = new javax.swing.JComboBox();
    jComBoxDeptMod = new javax.swing.JComboBox();
    jComboBox1 = new javax.swing.JComboBox();

    jBtnSubmitMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnSubmitMod.setText("Submit Changes");
    jBtnSubmitMod.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnSubmitModActionPerformed(evt);
      }
    });

    jLabelUsername1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername1.setText("Course Name:");

    jLabelPassword1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword1.setText("Section Number:");

    jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
    jLabel3.setText("Modify Course Section");

    jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername.setText("Course Department:");

    jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword.setText("Number:");

    jBtnBackMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnBackMod.setText("Back To Course Conflicts");
    jBtnBackMod.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnBackModActionPerformed(evt);
      }
    });

    jtxtNumberMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jtxtNameMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jtxtNumberCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jLabelPassword2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword2.setText("Instructor:");

    jLabelPassword5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword5.setText("Credits:");

    jLabelPassword6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword6.setText("Days:");

    jLabelPassword7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword7.setText("Time:");

    jLabelPassword8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword8.setText("Room:");

    jLabelPassword9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword9.setText("Capacity:");

    jtxtCapacityMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jLabelPassword10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword10.setText("Description:");

    jTextAreaDescMod.setColumns(20);
    jTextAreaDescMod.setRows(5);
    jScrollPane1.setViewportView(jTextAreaDescMod);

    jComBoxDaysMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxDaysMod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));

    jComBoxInstructorCS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxInstructorCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Instructor", "Cho, I", "James, Scott" }));

    jComBoxDaysMod1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxDaysMod1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SE 117" }));

    jComBoxDaysMod2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxDaysMod2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:30 - 2:20" }));

    jComBoxDeptMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComBoxDeptMod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept.", "Accounting", "Art", "Biology", "Black Studies", "Col Business & Management", "Communication & Digital Media", "Chemistry", "Computer Info Syst", "Criminal Justice", "Communication", "Computer Science", "Elec & Computer Engr", "Economics", "Education Leadership", "English Lang Program", "English", "Educational Tech & Development", "Engineering Tech Management", "Finance", "French", "Geography", "German", "Gender Studies", "History", "Honors", "Health Sciences", "Japanese", "Kinesiology", "Latin", "Law", "Leadership and Service", "Administrative Science", "Mathematical Sciences", "Mechanical Engr", "Master of Energy & Materials", "Modern Foreign Lang", "Management", "Marketing", "Medical Laboratory Science", "Music Education", "Music", "Natural Science", "Nursing", "Occupational Therapy", "Philosophy", "Physics", "Political Science", "Psychology", "Robert Fellows Seminar", "Rhetoric & Prof Writing", "Sociology", "Spanish", "Social Work", "Teaching Chinese As a Foreign", "Teacher Education--Mis/Sec Sch", "Teacher Education", "Theater", "Youth Services" }));

    jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
    jComboBox1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jComboBox1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelUsername)
                  .addComponent(jComBoxDeptMod, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelPassword)
                  .addComponent(jtxtNumberMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelPassword2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jComBoxInstructorCS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(51, 51, 51)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jtxtNumberCS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelPassword1))))
            .addGap(39, 39, 39)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelUsername1)
              .addComponent(jtxtNameMod, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPassword5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jComBoxDaysMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword6))
            .addGap(58, 58, 58)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelPassword7)
              .addComponent(jComBoxDaysMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(58, 58, 58)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelPassword8)
              .addComponent(jComBoxDaysMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(57, 57, 57)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jtxtCapacityMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword9)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabelPassword10)
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBtnSubmitMod)
                .addGap(18, 18, 18)
                .addComponent(jBtnBackMod)
                .addGap(0, 0, Short.MAX_VALUE)))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addGap(38, 38, 38)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelUsername)
          .addComponent(jLabelPassword)
          .addComponent(jLabelUsername1))
        .addGap(1, 1, 1)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComBoxDeptMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtxtNumberMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtxtNameMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelPassword1)
          .addComponent(jLabelPassword2)
          .addComponent(jLabelPassword5))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jtxtNumberCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxInstructorCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelPassword6)
          .addComponent(jLabelPassword7)
          .addComponent(jLabelPassword8)
          .addComponent(jLabelPassword9))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jComBoxDaysMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxDaysMod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jComBoxDaysMod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jtxtCapacityMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(36, 36, 36)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabelPassword10)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(37, 37, 37)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnSubmitMod)
          .addComponent(jBtnBackMod))
        .addContainerGap(72, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jBtnSubmitModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitModActionPerformed
    JOptionPane.showMessageDialog(null, "Course has been created");
    CSMS.switchTo("COURSE LISTING");
  }//GEN-LAST:event_jBtnSubmitModActionPerformed

  private void jBtnBackModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackModActionPerformed
    int result = JOptionPane.showConfirmDialog(null,
      "Are you sure you wish to go back?", null, JOptionPane.YES_NO_OPTION);
    if(result == JOptionPane.YES_OPTION) {
      CSMS.switchTo("COURSE LISTING");
    }
  }//GEN-LAST:event_jBtnBackModActionPerformed

  private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jComboBox1ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnBackMod;
  private javax.swing.JButton jBtnSubmitMod;
  private javax.swing.JComboBox jComBoxDaysMod;
  private javax.swing.JComboBox jComBoxDaysMod1;
  private javax.swing.JComboBox jComBoxDaysMod2;
  private javax.swing.JComboBox jComBoxDeptMod;
  private javax.swing.JComboBox jComBoxInstructorCS;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelPassword;
  private javax.swing.JLabel jLabelPassword1;
  private javax.swing.JLabel jLabelPassword10;
  private javax.swing.JLabel jLabelPassword2;
  private javax.swing.JLabel jLabelPassword5;
  private javax.swing.JLabel jLabelPassword6;
  private javax.swing.JLabel jLabelPassword7;
  private javax.swing.JLabel jLabelPassword8;
  private javax.swing.JLabel jLabelPassword9;
  private javax.swing.JLabel jLabelUsername;
  private javax.swing.JLabel jLabelUsername1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextAreaDescMod;
  private javax.swing.JTextField jtxtCapacityMod;
  private javax.swing.JTextField jtxtNameMod;
  private javax.swing.JTextField jtxtNumberCS;
  private javax.swing.JTextField jtxtNumberMod;
  // End of variables declaration//GEN-END:variables
}
