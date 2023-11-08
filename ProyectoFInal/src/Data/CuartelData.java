package Data;

import Conexiones.Conexion;
import Entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    
    
    public void actualizarCuartel(Cuartel cuartel){
        String sql = "UPDATE cuartel SET nombre_cuartel = ?, direccion = ?, coord_X = ?, coord_Y = ?, telefono = ?, correo = ? WHERE codCuartel = ?";
        
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setInt(7, cuartel.getCodCuartel());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El cuartel no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
    }
    
    
    public Cuartel buscarCuartel(int cod){
        String sql ="SELECT * FROM cuartel WHERE codCuartel=?;";
        Cuartel cuartel = new Cuartel(); 
        
        try{
            
        PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,cod);
        ResultSet rs = ps.executeQuery();
           
        if (rs.next()){
            cuartel.setCodCuartel(rs.getInt("codCuartel"));
            cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
            cuartel.setDireccion(rs.getString("direccion"));
            cuartel.setCoord_X(rs.getInt("coord_X"));
            cuartel.setCoord_Y(rs.getInt("coord_Y"));
            cuartel.setTelefono(rs.getString("telefono"));
            cuartel.setCorreo(rs.getString("correo"));
                
        }else {
                JOptionPane.showMessageDialog(null, "No existe el cuartel");
               }
        ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel"+ex.getMessage());
        }
    
        return cuartel;
    
    }
    
    public List<Cuartel> listarCuarteles(){
        List<Cuartel> cuarteles = new ArrayList();
        
        String sql ="SELECT * FROM cuartel;";
        
         
        try{
            
        
         PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ResultSet rs = ps.executeQuery();
        Cuartel cuartel;    
            while(rs.next()){
            
                cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuarteles.add(cuartel);
                                   
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel"+ex.getMessage());
        }
    
        return cuarteles;
    }
    public double distancia (int c1X, int c1Y, int c2X, int c2Y){
        return Math.sqrt(Math.pow((c2X - c1X),2) + Math.pow((c2Y - c1Y),2));
    }
    
    
    public Cuartel cuartelCerca (int coord_X, int coord_Y){
        List<Cuartel> cuarteles = listarCuarteles();
        Cuartel cuartel = new Cuartel();
        double d =0;
        for (Cuartel c : cuarteles){
            if (distancia(c.getCoord_X(), c.getCoord_Y(),coord_X,coord_Y)>d){
                d=distancia(c.getCoord_X(), c.getCoord_Y(),coord_X,coord_Y);
                cuartel = c;
            }
        }
        
        return cuartel;
    }
    
    
    
    
}
