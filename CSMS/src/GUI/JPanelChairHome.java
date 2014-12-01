/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controllers.GUIController;

/**
 *
 * @author cabro_000
 */
public class JPanelChairHome extends javax.swing.JPanel {

    /**
     * Creates new form JPanelChairHome
     */
    public JPanelChairHome() {
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

    jLabel3 = new javax.swing.JLabel();
    jPanelCMCH = new javax.swing.JPanel();
    jBtnCreateCourseCH = new javax.swing.JButton();
    jBtnEditCourseCH = new javax.swing.JButton();
    jBtnDeleteCourseCH = new javax.swing.JButton();
    jBtnRecentCoursesCH = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jBtnSearchSchedCH = new javax.swing.JButton();
    jBtnGenerateSchedCH = new javax.swing.JButton();
    jBtnVerifySchedCH = new javax.swing.JButton();
    jBtnSchedCH = new javax.swing.JButton();
    jBtnExportSchedCH = new javax.swing.JButton();
    jBtnImportSchedCH = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jBtnAddUserCH = new javax.swing.JButton();
    jBtnDeleteUserCH = new javax.swing.JButton();
    jBtnEditUserCH = new javax.swing.JButton();

    jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabel3.setText("Chairperson hglkhg JKhglkj");

    jPanelCMCH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Course Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N

    jBtnCreateCourseCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnCreateCourseCH.setText("Create Course Section");
    jBtnCreateCourseCH.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnCreateCourseCHActionPerformed(evt);
      }
    });

    jBtnEditCourseCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnEditCourseCH.setText("Edit Course Section");

    jBtnDeleteCourseCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnDeleteCourseCH.setText("Delete Course Section");

    jBtnRecentCoursesCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnRecentCoursesCH.setText("Recently Modified Courses");

    javax.swing.GroupLayout jPanelCMCHLayout = new javax.swing.GroupLayout(jPanelCMCH);
    jPanelCMCH.setLayout(jPanelCMCHLayout);
    jPanelCMCHLayout.setHorizontalGroup(
      jPanelCMCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelCMCHLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanelCMCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanelCMCHLayout.createSequentialGroup()
            .addComponent(jBtnCreateCourseCH)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jBtnEditCourseCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(jPanelCMCHLayout.createSequentialGroup()
            .addComponent(jBtnDeleteCourseCH)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jBtnRecentCoursesCH)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelCMCHLayout.setVerticalGroup(
      jPanelCMCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanelCMCHLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanelCMCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnCreateCourseCH)
          .addComponent(jBtnEditCourseCH))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanelCMCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnDeleteCourseCH)
          .addComponent(jBtnRecentCoursesCH))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Schedule Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N

    jBtnSearchSchedCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnSearchSchedCH.setText("Search Schedule");
    jBtnSearchSchedCH.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnSearchSchedCHActionPerformed(evt);
      }
    });

    jBtnGenerateSchedCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnGenerateSchedCH.setText("Generate Schedule");

    jBtnVerifySchedCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnVerifySchedCH.setText("Verify Schedule");

    jBtnSchedCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnSchedCH.setText("Something Schedule");

    jBtnExportSchedCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnExportSchedCH.setText("Export Schedule");

    jBtnImportSchedCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnImportSchedCH.setText("Import Schedule");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jBtnGenerateSchedCH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jBtnExportSchedCH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jBtnSearchSchedCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jBtnSchedCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jBtnVerifySchedCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jBtnImportSchedCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(64, 64, 64))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnSearchSchedCH)
          .addComponent(jBtnVerifySchedCH))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnGenerateSchedCH)
          .addComponent(jBtnSchedCH))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnExportSchedCH)
          .addComponent(jBtnImportSchedCH))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12))); // NOI18N

    jBtnAddUserCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnAddUserCH.setText("Add User Account");

    jBtnDeleteUserCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnDeleteUserCH.setText("Delete User Account");

    jBtnEditUserCH.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnEditUserCH.setText("Edit User Account");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jBtnEditUserCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jBtnAddUserCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jBtnDeleteUserCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(66, 66, 66))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnAddUserCH)
          .addComponent(jBtnDeleteUserCH))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jBtnEditUserCH)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanelCMCH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanelCMCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jBtnSearchSchedCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSearchSchedCHActionPerformed
    GUIController.switchTo("COURSE SEARCH");
  }//GEN-LAST:event_jBtnSearchSchedCHActionPerformed

  private void jBtnCreateCourseCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCreateCourseCHActionPerformed
    GUIController.switchTo("ADD COURSE");
  }//GEN-LAST:event_jBtnCreateCourseCHActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnAddUserCH;
  private javax.swing.JButton jBtnCreateCourseCH;
  private javax.swing.JButton jBtnDeleteCourseCH;
  private javax.swing.JButton jBtnDeleteUserCH;
  private javax.swing.JButton jBtnEditCourseCH;
  private javax.swing.JButton jBtnEditUserCH;
  private javax.swing.JButton jBtnExportSchedCH;
  private javax.swing.JButton jBtnGenerateSchedCH;
  private javax.swing.JButton jBtnImportSchedCH;
  private javax.swing.JButton jBtnRecentCoursesCH;
  private javax.swing.JButton jBtnSchedCH;
  private javax.swing.JButton jBtnSearchSchedCH;
  private javax.swing.JButton jBtnVerifySchedCH;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanelCMCH;
  // End of variables declaration//GEN-END:variables
}
