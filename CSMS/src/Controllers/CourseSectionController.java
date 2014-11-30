package Controllers;

import BusinessObjects.CourseSection;
import BusinessObjects.MeetingDay;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Calendar;


public class CourseSectionController {
  
  DBMgr db = new DBMgr();
  
  public CourseSectionController() {
    
  }
  
  public void addCourseSection(CourseSection section, MeetingDay [] days) {
    Calendar cal = Calendar.getInstance();
    
    // Save CourseSection object
    ResultSet rs = db.saveCourseSection(section);
    int secId = 0;
    
    try {
      rs.next();
      secId = rs.getInt(1);
    } catch (SQLException ex) {
      System.out.println(ex);
    }
    
    // Save MeetingDay objects
    MeetingDay day = new MeetingDay();
    
    day.course_section_id = secId;
    day.room_number = "SE117";
    day.day = "M";
    day.start_time = new Time(cal.getTimeInMillis());
    day.end_time = new Time(cal.getTimeInMillis());
    
    db.saveMeetingDay(day);
    
//    for(MeetingDay md : days) {
//      md.course_section_id = secId;
//      db.saveMeetingDay(md);
//    }
    
    // Return all course sections from database table
  }
}
