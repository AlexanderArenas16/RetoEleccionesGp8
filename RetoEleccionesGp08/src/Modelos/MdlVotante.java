/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.*;
import java.util.LinkedList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author arena
 */
public class MdlVotante {
    
    ClsJdbc jdbc;

    public MdlVotante() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    public LinkedList<ClsVotante>ObtenerVotantes(){
        
        LinkedList<ClsVotante> lista = new LinkedList<>();
        
        try{
            String consulta = "SELECT * FROM tbl_votantes";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()){
                
                String cedula = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String direccion = resultados.getString("direccion");
                String tipoDocumento = "C.C";
                
                ClsVotante votante = new ClsVotante(correo, tipoDocumento, cedula, nombre, telefono ,direccion);
                lista.add(votante);
            }
            
            return lista;
            
        } catch(Exception e){
            return lista;
        }
    }
    
    public ClsMensaje agregarVotante(ClsVotante votante){
        
        ClsMensaje mensaje;
        
        try{
            String consulta = "INSERT INTO tbl_votantes VALUES (?, ?, ?, ?, ?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            sentencia.setString(1, votante.getNumeroDocumento());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreoElectronico());
            sentencia.setString(5, votante.getDireccion());
            
            int resultado = sentencia.executeUpdate();
            
            if (resultado >= 1){
                mensaje = new ClsMensaje(ClsMensaje.OK, "Votante se ha creado exitosamente");
                return mensaje;
            } 
            
            return new ClsMensaje(ClsMensaje.ERROR, "Ocurrió un error");
            
        } catch(Exception e){
            return new ClsMensaje(ClsMensaje.ERROR, "Ocurrió un error");
        }
    }
    
    public ClsMensaje eliminarVotante(String id){
        ClsMensaje mensaje;
        
        try{
            String consulta = "DELETE FROM tbl_votantes WHERE id_votante = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            sentencia.setString(1, id);
           
            int resultado = sentencia.executeUpdate();
            
            if (resultado >= 1){
                mensaje = new ClsMensaje(ClsMensaje.OK, "Votante eliminado exitosamente");
                return mensaje;
            } 
            
            return new ClsMensaje(ClsMensaje.ERROR, "Ocurrió un error");
            
        } catch(Exception e){
            return new ClsMensaje(ClsMensaje.ERROR, "Ocurrió un error");
        }
    }
}
