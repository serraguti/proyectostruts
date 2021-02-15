package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Departamento;
import oracle.jdbc.OracleDriver;

public class RepositoryDepartamentos {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn
                = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Departamento> getDepartamentos() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from dept";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Departamento> lista = new ArrayList<>();
        while (rs.next()) {
            int num = rs.getInt("DEPT_NO");
            String nom = rs.getString("DNOMBRE");
            String loc = rs.getString("LOC");
            Departamento dept = new Departamento();
            dept.setNumero(num);
            dept.setNombre(nom);
            dept.setLocalidad(loc);
            lista.add(dept);
        }
        rs.close();
        cn.close();
        return lista;
    }

    public Departamento buscarDepartamento(int iddepartamento) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from dept where dept_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, iddepartamento);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            Departamento dept = new Departamento();
            dept.setNumero(rs.getInt("DEPT_NO"));
            dept.setNombre(rs.getString("DNOMBRE"));
            dept.setLocalidad(rs.getString("LOC"));
            rs.close();
            cn.close();
            return dept;
        } else {
            rs.close();
            cn.close();
            return null;
        }
    }

    public void insertarDepartamento(int iddepartamento, String nom, String loc) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "insert into dept values (?,?,?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, iddepartamento);
        pst.setString(2, nom);
        pst.setString(3, loc);
        pst.executeUpdate();
        cn.close();
    }
    
    public void eliminarDepartamento(int iddepartamento) throws SQLException{
        Connection cn = this.getConnection();
        String sql = "delete from dept where dept_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, iddepartamento);
        pst.executeUpdate();
        cn.close();
    }
}
