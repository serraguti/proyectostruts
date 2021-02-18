package controllers;

import forms.Form19SeleccionMultipleDepartamentos;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action19SeleccionMultipleDepartamentos extends org.apache.struts.action.Action {

    RepositoryEmpleados repo;
    
    public Action19SeleccionMultipleDepartamentos(){
        this.repo = new RepositoryEmpleados();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Form19SeleccionMultipleDepartamentos f = (Form19SeleccionMultipleDepartamentos)form;
        String[] datos = f.getDepartamentos();
        ArrayList<Empleado> empleados = this.repo.getEmpleadosDepartamentos(datos);
        request.setAttribute("LISTEMPLEADOS", empleados);
        return mapping.findForward("web19seleccionmultipledepartamentos");
    }
}
