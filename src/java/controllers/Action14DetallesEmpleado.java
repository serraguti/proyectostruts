package controllers;

import beans.BeanEmpleados;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action14DetallesEmpleado extends org.apache.struts.action.Action {

    BeanEmpleados bean;
    
    public Action14DetallesEmpleado(){
        this.bean = new BeanEmpleados();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String dato = request.getParameter("idempleado");
        int idempleado = Integer.parseInt(dato);
        System.out.println(idempleado);
        String html = this.bean.getDetallesEmpleado(idempleado);
        request.setAttribute("detallesempleado", html);
        return mapping.findForward("web14detallesempleado");
    }
}
