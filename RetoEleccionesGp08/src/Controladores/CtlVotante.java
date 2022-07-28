/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.*;
import Modelos.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author arena
 */
public class CtlVotante {

    MdlVotante modeloVotante = new MdlVotante();

    public LinkedList<ClsVotante> obtenerVotante() {

        return this.modeloVotante.ObtenerVotantes();
    }

    public ClsMensaje agregarVotante(ClsVotante votante) {

        return this.modeloVotante.agregarVotante(votante);
    }

    public ClsMensaje eliminarVotante(String id) {

        return this.modeloVotante.eliminarVotante(id);
    }

    public ClsMensaje actualizarVotante(ClsVotante votante) {

        return this.modeloVotante.actualizarVotante(votante);
    }
}
