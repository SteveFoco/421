package Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Caleb
 */
public class DatabasePinger {
  private Connection conn;
  private Statement st;
  private boolean closed;
  private Timer timer;
  
  public DatabasePinger(Connection conn) {
    this.conn = conn;
    this.timer = new Timer();
  }
  
  public void setClosed(boolean closed) {
    boolean oldValue = this.closed;
    
    this.closed = closed;
  }
  
  public boolean getClosed() {
    return closed;
  }
  
  /**
   * Ping the database every 30 seconds.
   */
  public void ping() {
    timer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        try {
          conn.isValid(10);
        } catch (SQLException ex) {
          System.err.println(ex);
        }
      }
    }, 30 * 1000, 30 * 1000);
  }
}
