package controllers;

import forms.Form08InsertarDepartamento;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action08InsertarDepartamento extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;

    public Action08InsertarDepartamento() {
        this.repo = new RepositoryDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        /*DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("numero").toString();
        String nombre = formulario.get("nombre").toString();
        String localidad = formulario.get("localidad").toString();*/
        Form08InsertarDepartamento formulario = (Form08InsertarDepartamento) form;
        String nombre = formulario.getNombre();
        String localidad = formulario.getLocalidad();
        int iddepartamento = formulario.getNumero();
        this.repo.insertarDepartamento(iddepartamento, nombre, localidad);
        return mapping.findForward("webdepartamentos");
    }
}
