/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class Action01VistaControlador extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //LA INFORMACION VIENE CON UN FORMULARIO DE TIPO
        //DynaActionForm
        DynaActionForm formulario = (DynaActionForm) form;
        //EN ESTE FORMULARIO VIENE UNA PROPIEDAD LLAMADA respuesta
        String respuesta = formulario.get("respuesta").toString();
        int valor = Integer.parseInt(respuesta);
        if (valor == 4) {
            //RESPUESTA CORRECTA
            return mapping.findForward("respuestacorrecta");
        } else {
            //RESPUESTA INCORRECTA
            //LE MANTENEMOS EN LA MISMA PAGINA DE LA PETICION
            return mapping.getInputForward();
        }
    }
}
