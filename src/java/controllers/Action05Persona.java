package controllers;

import forms.Form05Persona;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class Action05Persona extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //AQUI RECUPERAMOS LOS DATOS DEL FORMULARIO
        Form05Persona formulario = (Form05Persona) form;
        String nombre = formulario.getNombre();
        String email = formulario.getEmail();
        int edad = formulario.getEdad();
        String html = "<h1 style='color:blue'>Su nombre es " + nombre + "</h1>";
        html += "<h2 style='color:red'>Su Email es: " + email + "</h2>";
        html += "<h2 style='color:fuchsia'>Su edad es: " + edad + "</h2>";
        request.setAttribute("datospersona", html);
        return mapping.getInputForward();
    }
}
