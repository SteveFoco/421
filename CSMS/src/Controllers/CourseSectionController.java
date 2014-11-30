package Controllers;

import BusinessObjects.CourseSection;
import BusinessObjects.MeetingDay;
import java.sql.ResultSet;

public class CourseSectionController {
  
  DBMgr db = new DBMgr();
  
  public CourseSectionController() {
    
  }
  
  public void addCourseSection(CourseSection section, MeetingDay [] days) {
    // Save CourseSection object
    ResultSet rs = db.saveCourseSection(section);
    rs.next();
    int secId = rs.getInt(1);
    
    // Save MeetingDay objects
    for(MeetingDay md : days) {
      md.course_section_id = secId;
      db.saveMeetingDay(md);
    }
    
    // Return all course sections from database table
  }
}
