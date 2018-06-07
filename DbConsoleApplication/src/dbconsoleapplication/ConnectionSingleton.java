package dbconsoleapplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionSingleton {
    
    private static Connection connection = null;
    private static ConnectionSingleton INSTANCE = new ConnectionSingleton();
    
    private ConnectionSingleton(){
        try {
            
            Properties properties = new Properties();
            
            InputStream inputStream = new FileInputStream("resources/db.properties");
            properties.load(inputStream);
            
            String username = properties.get("username").toString();
            String hostname = properties.get("hostname").toString();
            String pass = properties.get("pass").toString();
            String dbname = properties.get("dbname").toString();
            String dburl = "jdbc:mysql://" + hostname + "/" + dbname;
         
            connection = DriverManager.getConnection(dburl, username, pass);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConnectionSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        return connection;
    }
}
