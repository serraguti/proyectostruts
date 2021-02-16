package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Enfermo;
import oracle.jdbc.OracleDriver;

public class RepositoryEnfermos {
    private Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@localhost:1521:xe";
        Connection cn = DriverManager.getConnection(cadena,"system","oracle");
        return cn;
    }
    
    public ArrayList<Enfermo> getEnfermos() throws SQLException{
        Connection cn = this.getConnection();
        String sql = "select * from enfermo";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Enfermo> lista = new ArrayList<>();
        while (rs.next()){
            int inscripcion = rs.getInt("INSCRIPCION");
            String ape = rs.getString("APELLIDO");
            String dir = rs.getString("DIRECCION");
            Enfermo enfermo = new Enfermo(inscripcion, ape, dir);
            lista.add(enfermo);
        }
        rs.close();
        cn.close();
        return lista;
    }
    
    public void eliminarEnfermo(int inscripcion) throws SQLException{
        Connection cn = this.getConnection();
        String sql = "delete from enfermo where inscripcion=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, inscripcion);
        pst.executeUpdate();
        cn.close();
    }
}
