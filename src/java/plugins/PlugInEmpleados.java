package plugins;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import models.Empleado;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import repositories.RepositoryEmpleados;

public class PlugInEmpleados implements PlugIn{
    RepositoryEmpleados repo;
    
    public PlugInEmpleados(){
        this.repo = new RepositoryEmpleados();
    }
    @Override
    public void destroy() {}

    @Override
    public void init(ActionServlet servlet, ModuleConfig config) throws ServletException {
        try{
            ArrayList<Empleado> empleados = this.repo.getEmpleados();
            servlet.getServletContext().setAttribute("LISTEMPLEADOS", empleados);
        }catch (SQLException ex){
            //System.out.println("Error SQL " + ex);
            throw new ServletException("Error SQL: " + ex);
        }
    }
}
