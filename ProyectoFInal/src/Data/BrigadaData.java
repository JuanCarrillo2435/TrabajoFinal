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

    CuartelData cd = new CuartelData();
    private Connection con = null;


    public BrigadaData() {
        
        con= Conexion.getConexion();
    }
    
    
    public void crearBrigada(Brigada brigada){
        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, nro_cuartel, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, brigada.getNombre_br());
            ps.setString(2,brigada.getEspecialidad());
            ps.setBoolean(3, true);
            ps.setInt(4, brigada.getNro_cuartel().getCodCuartel());
            ps.setBoolean(5, false);
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
    
    public List<Brigada> listarBrigadas(){
        List<Brigada> disponibles = new ArrayList();
        
        String sql ="SELECT * FROM `brigada` WHERE estado = 1";
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
    
    
    public List<Brigada> brigadasLibres(){
        List<Brigada> disponibles = new ArrayList();
        
        String sql ="SELECT * FROM `brigada` WHERE libre = 1 AND estado = 1 ";
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
        String sql ="SELECT codBrigada, nombre_br, especialidad, libre, nro_cuartel FROM `brigada` WHERE libre = 0 AND estado = 1";
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
                brigada.setEstado(rs.getBoolean("estado"));
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
    
    public List<Brigada> listarBrigadasporCuartel(Cuartel cuartel) {
    List<Brigada> brixcuartel = new ArrayList();
    String sql = "SELECT * FROM brigada WHERE nro_cuartel = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cuartel.getCodCuartel()); // Configura el valor del parámetro
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Brigada brigada = new Brigada();
            brigada.setCodBrigada(rs.getInt("codBrigada"));
            brigada.setNombre_br(rs.getString("nombre_br"));
            brigada.setEspecialidad(rs.getString("especialidad"));
            brigada.setLibre(rs.getBoolean("libre"));

            cuartel.setCodCuartel(rs.getInt("nro_cuartel"));
            brigada.setNro_cuartel(cuartel);
            
            brigada.setEstado(rs.getBoolean("estado"));

            brixcuartel.add(brigada);
        }

    } catch (SQLException ex) {
        System.out.println("Error al acceder a la tabla Brigada" + ex.getMessage());
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
    }

    return brixcuartel;
}
         
   public Brigada buscarBrigada(int cod){
       Brigada b = new Brigada();
       String sql = "SELECT * FROM brigada WHERE codBrigada = ?";
       try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cod); // Configura el valor del parámetro
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            b.setCodBrigada(cod);
            b.setNombre_br(rs.getString("nombre_br"));
            b.setEspecialidad(rs.getString("especialidad"));
            b.setLibre(rs.getBoolean("libre"));
            b.setEstado(rs.getBoolean("estado"));
            b.setNro_cuartel(cd.buscarCuartel(rs.getInt("nro_cuartel")));
        }else {
                JOptionPane.showMessageDialog(null, "No existe el cuartel");
               }
        ps.close();
       } catch (SQLException ex) {
        System.out.println("Error al acceder a la tabla Brigada" + ex.getMessage());
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
    }
       return b;
   }
    
    
    
}
