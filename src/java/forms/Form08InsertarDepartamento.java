package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Form08InsertarDepartamento extends org.apache.struts.action.ActionForm {

    private int numero;
    private String nombre;
    private String localidad;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Form08InsertarDepartamento() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre() == null || getNombre().equals("")) {
            errors.add("nombre", new ActionMessage("error.nombre.obligatorio"));
        } else if (getLocalidad() == null || getLocalidad().equals("")) {
            errors.add("localidad", new ActionMessage("error.localidad.obligatorio"));
        }
        return errors;
    }
}
