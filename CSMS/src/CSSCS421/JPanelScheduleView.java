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
public class JPanelScheduleView extends javax.swing.JPanel {

    /**
     * Creates new form JPanelScheduleView
     */
    public JPanelScheduleView() {
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
        jBtnModifySchedMod = new javax.swing.JButton();
        jBtnAddSchedMod = new javax.swing.JButton();
        jLabelSchedMod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCourseListing = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jBtnDeleteSchedMod = new javax.swing.JButton();
        jBtnBackSchedMod = new javax.swing.JButton();
        jBtnLogoutSchedMod = new javax.swing.JButton();

        jBtnModifySchedMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnModifySchedMod.setText("Modify");

        jBtnAddSchedMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnAddSchedMod.setText("Add");

        jLabelSchedMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelSchedMod.setText("0 Courses Found");

        jTableCourseListing.setAutoCreateRowSorter(true);
        jTableCourseListing.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTableCourseListing.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Number", "Name", "Line No.", "Professor", "Days", "Time", "Room", "Students"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCourseListing);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Schedule Modification");

        jBtnDeleteSchedMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnDeleteSchedMod.setText("Delete");

        jBtnBackSchedMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnBackSchedMod.setText("Back");

        jBtnLogoutSchedMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnLogoutSchedMod.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLogoutSchedMod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSchedMod)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnModifySchedMod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnAddSchedMod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnDeleteSchedMod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnBackSchedMod)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBtnLogoutSchedMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSchedMod)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnModifySchedMod)
                    .addComponent(jBtnAddSchedMod)
                    .addComponent(jBtnDeleteSchedMod)
                    .addComponent(jBtnBackSchedMod))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddSchedMod;
    private javax.swing.JButton jBtnBackSchedMod;
    private javax.swing.JButton jBtnDeleteSchedMod;
    private javax.swing.JButton jBtnLogoutSchedMod;
    private javax.swing.JButton jBtnModifySchedMod;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSchedMod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCourseListing;
    // End of variables declaration//GEN-END:variables
}
