/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Controllers.GUIController;
import java.awt.*;
import javax.swing.*;
import BusinessObjects.CourseSection;
import BusinessObjects.MeetingDay;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 *
 * @author Steve
 */
public class JPanelNewSection extends javax.swing.JPanel {
    public JPanelNewSection() {
      initComponents();
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
    jtxtCourseNumber = new javax.swing.JTextField();
    jtxtCourseName = new javax.swing.JTextField();
    jtxtSectionNumber = new javax.swing.JTextField();
    jLabelPassword9 = new javax.swing.JLabel();
    jtxtCapacity = new javax.swing.JTextField();
    jCmbInstructor = new javax.swing.JComboBox();
    jCmbDept = new javax.swing.JComboBox();
    jCmbTerm = new javax.swing.JComboBox();
    jLabelPassword12 = new javax.swing.JLabel();
    jLabelPassword3 = new javax.swing.JLabel();
    jLabelPassword10 = new javax.swing.JLabel();
    jCmbType = new javax.swing.JComboBox();
    jLabelPassword13 = new javax.swing.JLabel();
    jFmtEndDate = new javax.swing.JFormattedTextField();
    jLabelPassword14 = new javax.swing.JLabel();
    jFmtStartDate = new javax.swing.JFormattedTextField();
    jPnlTimes = new javax.swing.JPanel();
    jCmbStartTime1 = new javax.swing.JComboBox();
    jCmbEndTime1 = new javax.swing.JComboBox();
    jCmbRoom1 = new javax.swing.JComboBox();
    jCmbDay1 = new javax.swing.JComboBox();
    jCmbStartTime2 = new javax.swing.JComboBox();
    jCmbEndTime2 = new javax.swing.JComboBox();
    jCmbRoom2 = new javax.swing.JComboBox();
    jCmbDay2 = new javax.swing.JComboBox();
    jCmbStartTime3 = new javax.swing.JComboBox();
    jCmbEndTime3 = new javax.swing.JComboBox();
    jCmbRoom3 = new javax.swing.JComboBox();
    jCmbDay3 = new javax.swing.JComboBox();
    jCmbStartTime4 = new javax.swing.JComboBox();
    jCmbEndTime4 = new javax.swing.JComboBox();
    jCmbRoom4 = new javax.swing.JComboBox();
    jCmbDay4 = new javax.swing.JComboBox();
    jCmbStartTime5 = new javax.swing.JComboBox();
    jCmbEndTime5 = new javax.swing.JComboBox();
    jCmbRoom5 = new javax.swing.JComboBox();
    jCmbDay5 = new javax.swing.JComboBox();
    jLabelPassword7 = new javax.swing.JLabel();
    jLabelPassword11 = new javax.swing.JLabel();
    jLabelPassword6 = new javax.swing.JLabel();
    jLabelPassword8 = new javax.swing.JLabel();

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
    jLabel3.setText("New Course Entry");

    jLabelUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelUsername.setText("Course Department:");

    jLabelPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword.setText("Number:");

    jBtnBackMod.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jBtnBackMod.setText("Back To Course Listing");
    jBtnBackMod.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jBtnBackModActionPerformed(evt);
      }
    });

    jtxtCourseNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jtxtCourseName.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jtxtSectionNumber.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jLabelPassword9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword9.setText("Capacity:");

    jtxtCapacity.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

    jCmbInstructor.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbInstructor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Instructor", "Cho, I", "James, Scott" }));

    jCmbDept.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Dept.", "Accounting", "Art", "Biology", "Black Studies", "Col Business & Management", "Communication & Digital Media", "Chemistry", "Computer Info Syst", "Criminal Justice", "Communication", "Computer Science", "Elec & Computer Engr", "Economics", "Education Leadership", "English Lang Program", "English", "Educational Tech & Development", "Engineering Tech Management", "Finance", "French", "Geography", "German", "Gender Studies", "History", "Honors", "Health Sciences", "Japanese", "Kinesiology", "Latin", "Law", "Leadership and Service", "Administrative Science", "Mathematical Sciences", "Mechanical Engr", "Master of Energy & Materials", "Modern Foreign Lang", "Management", "Marketing", "Medical Laboratory Science", "Music Education", "Music", "Natural Science", "Nursing", "Occupational Therapy", "Philosophy", "Physics", "Political Science", "Psychology", "Robert Fellows Seminar", "Rhetoric & Prof Writing", "Sociology", "Spanish", "Social Work", "Teaching Chinese As a Foreign", "Teacher Education--Mis/Sec Sch", "Teacher Education", "Theater", "Youth Services" }));
    jCmbDept.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbDeptActionPerformed(evt);
      }
    });

    jCmbTerm.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbTerm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Term", "FA14", "WI15" }));

    jLabelPassword12.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword12.setText("Term:");

    jLabelPassword3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword3.setText("Instructor:");

    jLabelPassword10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword10.setText("Type");

    jCmbType.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "LEC", "HYB", "ONL" }));
    jCmbType.setSelectedIndex(0);
    jCmbType.setSelectedItem(jCmbType);

    jLabelPassword13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword13.setText("End Date:");

    jFmtEndDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

    jLabelPassword14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword14.setText("Start Date:");

    jFmtStartDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

    jCmbStartTime1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbStartTime1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:30" }));
    jCmbStartTime1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbStartTime1ActionPerformed(evt);
      }
    });

    jCmbEndTime1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbEndTime1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2:20" }));

    jCmbRoom1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbRoom1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SE 117" }));

    jCmbDay1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDay1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));
    jCmbDay1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbDay1ActionPerformed(evt);
      }
    });

    jCmbStartTime2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbStartTime2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:30" }));
    jCmbStartTime2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbStartTime2ActionPerformed(evt);
      }
    });

    jCmbEndTime2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbEndTime2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2:20" }));

    jCmbRoom2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbRoom2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SE 117" }));

    jCmbDay2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDay2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));

    jCmbStartTime3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbStartTime3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:30" }));
    jCmbStartTime3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbStartTime3ActionPerformed(evt);
      }
    });

    jCmbEndTime3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbEndTime3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2:20" }));

    jCmbRoom3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbRoom3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SE 117" }));

    jCmbDay3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDay3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));

    jCmbStartTime4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbStartTime4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:30" }));
    jCmbStartTime4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbStartTime4ActionPerformed(evt);
      }
    });

    jCmbEndTime4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbEndTime4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2:20" }));

    jCmbRoom4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbRoom4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SE 117" }));

    jCmbDay4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDay4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));

    jCmbStartTime5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbStartTime5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12:30" }));
    jCmbStartTime5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jCmbStartTime5ActionPerformed(evt);
      }
    });

    jCmbEndTime5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbEndTime5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2:20" }));

    jCmbRoom5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbRoom5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SE 117" }));

    jCmbDay5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jCmbDay5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Mon Wed", "Tues Thurs", "Mon Wed Fri" }));

    jLabelPassword7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword7.setText("Start Time:");

    jLabelPassword11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword11.setText("End Time:");

    jLabelPassword6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword6.setText("Day:");

    jLabelPassword8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
    jLabelPassword8.setText("Room:");

    javax.swing.GroupLayout jPnlTimesLayout = new javax.swing.GroupLayout(jPnlTimes);
    jPnlTimes.setLayout(jPnlTimesLayout);
    jPnlTimesLayout.setHorizontalGroup(
      jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlTimesLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPnlTimesLayout.createSequentialGroup()
            .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelPassword8)
                  .addComponent(jCmbRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelPassword7)
                  .addComponent(jCmbStartTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelPassword11)
                  .addComponent(jCmbEndTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18)
            .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jCmbDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword6)))
          .addGroup(jPnlTimesLayout.createSequentialGroup()
            .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jCmbRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addComponent(jCmbStartTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCmbEndTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jCmbDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPnlTimesLayout.createSequentialGroup()
            .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jCmbRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addComponent(jCmbStartTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCmbEndTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jCmbDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPnlTimesLayout.createSequentialGroup()
            .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jCmbRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addComponent(jCmbStartTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCmbEndTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jCmbDay4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPnlTimesLayout.createSequentialGroup()
            .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jCmbRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPnlTimesLayout.createSequentialGroup()
                .addComponent(jCmbStartTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCmbEndTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jCmbDay5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPnlTimesLayout.setVerticalGroup(
      jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPnlTimesLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlTimesLayout.createSequentialGroup()
              .addComponent(jLabelPassword7)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jCmbStartTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPnlTimesLayout.createSequentialGroup()
              .addComponent(jLabelPassword11)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jCmbEndTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPnlTimesLayout.createSequentialGroup()
              .addComponent(jLabelPassword8)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jCmbRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTimesLayout.createSequentialGroup()
            .addComponent(jLabelPassword6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCmbDay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCmbStartTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbEndTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jCmbDay2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCmbStartTime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbEndTime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jCmbDay3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCmbStartTime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbEndTime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jCmbDay4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCmbStartTime5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbEndTime5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jCmbRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jCmbDay5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPnlTimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(58, 58, 58)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabelPassword14)
              .addComponent(jFmtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelPassword13)
              .addComponent(jFmtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(106, 106, 106))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelUsername)
                  .addComponent(jCmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelPassword)
                  .addComponent(jtxtCourseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jCmbInstructor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(28, 28, 28))
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelPassword3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jtxtSectionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelPassword1))))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabelUsername1)
                  .addComponent(jtxtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jCmbTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelPassword12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabelPassword9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jtxtCapacity))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabelPassword10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(144, 144, 144))
                  .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jCmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBtnSubmitMod)
                .addGap(18, 18, 18)
                .addComponent(jBtnBackMod)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabelUsername)
            .addGap(1, 1, 1)
            .addComponent(jCmbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelPassword3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCmbInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelUsername1)
                .addGap(1, 1, 1)
                .addComponent(jtxtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelPassword)
                .addGap(1, 1, 1)
                .addComponent(jtxtCourseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtSectionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabelPassword12)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jCmbTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword9)
                    .addComponent(jLabelPassword10))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        .addGap(18, 18, 18)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabelPassword14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jFmtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelPassword13)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jFmtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jPnlTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(14, 14, 14)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jBtnSubmitMod)
          .addComponent(jBtnBackMod))
        .addContainerGap(65, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
  }// </editor-fold>//GEN-END:initComponents

    private void jBtnSubmitMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitMod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSubmitMod1ActionPerformed

    private void jCmbStartTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbStartTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbStartTime1ActionPerformed

    private void jBtnBackModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBackModActionPerformed
      int result = JOptionPane.showConfirmDialog(null,
        "Are you sure you wish to go back?", null, JOptionPane.YES_NO_OPTION);
      if(result == JOptionPane.YES_OPTION) {
        GUIController.switchTo("COURSE LISTING");
      }
    }//GEN-LAST:event_jBtnBackModActionPerformed

    private void jBtnSubmitModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubmitModActionPerformed

      DateFormat df = new SimpleDateFormat("M/d/yy", Locale.ENGLISH);
      CourseSection section;
      MeetingDay day;
      ArrayList<MeetingDay> days = new ArrayList();

      // Create CourseSection object
      section = new CourseSection();
      section.course_number = jtxtCourseNumber.getText();
      section.section_number = Integer.parseInt(jtxtSectionNumber.getText());
      section.available = true;
      section.capacity = 30;
      section.seats_available = section.capacity;
      section.status = "Open";
      section.term = jCmbTerm.getSelectedItem().toString();
      section.student_count = 0;
      section.type = jCmbType.getSelectedItem().toString();
      
      try
      {
        section.start_date = new java.sql.Date(df.parse(jFmtStartDate.getText()).getTime());
        section.last_date = new java.sql.Date(df.parse(jFmtEndDate.getText()).getTime());
      }
      catch (ParseException ex)
      {
        System.out.println(ex);
      }
      
