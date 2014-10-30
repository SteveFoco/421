/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CSSCS421;

/**
 *
 * @author steev_000
 */
public class JPanelHeader extends javax.swing.JPanel {

  /**
   * Creates new form JPanelHeader
   */
  public JPanelHeader() {
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

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jBtnLogoutCS = new javax.swing.JButton();

    setBackground(new java.awt.Color(0, 204, 255));
    setPreferredSize(new java.awt.Dimension(600, 100));

    jLabel1.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
    jLabel1.setText("Coursepresso");

    jLabel2.setFont(new java.awt.Font("Script MT Bold", 0, 28)); // NOI18N
    jLabel2.setText("Course scheduling made easy!");

    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSSCS421/SVSU-logo2.gif"))); // NOI18N

    jBtnLogoutCS.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jBtnLogoutCS.setText("Logout");
    jBtnLogoutCS.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnLogoutCSActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(44, 44, 44)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(56, 56, 56)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBtnLogoutCS))
          .addComponent(jLabel2))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jBtnLogoutCS)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel2))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jBtnLogoutCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogoutCSActionPerformed
    CSMS.switchTo("LOGIN");
  }//GEN-LAST:event_jBtnLogoutCSActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnLogoutCS;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  // End of variables declaration//GEN-END:variables
}
