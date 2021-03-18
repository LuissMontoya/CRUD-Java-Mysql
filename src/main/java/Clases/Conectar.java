
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
    
/**
 *
 * @author Luiss
 */
public class Conectar {
    
   Connection cn;
   
   public Connection conexion(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           cn = DriverManager.getConnection("jdbc:mysql://localhost/work","root","55555");
           System.out.println("Conectado");
       
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
   return cn;
   }
    
    
    
}
