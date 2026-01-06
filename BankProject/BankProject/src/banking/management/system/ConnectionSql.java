
package banking.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class ConnectionSql
{
    Connection c;
    Statement s;
    
    public ConnectionSql() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Bo2Om6Ik@a#");
            s = c.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


    
   


 