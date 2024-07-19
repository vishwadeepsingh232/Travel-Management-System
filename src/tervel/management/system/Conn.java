
package tervel.management.system;

import java.sql.*;
public class Conn {
    
    
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "Java@#hitek");
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
