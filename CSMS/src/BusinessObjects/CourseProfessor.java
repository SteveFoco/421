package BusinessObjects;

import java.sql.Timestamp;

public class CourseProfessor
{
  public int id;
  public int cs_id;
  public int prof_id;
  public Timestamp created_at;
  public Timestamp updated_at;
  
  public CourseProfessor(int cs_id, int prof_id) {
    
    this.cs_id = cs_id;
    this.prof_id = prof_id;
    
  }
}
