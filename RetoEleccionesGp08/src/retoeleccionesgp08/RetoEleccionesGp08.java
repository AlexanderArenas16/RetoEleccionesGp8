/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retoeleccionesgp08;

import Clases.ClsJdbc;
import Vistas.*;

/**
 *
 * @author arena
 */
public class RetoEleccionesGp08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClsJdbc jdbc = new ClsJdbc();
        jdbc.CrearConexion();
        
        vistaMainMenu vistaInicial = new vistaMainMenu();
        vistaInicial.setVisible(true);
//        vistaGestorElecciones vista = new vistaGestorElecciones();
//        vista.setVisible(true);
        
    }
    
}