//      day = new MeetingDay();
//      
//      for(Component c : jPnlTimes.getComponents()) {
//        if (c instanceof JComboBox) { 
//          if (c.getName().contains("jCmbStartTime")) {
//            
//          }
//          
//          if (c.getName().contains("jCmbEndTime")) {
//            
//          }
//                    
//          if (c.getName().contains("jCmbRoom")) {
//            
//          }
//                              
//          if (c.getName().contains("jCmbDay")) {
//            
//          }
//        }
//      }
      
      GUIController.coursesections.addCourseSection(section, null);
      
      JOptionPane.showMessageDialog(null, "Course has been created");
      GUIController.courseListingCard.jTblResults.setModel(GUIController.db.getCourseSections());
      GUIController.switchTo("COURSE LISTING");
    }//GEN-LAST:event_jBtnSubmitModActionPerformed

  private void jCmbStartTime2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCmbStartTime2ActionPerformed
  {//GEN-HEADEREND:event_jCmbStartTime2ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbStartTime2ActionPerformed

  private void jCmbStartTime3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCmbStartTime3ActionPerformed
  {//GEN-HEADEREND:event_jCmbStartTime3ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbStartTime3ActionPerformed

  private void jCmbStartTime4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCmbStartTime4ActionPerformed
  {//GEN-HEADEREND:event_jCmbStartTime4ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbStartTime4ActionPerformed

  private void jCmbStartTime5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCmbStartTime5ActionPerformed
  {//GEN-HEADEREND:event_jCmbStartTime5ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbStartTime5ActionPerformed

  private void jCmbDay1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCmbDay1ActionPerformed
  {//GEN-HEADEREND:event_jCmbDay1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbDay1ActionPerformed

  private void jCmbDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDeptActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jCmbDeptActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnBackMod;
  private javax.swing.JButton jBtnSubmitMod;
  private javax.swing.JComboBox jCmbDay1;
  private javax.swing.JComboBox jCmbDay2;
  private javax.swing.JComboBox jCmbDay3;
  private javax.swing.JComboBox jCmbDay4;
  private javax.swing.JComboBox jCmbDay5;
  private javax.swing.JComboBox jCmbDept;
  private javax.swing.JComboBox jCmbEndTime1;
  private javax.swing.JComboBox jCmbEndTime2;
  private javax.swing.JComboBox jCmbEndTime3;
  private javax.swing.JComboBox jCmbEndTime4;
  private javax.swing.JComboBox jCmbEndTime5;
  private javax.swing.JComboBox jCmbInstructor;
  private javax.swing.JComboBox jCmbRoom1;
  private javax.swing.JComboBox jCmbRoom2;
  private javax.swing.JComboBox jCmbRoom3;
  private javax.swing.JComboBox jCmbRoom4;
  private javax.swing.JComboBox jCmbRoom5;
  private javax.swing.JComboBox jCmbStartTime1;
  private javax.swing.JComboBox jCmbStartTime2;
  private javax.swing.JComboBox jCmbStartTime3;
  private javax.swing.JComboBox jCmbStartTime4;
  private javax.swing.JComboBox jCmbStartTime5;
  private javax.swing.JComboBox jCmbTerm;
  private javax.swing.JComboBox jCmbType;
  private javax.swing.JFormattedTextField jFmtEndDate;
  private javax.swing.JFormattedTextField jFmtStartDate;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabelPassword;
  private javax.swing.JLabel jLabelPassword1;
  private javax.swing.JLabel jLabelPassword10;
  private javax.swing.JLabel jLabelPassword11;
  private javax.swing.JLabel jLabelPassword12;
  private javax.swing.JLabel jLabelPassword13;
  private javax.swing.JLabel jLabelPassword14;
  private javax.swing.JLabel jLabelPassword3;
  private javax.swing.JLabel jLabelPassword6;
  private javax.swing.JLabel jLabelPassword7;
  private javax.swing.JLabel jLabelPassword8;
  private javax.swing.JLabel jLabelPassword9;
  private javax.swing.JLabel jLabelUsername;
  private javax.swing.JLabel jLabelUsername1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPnlTimes;
  private javax.swing.JTextField jtxtCapacity;
  private javax.swing.JTextField jtxtCourseName;
  private javax.swing.JTextField jtxtCourseNumber;
  private javax.swing.JTextField jtxtSectionNumber;
  // End of variables declaration//GEN-END:variables
}
