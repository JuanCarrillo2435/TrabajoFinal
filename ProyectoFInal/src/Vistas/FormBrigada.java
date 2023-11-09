package Vistas;

import Data.BrigadaData;
import Data.CuartelData;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FormBrigada extends javax.swing.JInternalFrame {
    BrigadaData bd = new BrigadaData();
    CuartelData cd = new CuartelData();

    public FormBrigada() {
        initComponents();
        listarCuarteles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCespecializacion = new javax.swing.JComboBox<>();
        jTnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCuartel = new javax.swing.JComboBox<>();
        jBcrear = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nombre Brigada");

        jLabel2.setText("Especialiizacion");

        jCespecializacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incendios en viviendas e industrias", "Salvamento en derrumbes", "Rescates en ámbito montaña", "Rescate de personas atrapadas en accidentes de tráfico", "Socorrer inundaciones", "Operativos de prevención." }));

        jLabel3.setText("Cuartel");

        jBcrear.setText("Crear Brigada");
        jBcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCespecializacion, 0, 1, Short.MAX_VALUE)
                            .addComponent(jTnombre)
                            .addComponent(jCuartel, 0, 223, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jBcrear)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCespecializacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jBcrear)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcrearActionPerformed
        Brigada brigada = new Brigada();
        
        brigada.setNombre_br(jTnombre.getText());
        brigada.setEspecialidad((String) jCespecializacion.getSelectedItem());
        brigada.setNro_cuartel((Cuartel)jCuartel.getSelectedItem());
        
        if (jTnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe colcocar un nombre de cuartel");
        
        }else{
            bd.crearBrigada(brigada);
            jTnombre.setText("");
             JOptionPane.showMessageDialog(null, "Brigada creada con exito");
        }
        
    }//GEN-LAST:event_jBcrearActionPerformed

    private void listarCuarteles(){
        List<Cuartel> cuarteles = new ArrayList();
        cuarteles = cd.listarCuarteles();
        for(Cuartel c : cuarteles){
             jCuartel.addItem(new Object[]{"Codigo"+c.getCodCuartel(),c.getNombre_cuartel(),c.getDireccion(),c.getTelefono()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcrear;
    private javax.swing.JComboBox<String> jCespecializacion;
    private javax.swing.JComboBox<Object> jCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables

}

