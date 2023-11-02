package Data;

import Conexiones.Conexion;
import Entidades.Siniestro;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SiniestroData {
    
      private Connection con = null;


    public SiniestroData() {
        
        con= Conexion.getConexion();
    }
        
        public void crearSiniestro(Siniestro siniestro){
            
            String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalles, fecha_resol, puntuacion, codBrigada) VALUES (?,?,?,?,?,?,?,?)";
            
          try {
              PreparedStatement ps = con.prepareStatement( sql , Statement.RETURN_GENERATED_KEYS);
              
              ps.setString(1, siniestro.getTipo());
              ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro()));
              ps.setInt(3, siniestro.getCoord_X());
              ps.setInt(4, siniestro.getCoord_Y());
              ps.setString(5, siniestro.getDetalle());
              ps.setDate(6, Date.valueOf(siniestro.getFecha_resol()));
              ps.setInt(7, siniestro.getPuntuacion());
              ps.setInt(8, siniestro.getCodBrigada());
              
              ps.executeUpdate();
              
              ResultSet rs = ps.getGeneratedKeys();
              
              if(rs.next()){
                  siniestro.setCodigo(rs.getInt(1));
                  JOptionPane.showMessageDialog(null, "Siniestro agregado con exito");
              }
          
          
          } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se pudo agregar el siniestro");
          }
    }
        public void asignarBrigada(){
         
        }
        
    
}
