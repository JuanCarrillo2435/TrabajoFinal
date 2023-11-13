/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Data.BrigadaData;
import Data.CuartelData;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ListarBrigadas extends javax.swing.JInternalFrame {

    CuartelData cd = new CuartelData();
    BrigadaData bd = new BrigadaData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListarBrigadas() {
        initComponents();
        listarCuarteles();
        armarCabecera();
        cargarBrigadasLibres();
        cargarBrigadasnoLibres();
        borrarFila();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jCuartel = new javax.swing.JComboBox<>();
        jRLibres = new javax.swing.JRadioButton();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Brigadas por cuartel");

        jCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCuartelActionPerformed(evt);
            }
        });

        jRLibres.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRLibres.setText("Libres");
        jRLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRLibresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(jCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jRLibres)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRLibres))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCuartelActionPerformed

            borrarFila();
            cargarBrigadasLibres();
        
    }//GEN-LAST:event_jCuartelActionPerformed

    private void jRLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRLibresActionPerformed
        borrarFila();
        cargarBrigadasLibres();
    }//GEN-LAST:event_jRLibresActionPerformed

    private void listarCuarteles() {
        List<Cuartel> cuarteles = new ArrayList();
        cuarteles = cd.listarCuarteles();
        for (Cuartel c : cuarteles) {
            jCuartel.addItem(c);
        }
    }

    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especialidad");

        jTable1.setModel(modelo);
    }

    private void cargarBrigadasLibres() {
        Cuartel cuartelSeleccionado = (Cuartel) jCuartel.getSelectedItem();
        modelo.setRowCount(0);
        List<Brigada> listarBrigadas = (ArrayList) bd.listarBrigadasporCuartel(cuartelSeleccionado);

        for (Brigada brigada : listarBrigadas) {
            if (jRLibres.isSelected()==true) {
                if (brigada.isLibre()==true) {
                     modelo.addRow(new Object[]{brigada.getCodBrigada(), brigada.getNombre_br(), brigada.getEspecialidad()});
                }
               
            }else if(jRLibres.isSelected() == false){
                if (brigada.isLibre()== false) {
                     modelo.addRow(new Object[]{brigada.getCodBrigada(), brigada.getNombre_br(), brigada.getEspecialidad()});
                }
               
            }

        }

    }
    
        private void cargarBrigadasnoLibres() {
        Cuartel cuartelSeleccionado = (Cuartel) jCuartel.getSelectedItem();
        modelo.setRowCount(0);
        List<Brigada> listaBrigadasLibres = (ArrayList) bd.listarBrigadasporCuartel(cuartelSeleccionado);

        for (Brigada brigada : listaBrigadasLibres) {
            if (brigada.isLibre() == false) {
                modelo.addRow(new Object[]{brigada.getCodBrigada(), brigada.getNombre_br(), brigada.getEspecialidad()});
            }

        }

    }

    private void borrarFila() {
        int ind = modelo.getRowCount() - 1;
        for (int i = ind; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cuartel> jCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRLibres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
