/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.ClsCandidato;
import Clases.ClsEleccion;
import Clases.ClsMensaje;
import Controladores.CtlCandidato;
import Controladores.CtlEleccion;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EQUIPO
 */
public class vistaGestorElecciones extends javax.swing.JFrame {

    JFrame menuPrincipal;
    CtlEleccion controlador;
    CtlCandidato controladorCandidato;

    LinkedList<ClsEleccion> listaElecciones;
    LinkedList<ClsCandidato> listaCandidatos;

    /**
     * Creates new form vistaGestorElecciones
     */
    public vistaGestorElecciones(JFrame menuPrincipal) {
        initComponents();

        this.tablaElecciones.getColumnModel().getColumn(0).setPreferredWidth(200);
        this.tablaElecciones.getColumnModel().getColumn(1).setPreferredWidth(150);
        this.tablaElecciones.getColumnModel().getColumn(2).setPreferredWidth(100);
        this.tablaElecciones.getColumnModel().getColumn(3).setPreferredWidth(100);
        this.tablaElecciones.getColumnModel().getColumn(4).setPreferredWidth(100);
        this.tablaElecciones.getColumnModel().getColumn(5).setPreferredWidth(100);

        this.controlador = new CtlEleccion();
        this.controladorCandidato = new CtlCandidato();
        this.listaElecciones = new LinkedList<>();
        this.listaCandidatos = new LinkedList<>();
        this.obtenerElecciones();
        this.obtenerCandidatos();

        if (menuPrincipal != null) {
            this.menuPrincipal = menuPrincipal;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        campoFechaInicio = new com.toedter.calendar.JDateChooser();
        campoFechaFin = new com.toedter.calendar.JDateChooser();
        campoNombre = new javax.swing.JTextField();
        botonVolverVistaInicial = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botonAsociarCandidato = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboCandidato = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCandidatosEleccion = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonEliminarAsociacion = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaElecciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre de la elección:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fecha inicio:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Fecha fin:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        botonActualizar.setText("Actualizar");
        jPanel1.add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        botonAtras.setText("Atrás");
        jPanel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Categoría:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presidencial", "Camara/Senado", "Municipal" }));
        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 150, -1));
        jPanel1.add(campoFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 140, -1));
        jPanel1.add(campoFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 130, -1));

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        jPanel1.add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, -1));

        botonVolverVistaInicial.setText("Volver");
        botonVolverVistaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverVistaInicialActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolverVistaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 0, 80, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAsociarCandidato.setText("Asociar candidato");
        botonAsociarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsociarCandidatoActionPerformed(evt);
            }
        });
        jPanel2.add(botonAsociarCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Candidato:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        comboCandidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboCandidato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, -1));

        tablaCandidatosEleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tablaCandidatosEleccion);

        jLabel6.setText("Candidatos:");

        jLabel7.setText("Listado elecciones:");

        botonEliminarAsociacion.setText("Eliminar Candidato de elección");
        botonEliminarAsociacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarAsociacionActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");

        tablaElecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Elección", "Fecha inicio", "Fecha fin", "Estado", "Ganador"
            }
        ));
        tablaElecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEleccionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaElecciones);

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(botonEditar)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarAsociacion)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEliminar)
                            .addComponent(botonEditar))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(botonEliminarAsociacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obtenerCandidatos() {

        this.listaCandidatos = this.controladorCandidato.ObtenerCandidatos();
        this.actualizarCombo(this.listaCandidatos);
    }

    private void actualizarCombo(LinkedList<ClsCandidato> lista) {

        DefaultComboBoxModel model = (DefaultComboBoxModel) this.comboCandidato.getModel();
        model.removeAllElements();

        for (ClsCandidato candidato : lista) {
            model.addElement(candidato.getNombre() + "-" + candidato.getNumeroCedula());
        }

        this.comboCandidato.setModel(model);
    }

    private void obtenerElecciones() {

        this.listaElecciones = this.controlador.obtenerElecciones();
        this.actualizarTabla(this.listaElecciones);
    }

    private void actualizarTabla(LinkedList<ClsEleccion> lista) {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaElecciones.getModel();
        modelo.setRowCount(0);

        for (ClsEleccion c : lista) {

            Object[] fila = {
                c.getIdEleccion(),
                c.getDescripcion(),
                c.getFechaInicio(),
                c.getFechaFin(),
                c.getEstado(),
                ""
            };

            modelo.addRow(fila);

        }

    }

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        String nombre = this.campoNombre.getText();
        String categoria = this.comboCategoria.getSelectedItem().toString();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicio = formato.format(this.campoFechaInicio.getDate());
        String fechaFin = formato.format(this.campoFechaFin.getDate());

        String[] arrayFecha = fechaInicio.split("-");
        String idEleccion = arrayFecha[0] + "-" + categoria;

        ClsEleccion eleccionNueva = new ClsEleccion(idEleccion, nombre, fechaInicio, fechaFin, categoria);

        ClsMensaje mensaje = this.controlador.agregarEleccion(eleccionNueva);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void botonEliminarAsociacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAsociacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarAsociacionActionPerformed

    private void botonAsociarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsociarCandidatoActionPerformed

        int columna = 0;
        int fila = this.tablaElecciones.getSelectedRow();
        String idEleccion = this.tablaElecciones.getValueAt(fila, columna).toString();

        String[] partesComboCandidato = this.comboCandidato.getSelectedItem().toString().split("-");
        String idCandidato = partesComboCandidato[1];

        ClsMensaje mensaje = this.controlador.asociarCandidato(idCandidato, idEleccion);

        if (mensaje.getTipo().equals(ClsMensaje.OK)) {
            this.obtenerCandidatosPorEleccion(idEleccion);
        }
    }//GEN-LAST:event_botonAsociarCandidatoActionPerformed

    private void tablaEleccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEleccionesMouseClicked
        int columna = 0;
        int fila = this.tablaElecciones.getSelectedRow();
        String idEleccion = this.tablaElecciones.getValueAt(fila, columna).toString();
        this.obtenerCandidatosPorEleccion(idEleccion);
    }//GEN-LAST:event_tablaEleccionesMouseClicked

    private void botonVolverVistaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverVistaInicialActionPerformed

        this.setVisible(false);
        this.menuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonVolverVistaInicialActionPerformed

    private void obtenerCandidatosPorEleccion(String idEleccion) {

        LinkedList<ClsCandidato> candidatos = this.controlador.obtenerCandidatosEleccion(idEleccion);
        this.actualizarTablaCandidatos(candidatos);

    }

    private void actualizarTablaCandidatos(LinkedList<ClsCandidato> lista) {
        DefaultTableModel modelo = (DefaultTableModel) this.tablaCandidatosEleccion.getModel();
        modelo.setRowCount(0);

        for (ClsCandidato c : lista) {

            Object[] fila = {
                c.getNumeroCedula(),
                c.getNombre()
            };

            modelo.addRow(fila);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaGestorElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaGestorElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaGestorElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaGestorElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaGestorElecciones(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAsociarCandidato;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEliminarAsociacion;
    private javax.swing.JButton botonVolverVistaInicial;
    private com.toedter.calendar.JDateChooser campoFechaFin;
    private com.toedter.calendar.JDateChooser campoFechaInicio;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> comboCandidato;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaCandidatosEleccion;
    private javax.swing.JTable tablaElecciones;
    // End of variables declaration//GEN-END:variables
}
