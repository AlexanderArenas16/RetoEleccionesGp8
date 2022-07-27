/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsEleccion;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.util.LinkedList;

/**
 *
 * @author EQUIPO
 */
public class MdlEleccion {
    
    ClsJdbc jdbc;
    
    public MdlEleccion(){
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConnexion();
    }
    
    public ClsMensaje agregarEleccion (ClsEleccion eleccion){
        
        ClsMensaje mensaje;
        
        try{
            String sql = "INSERT INTO tbl_elecciones VALUES (?, ?, ?, ?, ?, NOW(), 'abierta')";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, eleccion.getIdEleccion());
            sentencia.setString(2, eleccion.getDescripcion());
            sentencia.setString(3, eleccion.getCategoria());
            sentencia.setString(4, eleccion.getFechaInicio());
            sentencia.setString(5, eleccion.getFechaFin());
            
            int resultado = sentencia.executeUpdate();
            
            if (resultado >= 1){
                mensaje = new ClsMensaje(ClsMensaje.OK, "La elección se ha creado exitosamente");
                return mensaje;
            } 
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrió un error");
            return mensaje;
        }catch (Exception exception){
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrió un error");
            return mensaje;
        }
        
    }
    
    
//    public LinkedList <ClsEleccion> obtenerElecciones(){
//        
//        try {
//            LinkedList<ClsEleccion> lista = new LinkedList<>();
//            
//            String consulta = "SELECT * FROM tbl_elecciones";
//            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
//            ResultSet resultados = sentencia.executeQuery();
//            
//            while (resultados.next()){
//                
//                String idEleccion = resultados.getString("id_eleccion");
//                String descripcion = resultados.getString("descripcion");
//                String categoria = resultados.getString("categoria");
//                String fechaInicio = resultados.getString("fecha_inicio");
//                String fechaFin = resultados.getString("fecha_fin");
//                String estado = resultados.getString("estado");
//                
//                ClsEleccion eleccion = new ClsEleccion(idEleccion, descripcion, fechaInicio, fechaFin, categoria);
//                
//                eleccion.setEstado(estado);
//            }
//            return
//            
//        }
//    }
    
}
