package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action03TablaMultiplicar extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        DynaActionForm formulario = (DynaActionForm) form;
        String dato = formulario.get("numero").toString();
        int numero = Integer.parseInt(dato);
        String html = "<table border='1'>";
        html += "<thead>";
        html += "<tr><th>Operación</th><th>Resultado</th></tr>";
        html += "</thead>";
        html += "<tbody>";
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            String oper = numero + " * " + i;
            html += "<tr>";
            html += "<td>" + oper + "</td>";
            html += "<td>" + resultado + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        request.setAttribute("tablamultiplicar", html);
        return mapping.getInputForward();
    }
}
