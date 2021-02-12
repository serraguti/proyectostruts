package controllers;

import beans.BeanDepartamentos;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action12DetallesDepartamento extends org.apache.struts.action.Action {

    BeanDepartamentos bean;

    public Action12DetallesDepartamento() {
        this.bean = new BeanDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String dato = request.getParameter("iddepartamento");
        int deptno = Integer.parseInt(dato);
        String html = this.bean.getDetallesDepartamento(deptno);
        request.setAttribute("detallesdept", html);
        return mapping.findForward("web12detallesdepartamento");
    }
}
