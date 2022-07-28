
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;


public class ClsJdbc {
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenia = "";
    String bd = "bd_elecciones"; //Cambiar nombre de base de datos --> Felipe
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    public Connection conexion;
    
    public void CrearConexion(){ 
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

   
}

