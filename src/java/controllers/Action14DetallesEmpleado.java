package controllers;

import beans.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryEmpleados;

public class Action14DetallesEmpleado extends org.apache.struts.action.Action {

    BeanEmpleados bean;
    RepositoryEmpleados repo;
    
    public Action14DetallesEmpleado(){
        this.bean = new BeanEmpleados();
        this.repo = new RepositoryEmpleados();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String dato = request.getParameter("idempleado");
        String incrementar = request.getParameter("incrementar");
        int idempleado;
        if (incrementar != null){
            int empno = Integer.parseInt(incrementar);
            this.repo.incrementarSalarioEmpleado(1, empno);
            idempleado = empno;
        }else{
            idempleado = Integer.parseInt(dato);
        }
        
        Empleado empleado = this.repo.buscarEmpleado(idempleado);
        String html = this.bean.getDetallesEmpleado(idempleado);
        request.setAttribute("detallesempleado", html);
        request.setAttribute("EMPLEADO", empleado);
        return mapping.findForward("web14detallesempleado");
    }
}
