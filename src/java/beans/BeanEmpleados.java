package beans;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Empleado;
import repositories.RepositoryEmpleados;

public class BeanEmpleados {

    RepositoryEmpleados repo;

    public BeanEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    public String getEmpleadosOficio(String oficio) throws SQLException {
        ArrayList<Empleado> empleados = this.repo.getEmpleadosOficio(oficio);
        if (empleados == null) {
            String html = "<h1 style='color:red'>No hay empleados con oficio " + oficio + "</h1>";
            return html;
        } else {
            String html = "<table border='1'>";
            html += "<thead>";
            html += "<tr><th>Apellido</th><th>Oficio</th><th>Salario</th></tr>";
            html += "</thead>";
            html += "<tbody>";
            for (Empleado emp : empleados) {
                html += "<tr>";
                html += "<td>" + emp.getApellido() + "</td>";
                html += "<td>" + emp.getOficio() + "</td>";
                html += "<td>" + emp.getSalario() + "</td>";
                html += "</tr>";
            }
            html += "</tbody>";
            html += "</table>";
            return html;
        }
    }
}
