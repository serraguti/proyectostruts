package models;

public class Enfermo {
   private int inscripcion;
   private String apellido;
   private String direccion;

   public Enfermo() {}
   
   public Enfermo(int inscripcion, String apellido, String direccion){
       this.inscripcion = inscripcion;
       this.apellido = apellido;
       this.direccion = direccion;
   }
   
    public int getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(int inscripcion) {
        this.inscripcion = inscripcion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
   
}
