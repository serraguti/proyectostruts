package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Empleado;
import oracle.jdbc.OracleDriver;

public class RepositoryEmpleados {

    private Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        String cadena
                = "jdbc:oracle:thin:@LOCALHOST:1521:XE";
        Connection cn
                = DriverManager.getConnection(cadena, "system", "oracle");
        return cn;
    }

    public ArrayList<Empleado> getEmpleadosOficio(String oficio) throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select * from emp where upper(oficio)=upper(?)";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, oficio);
        ResultSet rs = pst.executeQuery();
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            Empleado emp = new Empleado(id, ape, ofi, sal);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        if (lista.size() == 0) {
            return null;
        } else {
            return lista;
        }
    }

    public ArrayList<String> getOficios() throws SQLException {
        Connection cn = this.getConnection();
        String sql = "select distinct oficio from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<String> oficios = new ArrayList<>();
        while (rs.next()) {
            String ofi = rs.getString("OFICIO");
            oficios.add(ofi);
        }
        rs.close();
        cn.close();
        return oficios;
    }
    
    public ArrayList<Empleado> getEmpleados() throws SQLException{
        Connection cn = this.getConnection();
        String sql = "select * from emp";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()){
            int idempleado = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            int deptno = rs.getInt("DEPT_NO");
            Empleado empleado = new Empleado(idempleado, ape, ofi, sal, deptno);
            lista.add(empleado);
        }
        rs.close();
        cn.close();
        return lista;
    }
    
    public Empleado buscarEmpleado(int idempleado) throws SQLException{
        Connection cn = this.getConnection();
        String sql = "select * from emp where emp_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, idempleado);
        ResultSet rs = pst.executeQuery();
        if (rs.next()){
            int id = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            int deptno = rs.getInt("DEPT_NO");
            Empleado empleado = new Empleado(id, ape, ofi, sal, deptno);
            rs.close();
            cn.close();
            return empleado;
        }else{
            rs.close();
            cn.close();
            return null;
        }
    }
    
    public void incrementarSalarioEmpleado(int incremento, int idempleado) throws SQLException{
        Connection cn = this.getConnection();
        String sql = "update emp set salario = salario + ? "
                + " where emp_no=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setInt(1, incremento);
        pst.setInt(2, idempleado);
        pst.executeUpdate();
        cn.close();
    }
    
    public ArrayList<Empleado> getEmpleadosDepartamentos(String[] datos) throws SQLException{
        Connection cn = this.getConnection();
        //SELECT * FROM EMP WHERE DEPT_NO IN (10,20)
        String deptnos = "";
        for (String d: datos){
            deptnos += d + ",";
        }
        deptnos = deptnos.substring(0, deptnos.length() - 1);
        String sql = "select * from emp where dept_no in(" + deptnos + ")";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Empleado> lista = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt("EMP_NO");
            String ape = rs.getString("APELLIDO");
            String ofi = rs.getString("OFICIO");
            int sal = rs.getInt("SALARIO");
            int deptno = rs.getInt("DEPT_NO");
            Empleado emp = new Empleado(id, ape, ofi, sal, deptno);
            lista.add(emp);
        }
        rs.close();
        cn.close();
        return lista;
        
    }
}
