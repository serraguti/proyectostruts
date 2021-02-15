package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action14Empleados extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;
    
    public Action14Empleados(){
        this.repo = new RepositoryEmpleados();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList<Empleado> empleados = this.repo.getEmpleados();
        request.setAttribute("listaempleados", empleados);
        return mapping.findForward("web14empleados");
    }
}
