package controllers;

import beans.BeanDepartamentos;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryDepartamentos;

public class Action06Departamentos extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;
    BeanDepartamentos bean;

    public Action06Departamentos() {
        this.repo = new RepositoryDepartamentos();
        this.bean = new BeanDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String html = this.bean.getTablaDepartamentos();
        request.setAttribute("tabladepartamentos", html);
        return mapping.getInputForward();
    }
}
