package Data;

import Conexiones.Conexion;
import Entidades.Cuartel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CuartelData {
    
    Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
    }
    
    
    public void crearCuartel(Cuartel cuartel){
    
    String sql = "INSERT INTO cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?,?,?,?,?,?)";
   
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel agregado con exito");
            }
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al crear un cuartel");
        }
}
    
    
}
