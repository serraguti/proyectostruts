package controllers;

import beans.BeanDepartamentos;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action13TablaDepartamentos extends org.apache.struts.action.Action {

    BeanDepartamentos bean;
    
    public Action13TablaDepartamentos(){
        this.bean = new BeanDepartamentos();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabladepartamentos", html);
        return mapping.findForward("web13eliminardepartamento");
    }
}
