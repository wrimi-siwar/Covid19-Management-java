package Services;

import connection.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projet.FrmConnection;

public class ServiceConnection {
     public final class MyResult {
    private final int first;
    private final int second;

    public MyResult(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
    	public MyResult loginTest(String login , String password)
	{
		int nbUser = -1;
                int idUser = -1;
		try {
                    Connexion con = new Connexion();
            Statement st = con.getCn().createStatement();
            ResultSet rs = st.executeQuery("select ADMIN,ID from USERS where LOGIN = '" + login + "' and PASSWORD = '" + password + "'");
            while (rs.next())
            {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getInt(2));

             nbUser = rs.getInt(1);
             idUser = rs.getInt(2);}
 
        } catch (SQLException ex) {
            System.out.println("Erreur SQL "+ex.getMessage());
        }
             return new MyResult(nbUser, idUser);
        }

}
