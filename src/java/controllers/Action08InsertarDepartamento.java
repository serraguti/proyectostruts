package controllers;

import beans.BeanDepartamentos;
import forms.Form08InsertarDepartamento;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action08InsertarDepartamento extends org.apache.struts.action.Action {

    //DATOS
    RepositoryDepartamentos repo;
    //DIBUJOS ESTATICOS
    BeanDepartamentos bean;

    public Action08InsertarDepartamento() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeanDepartamentos();
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
        //LA WEB DEPARTAMENTOS, POSTERIORMENTE, AL PULSAR EL BOTON
        //RECIBE UN VARIABLE LLAMADA tabladepartamentos
        //NOSOTROS PODEMOS ENVIAR DESDE AQUI LA VARIABLE SIN PROBLEMAS
        //NECESITAMOS EL DIBUJO DE LA TABLA
        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabladepartamentos", html);
        return mapping.findForward("webdepartamentos");
    }
}
