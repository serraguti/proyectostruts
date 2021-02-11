package forms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import models.Departamento;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import repositories.RepositoryDepartamentos;

public class Form08InsertarDepartamento extends org.apache.struts.action.ActionForm {

    RepositoryDepartamentos repo;

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
        this.repo = new RepositoryDepartamentos();
    }

    //DE DONDE SALE ESTE METODO? LO HEMOS CREADO NOSOTROS???
    //ESTE METODO VIENE DE LA HERENCIA DE LA CLASE ActionForm
    //NO PODEMOS MODIFICAR SU CABECERA, SOLAMENTE ESCRIBIR EN EL
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombre() == null || getNombre().equals("")) {
            errors.add("nombre", new ActionMessage("error.nombre.obligatorio"));
        } else if (getLocalidad() == null || getLocalidad().equals("")) {
            errors.add("localidad", new ActionMessage("error.localidad.obligatorio"));
        }
        //EL ID DEL FORMULARIO
        int deptno = this.getNumero();
        try {
            //BUSCAR EN EL REPO SI EXISTE EL DEPARTAMENTO
            Departamento departamento = this.repo.buscarDepartamento(deptno);
            if (departamento != null) {
                //YA EXISTE UN DEPARTAMENTO CON ESE NUMERO
                errors.add("numero", new ActionMessage("error.iddepartamento.repetido"));
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        }

        return errors;
    }
}
