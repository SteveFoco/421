package BusinessObjects;

import java.sql.Date;
import java.sql.Timestamp;

public class CourseSection
{
  public int id;
  public String course_number;
  public int section_number;
  public boolean available;
  public int capacity;
  public int seats_available;
  public String status;
  public String term;
  public int student_count;
  public String type;
  public Date start_date;
  public Date last_date;
  public Timestamp created_at;
  public Timestamp updated_at;
  
  public CourseSection() {
    
  }
  
  public CourseSection(String course_number, int section_number, boolean available, 
      int capacity, int seats_available, String status, String term,
      int student_count, String type, Date start_date, Date last_date)
  {
    this.course_number = course_number;
    this.section_number = section_number;
    this.available = available;
    this.capacity = capacity;
    this.seats_available = seats_available;
    this.status = status;
    this.term = term;
    this.student_count = student_count;
    this.type = type;
    this.start_date = start_date;
    this.last_date = last_date;
  }
  
}
