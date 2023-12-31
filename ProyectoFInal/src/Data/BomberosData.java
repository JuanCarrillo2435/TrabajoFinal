package Data;

import Conexiones.Conexion;
import Entidades.Bomberos;
import Entidades.Brigada;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BomberosData {
    
    
        private Connection con = null;


    public BomberosData() {
        
        con= Conexion.getConexion();
    }
    public void CrearBombero(Bomberos bombero){
        String sql ="INSERT INTO bombero(dni, nombre_ape, fecha_nac, celular, codBrigada, estado)  VALUES (?,?,?,?,?,?)";
        
            try {
                PreparedStatement ps = con.prepareStatement(sql , Statement.RETURN_GENERATED_KEYS);
                
                ps.setString(1, bombero.getDni());
                ps.setString(2, bombero.getNombre_ape());
                ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
                ps.setString(4, bombero.getCelular());
                ps.setInt(5, bombero.getCodBrigada().getCodBrigada());
                ps.setBoolean(6, bombero.isEstado());
                
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
    
    public void bajarBombero(Bomberos bombero){
        String sql = "UPDATE bombero SET estado = false WHERE id_bombero = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, bombero.getId_bombero());
        
        int f = ps.executeUpdate();
        
        if (f == 1) {
            JOptionPane.showMessageDialog(null, "El estado fue cambiado");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el bombero");
        }
    } catch (SQLException ex) {
        Logger.getLogger(BomberosData.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    
    
    public void actualizarBombero(Bomberos bombero){
        String sql = "UPDATE bombero SET dni = ?,nombre_ape = ?,fecha_nac = ?,celular = ?,codBrigada = ? WHERE id_bombero = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, bombero.getDni());
                ps.setString(2, bombero.getNombre_ape());
                ps.setDate(3, Date.valueOf(bombero.getFecha_nac()));
                ps.setString(4, bombero.getCelular());
                ps.setInt(5, bombero.getCodBrigada().getCodBrigada());
                ps.setInt(6, bombero.getId_bombero());
                int f = ps.executeUpdate();
                if (f == 1) {
                    JOptionPane.showMessageDialog(null, "El bombero fue actualizado con exito");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontró el bombero");
                }
            } catch (SQLException ex) {
                Logger.getLogger(BomberosData.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public TreeSet<Bomberos> listarBomberos(){
        TreeSet<Bomberos> listar = new TreeSet(); 
        String sql ="SELECT id_bombero, dni, nombre_ape, fecha_nac, celular, codBrigada, estado FROM bombero";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Bomberos bombero = new Bomberos();
                    bombero.setId_bombero(rs.getInt("id_bombero"));
                    bombero.setDni(rs.getString("dni"));
                    bombero.setNombre_ape(rs.getString("nombre_ape"));
                    bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                    bombero.setCelular(rs.getString("celular"));
                    Brigada bri = new Brigada();
                    bri.setCodBrigada(rs.getInt("codBrigada"));
                    bombero.setCodBrigada(bri);
                  //  bombero.setCodBrigada(rs.getInt("codBrigada"));
                  bombero.setEstado(rs.getBoolean("estado"));
                    listar.add(bombero);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de bomberos");
            }
        
        
    return listar;    
    }
          
    
}