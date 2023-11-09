package Data;

import Conexiones.Conexion;
import Entidades.Brigada;
import Entidades.Cuartel;
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
            ps.setBoolean(3, true);
            ps.setInt(4, brigada.getNro_cuartel().getCodCuartel());
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
                Cuartel cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("nro_cuartel"));
                brigada.setNro_cuartel(cuartel);
             //   brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
                disponibles.add(brigada);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada"+ex.getMessage());
            
        }
        return disponibles;
    }
    /////////////
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
               // brigada.setNro_cuartel(rs.getInt("nro_cuartel"));
               Cuartel cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("nro_cuartel"));
                brigada.setNro_cuartel(cuartel);
                noDisponibles.add(brigada);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada"+ex.getMessage());
        }
        return noDisponibles;
    }
    //método para cambiar estado
    public void actualizarBrigada(Brigada brigada){
        String sql = "UPDATE brigada SET nro_cuartel =? WHERE codBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, brigada.getNro_cuartel().getCodCuartel());
            ps.setInt(2, brigada.getCodBrigada());
            
            int f_actualizadas = ps.executeUpdate();
            if (f_actualizadas>0) {
                JOptionPane.showMessageDialog(null, "Brigada cambiada de cuartel con éxito");
            }else{
                JOptionPane.showMessageDialog(null, "Error al cambiar brigada de cuartel");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar brigada");
        }
        
    }
         
   
    
    
    
}
