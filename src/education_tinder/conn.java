
package education_tinder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conn {
    
    private Connection  conn;
    private Statement statement;
    
    public Connection openConnection() throws SQLException
    {
        if(conn == null)
        {
            String url = "jdbc:mysql://localhost/";
            String dbName = "iiit";
            String driver = "com.mysql.jdbc.Driver";
            String username = "root";
            String password = "";
            
            try
            {
                Class.forName(driver);
                this.conn = (Connection)DriverManager.getConnection(url+dbName, username, password);
                System.out.println("CONNECTION SUCCESSFUL  !");
            
            }
            catch (ClassNotFoundException | SQLException sqle)
            {
                
                System.out.println("CONNECTION UNSUCCESSFUL  !");
            
            }
        }
        
        return conn;
    }
    
}
