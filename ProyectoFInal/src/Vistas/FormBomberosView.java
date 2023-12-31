/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Data.BomberosData;
import Data.BrigadaData;
import Entidades.Bomberos;
import Entidades.Brigada;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Fran
 */
public class FormBomberosView extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    public FormBomberosView() {
        initComponents();
        armarCabecera();
        bucle();
        armarCBbrigadas();
        limpiar();
        
        
    }

//        
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFapellido = new javax.swing.JTextField();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jLocaleChooser2 = new com.toedter.components.JLocaleChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBmodificar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBdarBaja = new javax.swing.JButton();
        jTFdni = new javax.swing.JTextField();
        jTFnombre_ape = new javax.swing.JTextField();
        jTFcelular = new javax.swing.JTextField();
        jDCnacimiento = new com.toedter.calendar.JDateChooser();
        jCBbrigada = new javax.swing.JComboBox<>();
        jBbuscar = new javax.swing.JButton();
        jBcrear = new javax.swing.JButton();
        jRBactivos = new javax.swing.JRadioButton();
        jTFid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTlistabomberos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel9.setText("jLabel9");

        jTextField4.setText("jTextField4");

        jButton4.setText("jButton4");

        jTextField6.setText("jTextField6");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("-Apellido");

        jTFapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFapellidoActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("-DNI");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("-Nombre");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("-Fecha de nacimiento");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("-Celular");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("-Brigada");

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBdarBaja.setText("Dar de baja");
        jBdarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdarBajaActionPerformed(evt);
            }
        });

        jTFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFdniKeyReleased(evt);
            }
        });

        jTFnombre_ape.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFnombre_apeKeyReleased(evt);
            }
        });

        jTFcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFcelularKeyReleased(evt);
            }
        });

        jCBbrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBbrigadaActionPerformed(evt);
            }
        });

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBcrear.setText("Crear");
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });

        jRBactivos.setSelected(true);
        jRBactivos.setText("Activos");
        jRBactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBactivosActionPerformed(evt);
            }
        });

        jTFid.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGap(99, 99, 99)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTFnombre_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBcrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(jBdarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jRBactivos)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBbrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnombre_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDCnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBbrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBdarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBcrear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBactivos))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTlistabomberos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTlistabomberos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTlistabomberosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTlistabomberos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("FORMULARIO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFapellidoActionPerformed

    }//GEN-LAST:event_jTFapellidoActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
// MODIFICAR 
String idString = jTFid.getText();
String nuevodni = jTFdni.getText();
String nuevonombre = jTFnombre_ape.getText();
String nuevocelular = jTFcelular.getText();

