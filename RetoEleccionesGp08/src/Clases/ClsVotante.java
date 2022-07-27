/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author arena
 */
public class ClsVotante extends ClsPersonas{
    private String correoElectronico;

    public ClsVotante(String correoElectronico, String tipoDocumento, String numeroDocumento, String nombre, String telefono, String direccion) {
        super(tipoDocumento, numeroDocumento, nombre, telefono, direccion);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
