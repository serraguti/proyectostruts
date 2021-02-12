package models;

public class Empleado {

    private int idEmpleado;
    private String apellido;
    private String oficio;
    private int salario;

    public Empleado() {
    }

    public Empleado(int id, String ape, String ofi, int sal) {
        this.idEmpleado = id;
        this.apellido = ape;
        this.oficio = ofi;
        this.salario = sal;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
