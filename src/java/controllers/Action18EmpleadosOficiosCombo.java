package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryEmpleados;

public class Action18EmpleadosOficiosCombo extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;
    
    public Action18EmpleadosOficiosCombo(){
        this.repo = new RepositoryEmpleados();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm)form;
        String oficio = formulario.get("oficio").toString();
        ArrayList<Empleado> empleados = this.repo.getEmpleadosOficio(oficio);
        request.setAttribute("EMPLEADOS", empleados);
        return mapping.findForward("web18empleadosoficioscombo");
    }
}
