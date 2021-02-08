package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action02SumarNumeros extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //CAPTURAMOS EL FORMULARIO
        DynaActionForm formulario = (DynaActionForm) form;
        //CAPTURAMOS LOS DATOS QUE SON ENVIADOS: numero1, numero2
        String dato1 = formulario.get("numero1").toString();
        String dato2 = formulario.get("numero2").toString();
        //CONVERTIRMOS LOS DATO A NUMERO
        int numero1 = Integer.parseInt(dato1);
        int numero2 = Integer.parseInt(dato2);
        int suma = numero1 + numero2;
        String html = "<h1 style='color:blue'>";
        html += "La suma es " + suma;
        html += "</h1>";
        //ALMACENAMOS EL VALOR PARA MANDARLO A LA VISTA
        request.setAttribute("suma", html);
        //DEVOLVEMOS LA VISTA QUE NOS HA ENVIADO LA PETICION
        return mapping.getInputForward();
    }
}
