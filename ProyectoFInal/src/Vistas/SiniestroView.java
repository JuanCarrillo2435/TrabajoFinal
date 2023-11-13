/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.SiniestroData;
import Entidades.Siniestro;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class SiniestroView extends javax.swing.JInternalFrame {

    SiniestroData siniestro = new SiniestroData();
    private Siniestro siniestroActual = null;

    public SiniestroView() {
        initComponents();
        siniestroActual = new Siniestro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextDetalle = new javax.swing.JTextField();
        jTextX = new javax.swing.JTextField();
        jTextY = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JtHora = new javax.swing.JFormattedTextField();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Detalle:");

        jLabel2.setText("Hora de siniestro");

        jLabel3.setText("Fecha de siniestro");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Siniestros");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incendios en viviendas e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención." }));

        jLabel6.setText("Coord X");

        jLabel7.setText("Coord Y");

        try {
            JtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton4.setText("Validar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jBLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextX))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextY, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBGuardar)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBGuardar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (ValidarHora(JtHora.getText()) == true) {
            JOptionPane.showMessageDialog(this, "Hora correcta");
        } else {
            JOptionPane.showMessageDialog(this, "Hora incorrecta");

        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
        siniestroActual.setTipo((String) jComboBox1.getSelectedItem());

// Obtener la fecha del JDateChooser
        java.util.Date fechaSeleccionada = calendario.getDate();
        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Error: Debe seleccionar una fecha.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método
        }
        Instant instant = fechaSeleccionada.toInstant();
        LocalDate fechaSiniestro = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        siniestroActual.setFecha_siniestro(LocalDateTime.of(fechaSiniestro, LocalTime.MIDNIGHT));

// Obtener la hora del JFormattedTextField
        // Obtener la hora del JFormattedTextField
        String horaString = JtHora.getText().trim(); // Elimina espacios en blanco al inicio y al final
        if (horaString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar una hora.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        try {
            LocalTime horaSiniestro = LocalTime.parse(horaString, formatter);
            // Actualizar solo la hora en la instancia existente de LocalDateTime
            siniestroActual.setFecha_siniestro(siniestroActual.getFecha_siniestro().withHour(horaSiniestro.getHour()).withMinute(horaSiniestro.getMinute()));
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Error: Formato de hora incorrecto. Debe ingresar la hora en formato HH:mm.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método
        }

// Corregir el manejo de las coordenadas
        try {
            int coordX = Integer.parseInt(jTextX.getText());
            int coordY = Integer.parseInt(jTextY.getText());
            siniestroActual.setCoord_X(coordX);
            siniestroActual.setCoord_Y(coordY);
        } catch (NumberFormatException e) {
            // Manejar el error si el texto no es un número entero
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos para las coordenadas.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método para evitar asignar valores incorrectos
        }

// Verificar que se haya ingresado un detalle
        String detalle = jTextDetalle.getText();
        if (detalle.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar el detalle del siniestro.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método
        }

        siniestroActual.setDetalle(detalle);
        siniestro.crearSiniestro(siniestroActual);
        JOptionPane.showMessageDialog(this, "Siniestro creado con éxito");


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
                                                  
    // Limpiar campos
    jTextDetalle.setText("");
    jTextX.setText("");
    jTextY.setText("");
    JtHora.setText("");
    calendario.setDate(null); // Establecer la fecha en null para limpiar el JDateChooser
    jComboBox1.setSelectedIndex(0); // Establecer el índice seleccionado en 0 (o cualquier valor predeterminado que desees)

    // Otros campos específicos que puedas tener en tu interfaz de usuario

    // También puedes reiniciar el objeto siniestroActual si es necesario
    siniestroActual = new Siniestro();


    }//GEN-LAST:event_jBLimpiarActionPerformed

    public boolean ValidarHora(String Hora) {
        boolean b;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(":");
        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ') || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField JtHora;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextDetalle;
    private javax.swing.JTextField jTextX;
    private javax.swing.JTextField jTextY;
    // End of variables declaration//GEN-END:variables
}
