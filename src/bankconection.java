

import static java.lang.Class.forName;
import java.sql.*;

public class bankconection {
    public static Connection connect() throws ClassNotFoundException, SQLException {
       String user = "root";
       String password = "";
       
      String url = "jdbc:mysql://127.0.0.1:3306/bankmanagement?serverTimezone=UTC";
       
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, user, password);
        
      Statement  statement = con.createStatement();
      
      /*
      String query = "SELECT * FROM username";
      ResultSet result = statement.executeQuery(query);
      
      while(result.next())
      {
          String name,pass;
          name = result.getString("name");
          pass = result.getString("password");
          System.out.println(name+" "+pass);
      }
       
      statement.close();
      con.close();
    
*/
   
      /*
      //Write..........
      String query = "INSERT INTO `username`(`name`, `password`) VALUES ('ovi','1900')";
      statement.executeUpdate(query);
      statement.close();
      con.close();
      
     */
     /* 
      //Update..........
      String query = "UPDATE `username` SET `name`='Ovi' WHERE password='1900'";
      statement.executeUpdate(query);
      statement.close();
      con.close();
    */
     
    /* 
     //Delete.........
     String query = "DELETE FROM `username` WHERE password='9090'";
     statement.executeUpdate(query);
     statement.close();
     con.close();
     */       
        return null;
     
    

      
    }
}
