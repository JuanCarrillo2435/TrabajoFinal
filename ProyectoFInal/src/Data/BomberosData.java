package Data;

import Conexiones.Conexion;
import Entidades.Bomberos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BomberosData {
    
    
        private Connection con = null;


    public BomberosData() {
        
        con= Conexion.getConexion();
    }
    public void CrearBombero(Bomberos bombero){
        String sql ="INSERT INTO bombero(dni, nombre_ape, fecha_nac, celular, codBrigada) VALUES (?,?,?,?,?)";
        
            try {
                PreparedStatement ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
                
                ps.setString(1, bombero.getDni());
                ps.setString(2, bombero.getNombre_ape());
                ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
                ps.setString(4, bombero.getCelular());
                ps.setInt(5, bombero.getCodBrigada());
                
                ps.executeUpdate();
                
                ResultSet rs = ps.getGeneratedKeys();
                
                if (rs.next()) {
                    bombero.setId_bombero(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Bombero Añadido con exito");
                }
            
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se a podido añadir el bombero");
            }
    }
    
    public void borrarBombero(int id){
        String sql = "UPDATE bombero SET estado=0 WHERE id_bombero = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int f = ps.executeUpdate();
                if (f == 1) {
                    JOptionPane.showMessageDialog(null, "Se borró el bombero");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontró el bombero");
                }
            } catch (SQLException ex) {
                Logger.getLogger(BomberosData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
