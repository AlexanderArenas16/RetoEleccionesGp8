
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;


 
public class ClsJdbc {
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenia = "";
    String bd = "elecciones";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    public Connection conexion;
    
    public void CrearConnexion() {
        try {
            Class.forName(driver);
            this.conexion =  DriverManager.getConnection(url, usuario, contrasenia);
            
            if (this.conexion != null){
                System.out.println("Conexión exitosa");
            }
        }catch(Exception error){
            System.out.println("Ocuriro error en la conexión " + error.getMessage());
        } 
    }

    public void CrearConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

