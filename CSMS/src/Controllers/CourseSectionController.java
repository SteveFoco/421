package Controllers;

import BusinessObjects.CourseSection;
import BusinessObjects.MeetingDay;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseSectionController {
  
  DBMgr db = new DBMgr();
  
  public CourseSectionController() {
    
  }
  
  public void addCourseSection(CourseSection section, MeetingDay [] days) {
    // Save CourseSection object
    ResultSet rs = db.saveCourseSection(section);
    int secId = 0;
    
    try {
      rs.next();
      secId = rs.getInt(1);
    } catch (SQLException ex) {
      Logger.getLogger(CourseSectionController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    // Save MeetingDay objects
    for(MeetingDay md : days) {
      md.course_section_id = secId;
      db.saveMeetingDay(md);
    }
  }
}
