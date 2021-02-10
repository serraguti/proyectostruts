package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;

public class Action07BuscarDepartamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;

    public Action07BuscarDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        System.out.println("Estoy dentro Action");
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("iddepartamento").toString();
        int iddepartamento = Integer.parseInt(dato);
        Departamento departamento = this.repo.buscarDepartamento(iddepartamento);
        if (departamento == null) {
            request.setAttribute("mensaje", "No existe el departamento " + dato);
        } else {
            String html = "<h1>Número: " + departamento.getNumero() + "</h1>";
            html += "<h2>Nombre: " + departamento.getNombre() + "</h2>";
            html += "<h2>Localidad: " + departamento.getLocalidad() + "</h2>";
            request.setAttribute("datodepartamento", html);
        }
        return mapping.findForward("buscardepartamentos");
    }
}
