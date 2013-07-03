
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionMySQL 
{
   public String db = "sandro";
    public String url = "jdbc:mysql://localhost:3306/"+db;
    public String user = "root";
    public String pass = "sandro123";

    public ConexionMySQL()
    {
    }
    public Connection Conectar()
    {
        Connection link = null;
        try 
        {
            
        //Cargamos el Driver MySQL
        Class.forName("com.mysql.jdbc.Driver");// esto estaba antes org.gjt.mm.mysql.Driver
        //Creamos un enlace hacia la base de datos
        link = DriverManager.getConnection(this.url, this.user, this.pass);
        }     
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.out.println("conexion fallida!!!!");
          
        }
        System.out.println("Se conecto a la base de datos!!!!");
       return link;
       
    } 
}
