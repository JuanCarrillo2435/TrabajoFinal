package Vistas;

import Data.BrigadaData;
import Data.CuartelData;
import Data.SiniestroData;
import Entidades.Brigada;
import Entidades.Cuartel;
import Entidades.Siniestro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AsignarBrigadas extends javax.swing.JInternalFrame {

    Brigada brigadaSeleccionada = null;
    CuartelData cuartelData = null;
    Cuartel cuartelCercano = null;
    SiniestroData asignarBri = null;
    Siniestro sin = null;
    CuartelData cd = new CuartelData();
    BrigadaData bd = new BrigadaData();
    SiniestroData sd = new SiniestroData();
    private int coordX = 0;
    private int coordY = 0;
    private int codigoSiniestroSeleccionado = -1;
    private int codigoBrigada = 0;
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

   public AsignarBrigadas() {
    initComponents();
    borrarFila();
    listarCuarteles();
    listarBrigadas();
    armarCabecera();
    llenarTabla();

    cuartelData = new CuartelData();
    asignarBri = new SiniestroData();  // O cualquier otra forma de inicialización que sea necesaria

    jTable1.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            int selectedRow = jTable1.getSelectedRow();
            int columnCodigo = 0; // Ajusta este índice según la posición de la columna de código en tu modelo de tabla

            if (selectedRow >= 0) {
                // Si hay una fila seleccionada, obtén los valores de esa fila
                codigoSiniestroSeleccionado = (int) jTable1.getValueAt(selectedRow, columnCodigo);
                int columnX = 2; // Ajusta este índice según la posición de la columna X en tu modelo de tabla
                int columnY = 3; // Ajusta este índice según la posición de la columna Y en tu modelo de tabla
                int coordX = (int) jTable1.getValueAt(selectedRow, columnX);
                int coordY = (int) jTable1.getValueAt(selectedRow, columnY);

                cuartelCercano = cuartelData.cuartelCerca(coordX, coordY);
                // Mostrar las coordenadas y el código del siniestro seleccionado
                System.out.println("Coordenadas seleccionadas: X=" + coordX + ", Y=" + coordY);
                System.out.println("Código del siniestro seleccionado: " + codigoSiniestroSeleccionado);
            } else {
                // Si no hay una fila seleccionada, muestra un mensaje indicando que no hay selección
                System.out.println("No hay fila seleccionada");
            }
        }
    });
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
        jButton2 = new javax.swing.JButton();
        jLDistancias = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

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

        jCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCuartelActionPerformed(evt);
            }
        });

        jLabel3.setText("Brigada");

        jButton2.setText("ASIGNAR BRIGADA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular cuartel más cercano");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62)
                        .addComponent(jCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(jCBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jLDistancias, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDistancias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Brigada brigadaSeleccionada = (Brigada) jCBrigada.getSelectedItem();

            if (cuartelCercano != null) {
                asignarBri.asignarBrigadaASiniestro(brigadaSeleccionada, codigoSiniestroSeleccionado);
                JOptionPane.showMessageDialog(null, "Se asignó la brigada al siniestro exitosamente.");
                armarTabla();
                // Resto de tu lógica...

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una brigada de la lista.");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Manejo básico de excepciones. Considera un manejo más robusto en un entorno de producción.
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cuartelData.cuartelCerca(coordX, coordY);
        if (cuartelCercano != null) {

            jLDistancias.setText("Cuartel cercano: " + cuartelCercano.getNombre_cuartel()); // Ajusta según la estructura de tu Cuartel
        } else {
            jLDistancias.setText("No hay cuarteles disponibles.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCuartelActionPerformed
        // TODO add your handling code here:
        listarBrigadas();

    }//GEN-LAST:event_jCuartelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Brigada> jCBrigada;
    private javax.swing.JComboBox<Cuartel> jCuartel;
    private javax.swing.JLabel jLDistancias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void listarCuarteles() {
        List<Cuartel> cuarteles = new ArrayList();
        cuarteles = cd.listarCuarteles();
        for (Cuartel c : cuarteles) {
            jCuartel.addItem(c);
        }
    }

    private void listarBrigadas() {
        jCBrigada.removeAllItems(); // Limpia el combo box antes de agregar nuevos elementos
        Cuartel cuartelSeleccionado = (Cuartel) jCuartel.getSelectedItem();

        if (cuartelSeleccionado != null) {
            List<Brigada> brigadas = bd.listarBrigadasporCuartel(cuartelSeleccionado);

            for (Brigada b : brigadas) {
                if (b.isLibre()) {
                    //jCBrigada.addItem(b.getCodBrigada() + "-" + b.getNombre_br());
                    jCBrigada.addItem(b);
                }
            }
        }
    }

    private void borrarFila() {
        int ind = modelo.getRowCount() - 1;
        for (int i = ind; i >= 0; i--) {
            modelo.removeRow(i);
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

    private void armarTabla() {
        //armarCabecera();
        llenarTabla();
    }

    private void llenarTabla() {
        List<Siniestro> siniestrosIn = sd.listarSiniestrosNOResueltosSinBrigada();
        modelo.setRowCount(0);
        for (Siniestro s : siniestrosIn) {
            modelo.addRow(new Object[]{s.getCodigo(), s.getTipo(), s.getCoord_X(), s.getCoord_Y(), s.getDetalle()});
        }
    }

}
