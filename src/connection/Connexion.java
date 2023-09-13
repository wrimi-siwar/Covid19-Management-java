package connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connexion {
	 
    
    private static Connection con;
    
    public Connexion(){
          try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            con=DriverManager.getConnection("jdbc:oracle:thin:projet/projet@localhost");
           
        } catch (ClassNotFoundException ex) {
            System.out.println("Impossible de charger le driver");
        } catch (SQLException ex) {
            System.out.println("Erreur de connexion");
        }
    }
    
    public static Connection getCn() {
        return con;
    }
}
    