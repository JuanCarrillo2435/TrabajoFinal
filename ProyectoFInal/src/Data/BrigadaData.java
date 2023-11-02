package Data;

import Conexiones.Conexion;
import Entidades.Brigada;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BrigadaData {

    private Connection con = null;


    public BrigadaData() {
        
        con= Conexion.getConexion();
    }
    
    
    public void crearBrigada(Brigada brigada){
        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, nro_cuartel) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2,brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNro_cuartel());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada Añadida con exito");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir la brigada");
        
        }
        
        
    }
    
    
    public List<Brigada> brigadasLibres(){
        List<Brigada> disponibles = new ArrayList();
        
        String sql ="SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM `brigada` WHERE libre = 1";
        
         
        try{
            
        
         PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                disponibles.add(brigada);
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada"+ex.getMessage());
            
        }
    
        
        
        return disponibles;
    }
    
    
    
    public List<Brigada> brigadasNOLibres(){
        List<Brigada> noDisponibles = new ArrayList();
        
        String sql ="SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM `brigada` WHERE libre = 0";
        
         
        try{
            
        
         PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                brigada.setNombre_br(rs.getString("nombre_br"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                noDisponibles.add(brigada);
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada"+ex.getMessage());
            
        }
    
        
        
        return noDisponibles;
    }
         
   
    
    
    
}
