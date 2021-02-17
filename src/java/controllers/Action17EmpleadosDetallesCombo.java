package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryEmpleados;

public class Action17EmpleadosDetallesCombo extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;
    
    public Action17EmpleadosDetallesCombo(){
        this.repo = new RepositoryEmpleados();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm)form;
        String dato = formulario.get("idempleado").toString();
        int idempleado = Integer.parseInt(dato);
        Empleado emp = this.repo.buscarEmpleado(idempleado);
        request.setAttribute("EMPLEADO", emp);
        return mapping.findForward("web17empleadosdetallescombo");
    }
}
