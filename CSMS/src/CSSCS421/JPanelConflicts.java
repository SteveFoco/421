/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CSSCS421;

import javax.swing.JOptionPane;

/**
 *
 * @author Steve
 */
public class JPanelConflicts extends javax.swing.JPanel {

    /**
     * Creates new form JPanelConflicts
     */
    public JPanelConflicts() {
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

    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabelConflicts = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jBtnBackSS = new javax.swing.JButton();
    jBtnManual = new javax.swing.JButton();
    jBtnAutomatic = new javax.swing.JButton();

    jPanel1.setPreferredSize(new java.awt.Dimension(731, 401));

    jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
    jLabel3.setText("Conflict Resolution");

    jLabelConflicts.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
    jLabelConflicts.setText("2 Conflicts Found");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {"CS216",  new Integer(1), "WI/15", "CS116*1"},
        {"CS116",  new Integer(1), "WI/15", "CS216*1"}
      },
      new String [] {
        "Course", "Section", "Term", "Conflicts"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }
    });
    jScrollPane2.setViewportView(jTable1);

    jBtnBackSS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnBackSS.setText("Back");
    jBtnBackSS.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnBackSSActionPerformed(evt);
      }
    });

    jBtnManual.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnManual.setText("Resolve Conflicts Manually");
    jBtnManual.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnManualActionPerformed(evt);
      }
    });

    jBtnAutomatic.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnAutomatic.setText("Resolve Conflicts Automatically");
    jBtnAutomatic.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnAutomaticActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabelConflicts)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBtnBackSS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnManual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnAutomatic)))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabelConflicts)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnBackSS)
          .addComponent(jBtnManual)
          .addComponent(jBtnAutomatic))
        .addGap(33, 33, 33))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jBtnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnManualActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jBtnManualActionPerformed

  private void jBtnAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAutomaticActionPerformed
    CSMS.switchTo("REQUIRED CHANGES");
  }//GEN-LAST:event_jBtnAutomaticActionPerformed

  private void jBtnBackSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackSSActionPerformed
    CSMS.switchTo("CHOOSE SCHEDULE");
  }//GEN-LAST:event_jBtnBackSSActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnAutomatic;
  private javax.swing.JButton jBtnBackSS;
  private javax.swing.JButton jBtnManual;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelConflicts;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
