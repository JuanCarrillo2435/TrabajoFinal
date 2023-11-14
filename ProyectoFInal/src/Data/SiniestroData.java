package Data;

import Conexiones.Conexion;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SiniestroData {
    
    BrigadaData bd = new BrigadaData();
    private Connection con=null;


    public SiniestroData() {

        con = Conexion.getConexion();
    }

    public void crearSiniestro(Siniestro siniestro) {

        String sql = "INSERT INTO siniestro(tipo, fecha_siniestro, coord_X, coord_Y, detalles) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFecha_siniestro().toLocalDate()));
            ps.setInt(3, siniestro.getCoord_X());
            ps.setInt(4, siniestro.getCoord_Y());
            ps.setString(5, siniestro.getDetalle());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                siniestro.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro agregado con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el siniestro");
        }
    }

    public void completarSiniestro(Siniestro siniestro) {
        String sql = "UPDATE siniestro SET fecha_resol=?, puntuacion=?, codBrigada=? WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(siniestro.getFecha_resol().toLocalDate()));
            ps.setInt(2, siniestro.getPuntuacion());
            ps.setInt(3, siniestro.getCodBrigada().getCodBrigada());
            ps.setInt(4, siniestro.getCodigo());

            int f = ps.executeUpdate();
            if (f == 1) {
                JOptionPane.showMessageDialog(null, "Siniestro fue resuelto y puntuado");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A SINIESTRO");
        }
    }

    public List<Siniestro> listarSiniestrosResueltos() {
        List<Siniestro> siniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro WHERE puntuacion > 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Siniestro s = new Siniestro();
                s.setCodigo(rs.getInt("codigo"));
                s.setTipo(rs.getString("tipo"));
                s.setFecha_siniestro(rs.getTimestamp("fecha_siniestro").toLocalDateTime());
                s.setCoord_X(rs.getInt("coord_X"));
                s.setCoord_Y(rs.getInt("coord_Y"));
                s.setDetalle(rs.getString("detalles"));
                s.setFecha_resol(rs.getTimestamp("fecha_resol").toLocalDateTime());
                s.setPuntuacion(rs.getInt("puntuacion"));

                Brigada brigada = new Brigada();
                brigada.setCodBrigada(rs.getInt("codBrigada"));
                // s.setCodBrigada(rs.getInt("codBrigada"));
                s.setCodBrigada(brigada);
                siniestros.add(s);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Siniestro " + ex.getMessage());
        }

        return siniestros;
    }

   public List<Siniestro> listarSiniestrosNOResueltos(){
            List<Siniestro> siniestros = new ArrayList<>();
            String sql = "SELECT * FROM siniestro WHERE puntuacion IS NULL;";
          try {
              PreparedStatement ps = con.prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  Siniestro s = new Siniestro();
                  //s.setCodBrigada(rs.getInt("codigo"));
                  Brigada brigada = new Brigada();
                  brigada = bd.buscarBrigada(rs.getInt("codBrigada"));
                  s.setCodBrigada(brigada);
                  s.setFecha_siniestro(rs.getTimestamp("fecha_siniestro").toLocalDateTime());
                  s.setTipo(rs.getString("tipo"));
                  s.setCoord_X(rs.getInt("coord_X"));
                  s.setCoord_Y(rs.getInt("coord_Y"));
                  s.setDetalle(rs.getString("detalles"));
                  s.setCodigo(rs.getInt("codigo"));
                  siniestros.add(s);
              }
              ps.close();
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Siniestro " + ex.getMessage());
          }
            
            return siniestros;
        }


        

        
     
    

}
