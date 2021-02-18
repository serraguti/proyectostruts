package forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Form19SeleccionMultipleDepartamentos extends org.apache.struts.action.ActionForm {
    
    //NECESITAMOS UNA PROPIEDAD PARA PODER RECUPERAR MULTIPLES
    //DEPARTAMENTOS DESDE LA VISTA
    private String[] departamentos;

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        return errors;
    }
}
