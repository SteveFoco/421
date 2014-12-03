/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Controllers.GUIController;
import javax.swing.*;
import BusinessObjects.CourseSection;
import BusinessObjects.MeetingDay;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.table.TableColumn;
import java.sql.Time;
import java.sql.Date;
import java.sql.SQLException;
/**
 *
 * @author Steve
 */
public class JPanelNewSection extends javax.swing.JPanel {
    private TableColumn startTimeColumn, endTimeColumn, roomColumn, dayColumn;
    private JComboBox timeBox, roomBox, dayBox;
  
    public JPanelNewSection() {

        initComponents();
        
        // Initialize combo boxes for the table's cells
        startTimeColumn = jTblMeetingDays.getColumnModel().getColumn(0);
        endTimeColumn = jTblMeetingDays.getColumnModel().getColumn(1);
        roomColumn = jTblMeetingDays.getColumnModel().getColumn(2);
        dayColumn = jTblMeetingDays.getColumnModel().getColumn(3);
        
        // Set data model for start and end time combo boxes
        timeBox = new JComboBox();
        timeBox.setModel(GUIController.buildTimeComboBox());
        
        // Set data model for room combo box with capacity of rooms at 0
        roomBox = new JComboBox();
        roomBox.setModel(GUIController.buildRoomComboBox(0));
        
        dayBox = new JComboBox();
        dayBox.addItem("");
        dayBox.addItem("M");
        dayBox.addItem("T");
        dayBox.addItem("W");
        dayBox.addItem("TH");
        dayBox.addItem("F");
        dayBox.addItem("S");
        dayBox.addItem("SU");
        
        startTimeColumn.setCellEditor(new DefaultCellEditor(timeBox));
        endTimeColumn.setCellEditor(new DefaultCellEditor(timeBox));
        roomColumn.setCellEditor(new DefaultCellEditor(roomBox));
        dayColumn.setCellEditor(new DefaultCellEditor(dayBox));
    }

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
        jtxtCourseName = new javax.swing.JTextField();
        jtxtSectionNumber = new javax.swing.JTextField();
        jLabelPassword9 = new javax.swing.JLabel();
        jCmbInstructor = new javax.swing.JComboBox();
        jCmbDept = new javax.swing.JComboBox();
        jCmbTerm = new javax.swing.JComboBox();
        jLabelPassword12 = new javax.swing.JLabel();
        jLabelPassword3 = new javax.swing.JLabel();
        jLabelPassword10 = new javax.swing.JLabel();
        jCmbType = new javax.swing.JComboBox();
        jLabelPassword13 = new javax.swing.JLabel();
        jLabelPassword14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblMeetingDays = new javax.swing.JTable();
        jCmbCourseNum = new javax.swing.JComboBox();
        jFmtCapacity = new javax.swing.JFormattedTextField();
        dateChooserStart = new datechooser.beans.DateChooserCombo();
        dateChooserEnd = new datechooser.beans.DateChooserCombo();

        jPanel2.setPreferredSize(new java.awt.Dimension(821, 471));

        jBtnSubmitMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBtnSubmitMod.setText("Submit Course");
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
        jLabel3.setText("New Course Section Entry");

        jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelUsername.setText("Course Department:");

        jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword.setText("Course Number:");

        jBtnBackMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jBtnBackMod.setText("Back To Course Listing");
        jBtnBackMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBackModActionPerformed(evt);
            }
        });

        jtxtCourseName.setEditable(false);
        jtxtCourseName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jtxtSectionNumber.setEditable(false);
        jtxtSectionNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabelPassword9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword9.setText("Capacity:");

        jCmbInstructor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmbInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbInstructorActionPerformed(evt);
            }
        });

        jCmbDept.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmbDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept.", "Accounting", "Art", "Biology", "Black Studies", "Col Business & Management", "Communication & Digital Media", "Chemistry", "Computer Info Syst", "Criminal Justice", "Communication", "Computer Science", "Elec & Computer Engr", "Economics", "Education Leadership", "English Lang Program", "English", "Educational Tech & Development", "Engineering Tech Management", "Finance", "French", "Geography", "German", "Gender Studies", "History", "Honors", "Health Sciences", "Japanese", "Kinesiology", "Latin", "Law", "Leadership and Service", "Administrative Science", "Mathematical Sciences", "Mechanical Engr", "Master of Energy & Materials", "Modern Foreign Lang", "Management", "Marketing", "Medical Laboratory Science", "Music Education", "Music", "Natural Science", "Nursing", "Occupational Therapy", "Philosophy", "Physics", "Political Science", "Psychology", "Robert Fellows Seminar", "Rhetoric & Prof Writing", "Sociology", "Spanish", "Social Work", "Teaching Chinese As a Foreign", "Teacher Education--Mis/Sec Sch", "Teacher Education", "Theater", "Youth Services" }));
        jCmbDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDeptActionPerformed(evt);
            }
        });

        jCmbTerm.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmbTerm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Term", "FA14", "WI15" }));
        jCmbTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTermActionPerformed(evt);
            }
        });

        jLabelPassword12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword12.setText("Term:");

        jLabelPassword3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword3.setText("Instructor:");

        jLabelPassword10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword10.setText("Type:");

        jCmbType.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "LEC", "HYB", "ONL" }));
        jCmbType.setSelectedIndex(0);
        jCmbType.setSelectedItem(jCmbType);

        jLabelPassword13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword13.setText("End Date:");

        jLabelPassword14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPassword14.setText("Start Date:");

        jTblMeetingDays.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Start Time", "End Time", "Room", "Day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblMeetingDays);

        jCmbCourseNum.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jCmbCourseNum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        jCmbCourseNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbCourseNumActionPerformed(evt);
            }
        });

        jFmtCapacity.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###"))));
        jFmtCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCapacityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBtnSubmitMod)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnBackMod))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCmbInstructor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCmbDept, javax.swing.GroupLayout.Alignment.LEADING, 0, 259, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUsername)
                                            .addComponent(jLabelPassword3))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPassword)
                                            .addComponent(jCmbCourseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUsername1)
                                            .addComponent(jtxtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPassword1)
                                            .addComponent(jtxtSectionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPassword9)
                                            .addComponent(jFmtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelPassword10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPassword12)
                                            .addComponent(jCmbTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(122, 122, 122))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 21, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPassword14)
                                    .addComponent(jLabelPassword13))
                                .addGap(174, 174, 174))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dateChooserStart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(dateChooserEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(122, 122, 122))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelUsername)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbCourseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPassword3)
                            .addComponent(jLabelPassword1)
                            .addComponent(jLabelPassword9)
                            .addComponent(jLabelPassword10)
                            .addComponent(jLabelPassword12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCmbInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtSectionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCmbTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFmtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtxtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelPassword)
                                .addComponent(jLabelUsername1))
                            .addGap(25, 25, 25))))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPassword14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooserStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPassword13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooserEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSubmitMod)
                    .addComponent(jBtnBackMod))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSubmitMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitMod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSubmitMod1ActionPerformed

    private void jBtnBackModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackModActionPerformed
      int result = JOptionPane.showConfirmDialog(null,
        "Are you sure you wish to go back?", null, JOptionPane.YES_NO_OPTION);
      if(result == JOptionPane.YES_OPTION) {
        try {
          GUIController.courseListingCard.jTblResults.setModel(GUIController.buildTable());
        } catch (SQLException ex) {
          System.out.println(ex);
        }
        GUIController.switchTo("COURSE LISTING");
      }
    }//GEN-LAST:event_jBtnBackModActionPerformed

    private void jBtnSubmitModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitModActionPerformed
      DateFormat df = new SimpleDateFormat("M/d/yy", Locale.ENGLISH);
      DateFormat tf = new SimpleDateFormat("h:mm a", Locale.ENGLISH);
      CourseSection section;
      ArrayList<MeetingDay> days = new ArrayList();

      // Create CourseSection object
      section = new CourseSection();
      section.course_number = jCmbCourseNum.getSelectedItem().toString();
      section.section_number = Integer.parseInt(jtxtSectionNumber.getText());
      section.available = true;
      section.capacity = Integer.parseInt(jFmtCapacity.getText());
      section.seats_available = section.capacity;
      section.status = "Open";
      section.term = jCmbTerm.getSelectedItem().toString();
      section.student_count = 0;
      section.type = jCmbType.getSelectedItem().toString();
      
      try
      {
        section.start_date = new Date(df.parse(dateChooserStart.getText()).getTime());
        section.last_date = new Date(df.parse(dateChooserEnd.getText()).getTime());
      }
      catch (ParseException ex)
      {
        System.out.println(ex);
      }
      
      // Build meeting day list
      int totalRows = jTblMeetingDays.getRowCount();
      MeetingDay day = new MeetingDay();
      jTblMeetingDays.clearSelection();

      for (int row = 0; row < totalRows; row++) {
        if (jTblMeetingDays.getValueAt(row, 0) != null &&
            jTblMeetingDays.getValueAt(row, 1) != null &&
            jTblMeetingDays.getValueAt(row, 2) != null &&
            jTblMeetingDays.getValueAt(row, 3) != null)
        {
          // Create MeetingDay object
          try {
            day.start_time = new Time(tf.parse(jTblMeetingDays.getValueAt(row, 0).toString()).getTime());
            day.end_time = new Time(tf.parse(jTblMeetingDays.getValueAt(row, 1).toString()).getTime());
          } catch (ParseException ex) {
            System.out.println(ex);
          }
          day.room_number = jTblMeetingDays.getValueAt(row, 2).toString();
          day.day = jTblMeetingDays.getValueAt(row, 3).toString();

          // Save MeetingDay to MeetingDay list
          days.add(day);
        }
      }

      GUIController.coursesections.addCourseSection(section, days.toArray(new MeetingDay[days.size()]));
      
      JOptionPane.showMessageDialog(null, "Course has been created");
      try {
        GUIController.courseListingCard.jTblResults.setModel(GUIController.buildTable());
      } catch (SQLException ex) {
        System.out.println(ex);
      }
      GUIController.switchTo("COURSE LISTING");
    }//GEN-LAST:event_jBtnSubmitModActionPerformed

  private void jCmbTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTermActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbTermActionPerformed

  private void jCmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDeptActionPerformed
    GUIController.buildCourseNumComboBox();
    GUIController.buildProfComboBox();
  }//GEN-LAST:event_jCmbDeptActionPerformed

  private void jCmbCourseNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbCourseNumActionPerformed
    GUIController.buildCourseNameTextBox();
    
    // Get next section number for this course
    CourseSection section = new CourseSection();
    
    section.course_number = jCmbCourseNum.getSelectedItem().toString();
    
    jtxtSectionNumber.setText(GUIController.buildSectionNumberText(section));
  }//GEN-LAST:event_jCmbCourseNumActionPerformed

  private void jCmbInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbInstructorActionPerformed

  }//GEN-LAST:event_jCmbInstructorActionPerformed

  private void jFmtCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCapacityActionPerformed
    // Update room combo box model to list rooms with AT LEAST the specified
    // capacity
    roomBox.setModel(GUIController.buildRoomComboBox(Integer.parseInt(jFmtCapacity.getText())));
    roomColumn.setCellEditor(new DefaultCellEditor(roomBox));
  }//GEN-LAST:event_jFmtCapacityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserEnd;
    private datechooser.beans.DateChooserCombo dateChooserStart;
    private javax.swing.JButton jBtnBackMod;
    private javax.swing.JButton jBtnSubmitMod;
    public javax.swing.JComboBox jCmbCourseNum;
    public javax.swing.JComboBox jCmbDept;
    public javax.swing.JComboBox jCmbInstructor;
    public javax.swing.JComboBox jCmbTerm;
    private javax.swing.JComboBox jCmbType;
    private javax.swing.JFormattedTextField jFmtCapacity;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPassword1;
    private javax.swing.JLabel jLabelPassword10;
    private javax.swing.JLabel jLabelPassword12;
    private javax.swing.JLabel jLabelPassword13;
    private javax.swing.JLabel jLabelPassword14;
    private javax.swing.JLabel jLabelPassword3;
    private javax.swing.JLabel jLabelPassword9;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblMeetingDays;
    public javax.swing.JTextField jtxtCourseName;
    private javax.swing.JTextField jtxtSectionNumber;
    // End of variables declaration//GEN-END:variables
}
