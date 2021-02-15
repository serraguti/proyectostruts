package controllers;

import beans.BeanDepartamentos;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import repositories.RepositoryDepartamentos;


public class Action13EliminarDepartamento extends org.apache.struts.action.Action {

    BeanDepartamentos bean;
    RepositoryDepartamentos repo;
    
    public Action13EliminarDepartamento(){
        this.bean = new BeanDepartamentos();
        this.repo = new RepositoryDepartamentos();
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm)form;
        String dato = formulario.get("iddepartamento").toString();
        int iddepartamento = Integer.parseInt(dato);
        this.repo.eliminarDepartamento(iddepartamento);
        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabladepartamentos", html);
        return mapping.findForward("web13eliminardepartamento");
    }
}
