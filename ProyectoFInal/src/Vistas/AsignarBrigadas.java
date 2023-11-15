
package Vistas;

import Data.BrigadaData;
import Data.CuartelData;
import Data.SiniestroData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AsignarBrigadas extends javax.swing.JInternalFrame {
    CuartelData cd = new CuartelData();
    BrigadaData bd = new BrigadaData();
    SiniestroData sd = new SiniestroData();
        private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AsignarBrigadas() {
        initComponents();
        listarCuarteles();
        listarBrigadas();
        armarCabecera();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jCuartel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCBrigada = new javax.swing.JComboBox<>();
        jBDistancias = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLDistancias = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Siniestros");

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

        jLabel2.setText("Cuartel");

        jLabel3.setText("Brigada");

        jBDistancias.setText("Distancia del cuartel");
        jBDistancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDistanciasActionPerformed(evt);
            }
        });

        jButton2.setText("ASIGNAR BRIGADA");

        jLDistancias.setText("asda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBDistancias)
                                .addGap(18, 18, 18)
                                .addComponent(jLDistancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(62, 62, 62)
                                .addComponent(jCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel3)))
                        .addGap(60, 60, 60)
                        .addComponent(jCBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton2)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDistancias)
                    .addComponent(jLDistancias))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBDistanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDistanciasActionPerformed
//        Cuartel cuartel = (Cuartel)jCuartel.getSelectedItem();
        jLDistancias.setText("El cuartel esta a: ");
    }//GEN-LAST:event_jBDistanciasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDistancias;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jCBrigada;
    private javax.swing.JComboBox<Cuartel> jCuartel;
    private javax.swing.JLabel jLDistancias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

 private void listarCuarteles(){
        List<Cuartel> cuarteles = new ArrayList();
        cuarteles = cd.listarCuarteles();
        for(Cuartel c : cuarteles){
             jCuartel.addItem(c);
        }
    }
 
 private void listarBrigadas(){
     Cuartel cuartelSeleccionado = (Cuartel) jCuartel.getSelectedItem();
     List<Brigada> brigadas = new ArrayList();
     brigadas = (ArrayList) bd.listarBrigadasporCuartel(cuartelSeleccionado);
     for(Brigada b : brigadas){
         if (b.isLibre()==true) {
             jCBrigada.addItem(new Object[]{b.getCodBrigada()+"-"+b.getNombre_br()});
         }
         
     }
 }

 private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Tipo");
        modelo.addColumn("X");
        modelo.addColumn("Y");
        modelo.addColumn("Detalles");

        jTable1.setModel(modelo);
    }


private void llenarTabla(){
    List<Siniestro> siniestrosIn = sd.listarSiniestrosNOResueltos();
    modelo.setRowCount(0);
    for (Siniestro s :siniestrosIn ) {
        modelo.addRow(new Object[]{s.getCodigo(),s.getTipo(),s.getCoord_X(),s.getCoord_Y(),s.getDetalle()});
    }
}




}