try {
    int id = Integer.parseInt(idString);

    // Validar que el DNI sea numérico
    long dni = Long.parseLong(nuevodni);

    // Validar que el nombre solo contenga letras
    if (!nuevonombre.matches("^[a-zA-Z ]+$")) {
        throw new IllegalArgumentException("El nombre debe contener solo letras.");
    }

    // Obtener la fecha de nacimiento
    LocalDate nuevafecha = jDCnacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    // Validar la edad del bombero
    int edad = Period.between(nuevafecha, LocalDate.now()).getYears();
    if (edad < 18 || edad > 60) {
        throw new IllegalArgumentException("El bombero debe tener entre 18 y 60 años.");
    }

    // Validar que el celular sea numérico
    long celular = Long.parseLong(nuevocelular);

    // Resto del código
    BrigadaData brigada = new BrigadaData();
    List<Brigada> buscar2 = brigada.listarBrigadas();

    for (Brigada brii : buscar2) {
        if (brii.getNombre_br().equals(jCBbrigada.getSelectedItem())) {
            Brigada nuevaBrigada = brii;
            Boolean estado = true;

            Bomberos bombero = new Bomberos(id, nuevodni, nuevonombre, nuevafecha, nuevocelular, nuevaBrigada, estado);
            BomberosData databomb = new BomberosData();

            if (chequearBrigadas(bombero) == 5) {
                JOptionPane.showMessageDialog(null, " No se pueden añadir más bomberos a esta brigada.", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (chequearBrigadas(bombero) > 1) {
                JOptionPane.showMessageDialog(null, "Brigada habilitada");
                databomb.actualizarBombero(bombero);
            } else if (chequearBrigadas(bombero) == 0) {
                JOptionPane.showMessageDialog(null, "La brigada aún no está habilitada");
                databomb.actualizarBombero(bombero);
            }

            modelo.setRowCount(0);
            bucle();
            break;
        }
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Error de formato: Asegúrate de ingresar números en los campos de ID, DNI y Celular.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (IllegalArgumentException e) {
    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jTlistabomberosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTlistabomberosMouseClicked
       //obtener elementos de Table


        int filaseleccionada = jTlistabomberos.getSelectedRow();
        if (filaseleccionada != -1) {
            Integer id = (Integer) jTlistabomberos.getValueAt(filaseleccionada, 0);
            String idString = String.valueOf(id);
            String dni=(String) jTlistabomberos.getValueAt(filaseleccionada, 1);
            String nombre=(String) jTlistabomberos.getValueAt(filaseleccionada, 2);
            LocalDate fecha=  (LocalDate) jTlistabomberos.getValueAt(filaseleccionada, 3);
            String celular=(String) jTlistabomberos.getValueAt(filaseleccionada, 4);
            String codigo= (String) jTlistabomberos.getValueAt(filaseleccionada, 5);
            jTFid.setText(idString);
            jTFdni.setText(dni);
            jTFnombre_ape.setText(nombre);

            //cambiar localdate a date
            Date date = java.sql.Date.valueOf(fecha);
            jDCnacimiento.setDate(date);
            jTFcelular.setText(celular);

            // Obtén el valor de la celda correspondiente al combo box
//


//             Encuentra el índice del valor en el modelo del combo box
            for (int i = 0; i < jCBbrigada.getItemCount(); i++) {
            if (codigo.equals(jCBbrigada.getItemAt(i))) {
            // Establece el índice como la selección actual en el combo box
            jCBbrigada.setSelectedIndex(i);
            }
            }
        }
        
    }//GEN-LAST:event_jTlistabomberosMouseClicked

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        // TODO add your handling code here:
//        LIMPIAR CAMPOS
    // Campos de texto
    jTFdni.setText("");
    jTFnombre_ape.setText("");
    jTFcelular.setText("");
    
     // JDateChooser
    jDCnacimiento.setDate(null);  // Establece la fecha en null para borrarla
    
     // JComboBox
    jCBbrigada.setSelectedItem(null);
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBdarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdarBajaActionPerformed
 //DAR DE BAJA
     int filaseleccionada = jTlistabomberos.getSelectedRow();

    if (filaseleccionada >= 0) {
     int id=(Integer) jTlistabomberos.getValueAt(filaseleccionada, 0);
            String dni=(String) jTlistabomberos.getValueAt(filaseleccionada, 1);
            String nombre=(String) jTlistabomberos.getValueAt(filaseleccionada, 2);
            LocalDate fecha=  (LocalDate) jTlistabomberos.getValueAt(filaseleccionada, 3);
            String celular=(String) jTlistabomberos.getValueAt(filaseleccionada, 4);
            String codigo=(String) jTlistabomberos.getValueAt(filaseleccionada, 5);
            boolean estado=(Boolean)jTlistabomberos.getValueAt(filaseleccionada, 6);
        
        BrigadaData brigada = new BrigadaData();
        List<Brigada> buscar2 = brigada.brigadasLibres();
        for (Brigada brii: buscar2) {
            if (brii.getNombre_br().equals(codigo)) {
                Brigada briga = brii;
                        Bomberos bombero = new Bomberos(id, dni, nombre, fecha, celular, briga, estado);
        BomberosData databomb = new BomberosData();
        databomb.bajarBombero(bombero);
        modelo.setRowCount(0);
        bucle();
        break;
            }
    }  }
    }//GEN-LAST:event_jBdarBajaActionPerformed

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed
        try {
    // Validar DNI (debería ser numérico)
    int dniNumero = Integer.parseInt(jTFdni.getText());
    String dni = String.valueOf(dniNumero);

    // Validar nombre (debería ser solo letras)
    String nombre = jTFnombre_ape.getText();
    if (!nombre.matches("[a-zA-Z ]+")) {
        throw new IllegalArgumentException("El nombre debe contener solo letras.");
    }

    // Validar celular (debería ser numérico)
    long celularNumero = Long.parseLong(jTFcelular.getText());
    String celular = String.valueOf(celularNumero);

    // Validar fecha (debería estar entre 18 y 60 años)
    LocalDate fecha = jDCnacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fechaActual = LocalDate.now();
    int edad = Period.between(fecha, fechaActual).getYears();

    if (edad < 18 || edad > 60) {
        throw new IllegalArgumentException("La edad del bombero debe estar entre 18 y 60 años.");
    }
    boolean estado = true;
    // Obtener el valor del combo box
    BrigadaData brigada = new BrigadaData();
    List<Brigada> brigadasLibres = brigada.listarBrigadas();

    // Validar que la brigada seleccionada sea válida
    if (jCBbrigada.getSelectedItem() != null) {
        String nombreBrigadaSeleccionada = jCBbrigada.getSelectedItem().toString();

        boolean brigadaEncontrada = false;
        for (Brigada brii : brigadasLibres) {
            if (brii.getNombre_br().equals(nombreBrigadaSeleccionada)) {
                // Crear y añadir a la tabla
                Bomberos bombero = new Bomberos(dni, nombre, fecha, celular, brii, estado);
                BomberosData databomb = new BomberosData();
                if (chequearBrigadas(bombero)==5) {
                    JOptionPane.showMessageDialog(null, " No se pueden añadir mas bomberos a esta brigada.", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(chequearBrigadas(bombero)>=1){
                    JOptionPane.showMessageDialog(null, "Brigada habilitada");
                    databomb.CrearBombero(bombero);
                }else if(chequearBrigadas(bombero) == 0){
                    JOptionPane.showMessageDialog(null, "La brigada aun no esta habilitada");
                    databomb.CrearBombero(bombero);

                }
                
                

                modelo.setRowCount(0);
                bucle();
                brigadaEncontrada = true;
                break;
            }
        }

        if (!brigadaEncontrada) {
            throw new IllegalArgumentException("La brigada seleccionada no es válida.");
        }
    } else {
        throw new IllegalArgumentException("Selecciona una brigada.");
    }
} catch (NumberFormatException e) {
    // Mostrar mensaje de error al usuario usando JOptionPane
    JOptionPane.showMessageDialog(null, "Error: El DNI o el celular deben ser valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (IllegalArgumentException e) {
    // Mostrar mensaje de error al usuario usando JOptionPane
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jBcrearActionPerformed

    private void jRBactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBactivosActionPerformed
        // TODO add your handling code here:
        modelo.setRowCount(0);
        bucle();
    }//GEN-LAST:event_jRBactivosActionPerformed

    private void jTFdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFdniKeyReleased
        BomberosData bombero = new BomberosData();
              TreeSet<Bomberos> buscabom = bombero.listarBomberos();
              BrigadaData brigada = new BrigadaData();
              List<Brigada> buscar2 = brigada.brigadasLibres();
              modelo.setRowCount(0);
        for(Bomberos bom : buscabom){
            if (bom.getDni().startsWith(jTFdni.getText())) {
                Brigada codbom = bom.getCodBrigada();
                for (Brigada brii: buscar2) {
                    if (brii.getCodBrigada()== codbom.getCodBrigada()) {


                if (jRBactivos.isSelected()) {
                         if (bom.isEstado()==true) {
                             cargarBombero(bom,brii);
                         }
                     }else if(bom.isEstado()==false){
                         cargarBombero(bom,brii);
                     }
                    }
                }
            }
        }

    }//GEN-LAST:event_jTFdniKeyReleased

    private void jTFcelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFcelularKeyReleased
        BomberosData bombero = new BomberosData();  
              TreeSet<Bomberos> buscabom = bombero.listarBomberos();
              BrigadaData brigada = new BrigadaData();
              List<Brigada> buscar2 = brigada.brigadasLibres();
              modelo.setRowCount(0);
        for(Bomberos bom : buscabom){
            if (bom.getCelular().startsWith(jTFcelular.getText())) {
                Brigada codbom = bom.getCodBrigada();
                for (Brigada brii: buscar2) {
                    if (brii.getCodBrigada()== codbom.getCodBrigada()) {
                        
                 
                if (jRBactivos.isSelected()) {
                         if (bom.isEstado()==true) {
                             cargarBombero(bom,brii);
                         }
                     }else if(bom.isEstado()==false){
                         cargarBombero(bom,brii);
                     }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTFcelularKeyReleased

    private void jTFnombre_apeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFnombre_apeKeyReleased
        BomberosData bombero = new BomberosData();  
              TreeSet<Bomberos> buscabom = bombero.listarBomberos();
              BrigadaData brigada = new BrigadaData();
              List<Brigada> buscar2 = brigada.brigadasLibres();
              modelo.setRowCount(0);
        for(Bomberos bom : buscabom){
            if (bom.getNombre_ape().startsWith(jTFnombre_ape.getText())) {
                Brigada codbom = bom.getCodBrigada();
                for (Brigada brii: buscar2) {
                    if (brii.getCodBrigada()== codbom.getCodBrigada()) {
                        
                 
                if (jRBactivos.isSelected()) {
                         if (bom.isEstado()==true) {
                             cargarBombero(bom,brii);
                         }
                     }else if(bom.isEstado()==false){
                         cargarBombero(bom,brii);
                     }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTFnombre_apeKeyReleased

    private void jCBbrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBbrigadaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCBbrigadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBcrear;
    private javax.swing.JButton jBdarBaja;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCBbrigada;
    private com.toedter.calendar.JDateChooser jDCnacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private com.toedter.components.JLocaleChooser jLocaleChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRBactivos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFcelular;
    private javax.swing.JTextField jTFdni;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTextField jTFnombre_ape;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable jTlistabomberos;
    // End of variables declaration//GEN-END:variables

   private void armarCabecera(){
    modelo.addColumn("ID");
    modelo.addColumn("D.N.I");
    modelo.addColumn("Nombre y Apellido");
    modelo.addColumn("fecha de nacimiento");
    modelo.addColumn("celular");
    modelo.addColumn("Cod/Brigada");
    modelo.addColumn("Estado");
    jTlistabomberos.setModel(modelo);
}
    private void bucle(){
        BomberosData bombero = new BomberosData();  
        TreeSet<Bomberos> bomberos = bombero.listarBomberos();
        BrigadaData brigada = new BrigadaData();
        List<Brigada> buscar2 = brigada.listarBrigadas();
        
        for (Bomberos bom : bomberos) {
            Brigada brigas = bom.getCodBrigada();
             for (int i = 0; i < buscar2.size(); i++) {
            Brigada brii = buscar2.get(i);
                 if (brii.getCodBrigada() == brigas.getCodBrigada()) {
                     if (jRBactivos.isSelected()) {
                         if (bom.isEstado()==true) {
                             cargarBombero(bom,brii);
                         }
                     }else if(bom.isEstado()==false){
                         cargarBombero(bom,brii);
                     }
                     
                 }
            }
            
            
    }
    }
     private void cargarBombero (Bomberos bombero, Brigada brigada){
         
        modelo.addRow(new Object[]{bombero.getId_bombero(), bombero.getDni(),bombero.getNombre_ape(),bombero.getFecha_nac(),bombero.getCelular(),brigada.getNombre_br(),bombero.isEstado()});
    }

         private void armarCBbrigadas(){
        // LISTAR BRIGADAS LIBRES
        BrigadaData brigada = new BrigadaData();
        List<Brigada> buscar2 = brigada.listarBrigadas();
    
    if (buscar2 != null) {
        for (int i = 0; i < buscar2.size(); i++) {
            Brigada brii = buscar2.get(i);
            jCBbrigada.addItem(brii.getNombre_br());
        }
    }
    }
         
         private void limpiar(){
                 // Campos de texto
    jTFdni.setText("");
    jTFnombre_ape.setText("");
    jTFcelular.setText("");
    
     // JDateChooser
    jDCnacimiento.setDate(null);  // Establece la fecha en null para borrarla
    
     // JComboBox
    jCBbrigada.setSelectedItem(null);
         }
         
         private int chequearBrigadas(Bomberos bomberoañadir){
        BomberosData bombero = new BomberosData();  
        TreeSet<Bomberos> buscarbom = bombero.listarBomberos();
        int cantidadbom = 0;
        for (Bomberos bom : buscarbom) {
            Brigada bomberoañadirbri = bomberoañadir.getCodBrigada();
            if (bom.isEstado()!= false) {
                    Brigada bomberobri = bom.getCodBrigada();
                if (bomberoañadirbri.getCodBrigada()==bomberobri.getCodBrigada()) {
                cantidadbom ++;
               
            }
            }

        }
        
         return cantidadbom;
         }
}
