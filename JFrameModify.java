/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSSCS421;

/**
 *
 * @author cabro_000
 */
public class JFrameModify extends javax.swing.JFrame {

    /**
     * Creates new form JFrameModify
     */
    public JFrameModify() {
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
        jLabelCourseMod = new javax.swing.JLabel();
        jLabelPassword5 = new javax.swing.JLabel();
        jLabelPassword6 = new javax.swing.JLabel();
        jtxtNumberCS9 = new javax.swing.JTextField();
        jLabelPassword7 = new javax.swing.JLabel();
        jLabelPassword8 = new javax.swing.JLabel();
        jLabelPassword9 = new javax.swing.JLabel();
        jtxtCapacityMod = new javax.swing.JTextField();
        jLabelPassword10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescMod = new javax.swing.JTextArea();
        jBtnLogoutMod = new javax.swing.JButton();
        jComBoxDaysMod = new javax.swing.JComboBox();
        jComBoxInstructorCS = new javax.swing.JComboBox();
        jComBoxDaysMod1 = new javax.swing.JComboBox();
        jComBoxDaysMod2 = new javax.swing.JComboBox();
        jComBoxDeptMod = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnSubmitMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnSubmitMod.setText("Submit Changes");

        jLabelUsername1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelUsername1.setText("Name:");

        jLabelPassword1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword1.setText("Section Number:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Modify Course");

        jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelUsername.setText("Course Department:");

        jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword.setText("Number:");

        jBtnBackMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnBackMod.setText("Back To Listing");

        jLabelPassword2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword2.setText("Instructor:");

        jLabelCourseMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelCourseMod.setText("Modifying: CS 421 Sec 01");

        jLabelPassword5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword5.setText("Credits:");

        jLabelPassword6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword6.setText("Days:");

        jLabelPassword7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword7.setText("Time:");

        jLabelPassword8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword8.setText("Room:");

        jLabelPassword9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword9.setText("Capacity:");

        jLabelPassword10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabelPassword10.setText("Description:");

        jTextAreaDescMod.setColumns(20);
        jTextAreaDescMod.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescMod);

        jBtnLogoutMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtnLogoutMod.setText("Logout");

        jComBoxDaysMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComBoxDaysMod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));

        jComBoxInstructorCS.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComBoxInstructorCS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Instructor", "Cho, I", "James, Scott" }));

        jComBoxDaysMod1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComBoxDaysMod1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Room" }));

        jComBoxDaysMod2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComBoxDaysMod2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Time" }));

        jComBoxDeptMod.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComBoxDeptMod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept.", "Accounting", "Art", "Biology", "Black Studies", "Col Business & Management", "Communication & Digital Media", "Chemistry", "Computer Info Syst", "Criminal Justice", "Communication", "Computer Science", "Elec & Computer Engr", "Economics", "Education Leadership", "English Lang Program", "English", "Educational Tech & Development", "Engineering Tech Management", "Finance", "French", "Geography", "German", "Gender Studies", "History", "Honors", "Health Sciences", "Japanese", "Kinesiology", "Latin", "Law", "Leadership and Service", "Administrative Science", "Mathematical Sciences", "Mechanical Engr", "Master of Energy & Materials", "Modern Foreign Lang", "Management", "Marketing", "Medical Laboratory Science", "Music Education", "Music", "Natural Science", "Nursing", "Occupational Therapy", "Philosophy", "Physics", "Political Science", "Psychology", "Robert Fellows Seminar", "Rhetoric & Prof Writing", "Sociology", "Spanish", "Social Work", "Teaching Chinese As a Foreign", "Teacher Education--Mis/Sec Sch", "Teacher Education", "Theater", "Youth Services" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabelCourseMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnLogoutMod))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPassword1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelPassword2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComBoxInstructorCS, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtNumberMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUsername)
                                            .addComponent(jLabelPassword)
                                            .addComponent(jLabelUsername1))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxtNameMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtxtNumberCS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComBoxDeptMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelPassword10)
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPassword9)
                                    .addComponent(jLabelPassword7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jBtnSubmitMod)
                                        .addGap(30, 30, 30)
                                        .addComponent(jBtnBackMod))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComBoxDaysMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabelPassword8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComBoxDaysMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabelPassword6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComBoxDaysMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabelPassword5)
                                                .addGap(96, 96, 96)
                                                .addComponent(jtxtNumberCS9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jtxtCapacityMod, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 88, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jBtnLogoutMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCourseMod)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername)
                    .addComponent(jComBoxDeptMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jtxtNumberMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername1)
                    .addComponent(jtxtNameMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword1)
                    .addComponent(jtxtNumberCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword2)
                    .addComponent(jComBoxInstructorCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword5)
                    .addComponent(jtxtNumberCS9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword6)
                    .addComponent(jComBoxDaysMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword7)
                    .addComponent(jComBoxDaysMod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword8)
                    .addComponent(jComBoxDaysMod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword9)
                    .addComponent(jtxtCapacityMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSubmitMod)
                    .addComponent(jBtnBackMod))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBackMod;
    private javax.swing.JButton jBtnLogoutMod;
    private javax.swing.JButton jBtnSubmitMod;
    private javax.swing.JComboBox jComBoxDaysMod;
    private javax.swing.JComboBox jComBoxDaysMod1;
    private javax.swing.JComboBox jComBoxDaysMod2;
    private javax.swing.JComboBox jComBoxDeptMod;
    private javax.swing.JComboBox jComBoxInstructorCS;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCourseMod;
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
    private javax.swing.JTextField jtxtNumberCS9;
    private javax.swing.JTextField jtxtNumberMod;
    // End of variables declaration//GEN-END:variables
}
