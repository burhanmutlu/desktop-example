
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String VERITABANI_ISMI = "sweet_bank";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    protected Connection connection = null;
    protected Statement statement = null;
    
    public DbConnection() {
        
        String url = "jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.VERITABANI_ISMI;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            this.connection = DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("Bağlantı Başarılı :)");
        } catch (SQLException e) {
            System.out.println("Bağlantı Başarısız :(");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
    public Connection getConnection() {
        return connection;
    }
        
    }
