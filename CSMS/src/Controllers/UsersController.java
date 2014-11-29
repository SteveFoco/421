package Controllers;

public class UsersController {
  
  DBMgr db = new DBMgr();
  
  public boolean validateLogin(String username, String password) {
    String correctPassword = db.getPassword(username);
    
    return password.equals(correctPassword);
  }
}
