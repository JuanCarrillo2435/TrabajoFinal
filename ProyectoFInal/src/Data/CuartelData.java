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

    public void crearCuartel(Cuartel cuartel) {

        String sql = "INSERT INTO cuartel(nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo, estado) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setBoolean(7, cuartel.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cuartel.setCodCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel agregado con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al crear un cuartel");
        }
    }

    public void eliminarCuartel(int cod) {
        try {
            String sql = "UPDATE cuartel SET estado = 0 WHERE codCuartel = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el cuartel correctamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuartel");
        }

    }

    public void actualizarCuartel(Cuartel cuartel) {
        String sql = "UPDATE cuartel SET nombre_cuartel = ?, direccion = ?, coord_X = ?, coord_Y = ?, telefono = ?, correo = ?, estado = ? WHERE codCuartel = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());
            ps.setBoolean(7, cuartel.isEstado());
            ps.setInt(8, cuartel.getCodCuartel());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El cuartel no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

    public Cuartel buscarCuartel(int cod) {
        String sql = "SELECT * FROM cuartel WHERE codCuartel=?;";
        Cuartel cuartel = new Cuartel();

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el cuartel");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel" + ex.getMessage());
        }

        return cuartel;

    }

    //Se modifico la consulta en base a los cuarteles ACTIVOS
    public List<Cuartel> listarCuarteles() {
        List<Cuartel> cuarteles = new ArrayList();

        String sql = "SELECT * FROM cuartel WHERE estado = 1;";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            Cuartel cuartel;
            while (rs.next()) {

                cuartel = new Cuartel();
                cuartel.setCodCuartel(rs.getInt("codCuartel"));
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setEstado(rs.getBoolean("estado"));
                cuarteles.add(cuartel);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel" + ex.getMessage());
        }

        return cuarteles;
    }

    //la distancia se toma en base al calculo de la diagonal (PITAGORAS)
    public double distancia(int c1X, int c1Y, int c2X, int c2Y) {
        return Math.sqrt(Math.pow((c2X - c1X), 2) + Math.pow((c2Y - c1Y), 2));
    }

    //Por parametros se pasan las coordenadas X, Y. y se compara con todos los cuarteles activos
    //a travez de la funcion distancia(X,Y), devuelve el cuartel con la distancia mas corta.
    public Cuartel cuartelCerca(int coord_X, int coord_Y) {
        List<Cuartel> cuarteles = listarCuarteles();

        if (cuarteles.isEmpty()) {
            return null; // O maneja el caso en que no hay cuarteles según tu lógica de negocio
        }

        Cuartel cuartelCercano = cuarteles.get(0);
        double distanciaCercana = distancia(cuartelCercano.getCoord_X(), cuartelCercano.getCoord_Y(), coord_X, coord_Y);

        for (int i = 1; i < cuarteles.size(); i++) {
            double distanciaActual = distancia(cuarteles.get(i).getCoord_X(), cuarteles.get(i).getCoord_Y(), coord_X, coord_Y);

            if (distanciaActual < distanciaCercana) {
                cuartelCercano = cuarteles.get(i);
                distanciaCercana = distanciaActual;
            }
        }

        return cuartelCercano;
    }

}
