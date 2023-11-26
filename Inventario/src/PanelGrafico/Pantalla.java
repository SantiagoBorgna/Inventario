package PanelGrafico;

import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pantalla extends javax.swing.JFrame {

    public Pantalla() {
        initComponents();
        panelIzquierda.setVisible(false);
        labelEstado.setVisible(false);
        labelMostrarEstado.setVisible(false);
        btnConfirmar.setVisible(false);
        textAlumno.setVisible(false);
        labelBuscarAlumno.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDerecha = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        labelConectar = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelMostrarEstado = new javax.swing.JLabel();
        panelIzquierda = new javax.swing.JPanel();
        labelBuscarAlumno = new javax.swing.JLabel();
        textAlumno = new javax.swing.JTextField();
        labelBuscarLibro = new javax.swing.JLabel();
        textBuscarLibroNombre = new javax.swing.JTextField();
        textBuscarLibroId = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnBuscarLibro = new javax.swing.JButton();
        labelNombreLibro = new javax.swing.JLabel();
        labelIdLibro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConectar.setBackground(new java.awt.Color(255, 0, 0));
        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        labelConectar.setText("Conectarse a la base de datos");

        labelEstado.setText("Estado del libro");

        labelMostrarEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMostrarEstado.setText("Libre/Ocupado");
        labelMostrarEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelConectar)
                .addGap(18, 18, 18))
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMostrarEstado)
                    .addComponent(btnConectar)
                    .addComponent(labelEstado))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(labelEstado)
                .addGap(18, 18, 18)
                .addComponent(labelMostrarEstado)
                .addGap(62, 62, 62))
        );

        labelBuscarAlumno.setText("Buscar alumno");

        labelBuscarLibro.setText("Buscar libro");

        btnConfirmar.setText("Entregar/Recibir");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        labelNombreLibro.setText("Nombre");

        labelIdLibro.setText("ID");

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelIzquierdaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(textBuscarLibroId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnConfirmar))
                            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(labelBuscarLibro))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textBuscarLibroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBuscarAlumno)))))
                    .addGroup(panelIzquierdaLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnBuscarLibro)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBuscarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(21, 21, 21)
                .addComponent(labelBuscarLibro)
                .addGap(31, 31, 31)
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscarLibroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombreLibro))
                .addGap(26, 26, 26)
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBuscarLibroId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdLibro))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarLibro)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        try {
            BaseDatos.BaseDatos.esteblecerConexion();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        panelIzquierda.setVisible(true);
        btnConectar.setEnabled(false);
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        try {
            if(textAlumno.getText().length() != 0){
                StringTokenizer token = new StringTokenizer(textAlumno.getText());
                String nombre = token.nextToken();
                String apellido = token.nextToken();
                
                //asignar libro al alumno o quitarselo
                String estadoActualLibro = labelMostrarEstado.getText();
                switch(estadoActualLibro){
                    case "libre":
                        BaseDatos.BaseDatos.entregarLibro(nombre, apellido);
                        break;
                    case "ocupado":
                        BaseDatos.BaseDatos.recibirLibro(nombre, apellido);
                        break;
                }
                
                //modificar el estado del libro seleccionado 
                if(textBuscarLibroNombre.getText().length() != 0){
                    
                    System.out.println(labelMostrarEstado.getText());
                    BaseDatos.BaseDatos.modificarEstado(textBuscarLibroNombre.getText(), labelMostrarEstado.getText());
                    
                } else if (textBuscarLibroId.getText().length() != 0){
                    
                    String input = textBuscarLibroId.getText();
                    int id = Integer.parseInt(input);
                    BaseDatos.BaseDatos.modificarEstado(id, labelMostrarEstado.getText());
                    System.out.println(labelMostrarEstado.getText());
                }   
            }
            //cerrar conexión con la base de datos
            BaseDatos.BaseDatos.cerrar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("error aca");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        // TODO add your handling code here:
        
        if(textBuscarLibroNombre.getText().length() != 0){
            String titulo = textBuscarLibroNombre.getText();
            
            try {
                String estado = BaseDatos.BaseDatos.buscarLibro(titulo);
                
                labelEstado.setVisible(true);
                
                switch (estado){
                    case "libre":
                        //activar vista del estado del libro
                        labelMostrarEstado.setText("libre");
                        labelMostrarEstado.setVisible(true);
                        //activar vista del buscador de alumno
                        btnConfirmar.setText("Entregar");
                        btnConfirmar.setVisible(true);
                        textAlumno.setVisible(true);
                        labelBuscarAlumno.setVisible(true);
                        break;
                   case "ocupado":
                        labelMostrarEstado.setText("ocupado");
                        labelMostrarEstado.setVisible(true);
                        
                        btnConfirmar.setText("Recibir");
                        btnConfirmar.setVisible(true);
                        textAlumno.setVisible(true);
                        labelBuscarAlumno.setVisible(true);
                        break;
                    default:
                        System.out.println("Ingrese correctamente los datos");
                        break;
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("Libro no encontrado, intente nuevamente");
                labelMostrarEstado.setText("Libro no encontrado, intente nuevamente");
                labelMostrarEstado.setVisible(true);
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Aca hay error 2");
            }
 
        }
        
        if(textBuscarLibroId.getText().length() != 0){
            String input = textBuscarLibroId.getText();
            int id = Integer.parseInt(input);
            //System.out.println(id);
            
            
            try {
                String estado = BaseDatos.BaseDatos.buscarLibro(id);
                
                labelEstado.setVisible(true);
                
                switch (estado){
                    case "libre":
                        //activar vista del estado del libro
                        labelMostrarEstado.setText("libre");
                        labelMostrarEstado.setVisible(true);
                        //activar vista del buscador de alumno
                        btnConfirmar.setText("Entregar");
                        btnConfirmar.setVisible(true);
                        textAlumno.setVisible(true);
                        labelBuscarAlumno.setVisible(true);
                        break;
                   case "ocupado":
                        labelMostrarEstado.setText("ocupado");
                        labelMostrarEstado.setVisible(true);
                        
                        btnConfirmar.setText("Recibir");
                        btnConfirmar.setVisible(true);
                        textAlumno.setVisible(true);
                        labelBuscarAlumno.setVisible(true);
                        break;
                    default:
                        System.out.println("Ingrese correctamente los datos");
                        break;
                }
            }catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("Ingrese un ID válido");
                labelMostrarEstado.setText("Ingrese un ID válido");
                labelMostrarEstado.setVisible(true);
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
                System.out.println("Aca hay error 2");
            }
        }
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Pantalla().setVisible(true);
//            }
//        });
//   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel labelBuscarAlumno;
    private javax.swing.JLabel labelBuscarLibro;
    private javax.swing.JLabel labelConectar;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelIdLibro;
    private javax.swing.JLabel labelMostrarEstado;
    private javax.swing.JLabel labelNombreLibro;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JTextField textAlumno;
    private javax.swing.JTextField textBuscarLibroId;
    private javax.swing.JTextField textBuscarLibroNombre;
    // End of variables declaration//GEN-END:variables
}
