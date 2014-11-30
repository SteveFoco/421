package BusinessObjects;

import java.sql.Time;
import java.sql.Timestamp;

public class MeetingDay
{
  public int id;
  public int course_section_id;
  public String room_number;
  public String day;
  public Time start_time;
  public Time end_time;
  public Timestamp created_at;
  public Timestamp updated_at;
  
  public MeetingDay() {
    
  }
  
  public MeetingDay(int course_section_id, String room_number, String day,
      Time start_time, Time end_time)
  {
    this.course_section_id = course_section_id;
    this.room_number = room_number;
    this.day = day;
    this.start_time = start_time;
    this.end_time = end_time;
  }
}
