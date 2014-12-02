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
    
    System.out.println(days);
    
    // Save MeetingDay objects
    for (MeetingDay md : days) {
      md.course_section_id = secId;
      db.saveMeetingDay(md);
    }
  }
}
