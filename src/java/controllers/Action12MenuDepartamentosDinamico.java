package controllers;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Departamento;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import repositories.RepositoryDepartamentos;

public class Action12MenuDepartamentosDinamico extends org.apache.struts.action.Action {

    RepositoryDepartamentos repo;

    public Action12MenuDepartamentosDinamico() {
        this.repo = new RepositoryDepartamentos();
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ArrayList<Departamento> departamentos
                = this.repo.getDepartamentos();
        request.setAttribute("DEPARTAMENTOS", departamentos);
        return mapping.findForward("webmenudepartamentosdinamicos");
    }
}
