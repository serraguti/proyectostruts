package beans;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Departamento;
import repositories.RepositoryDepartamentos;

public class BeanDepartamentos {

    RepositoryDepartamentos repo;

    public BeanDepartamentos() {
        this.repo = new RepositoryDepartamentos();
    }

    //ESTA CLASE SE UTILIZA PARA DIBUJOS ESTATICOS, QUE NO
    //VAN A REALIZAR INTERACCION CON EL USUARIO
    //HEMOS REPETIDO VARIAS VECES LA TABLA DEPARTAMENTOS
    //LA LLAMADA DESDE VARIOS ACTION
    public String getTablaDepartamentos() throws SQLException {
        ArrayList<Departamento> departamentos
                = this.repo.getDepartamentos();
        String html = "<table border='1'>";
        html += "<thead>";
        html += "<tr><th>Número</th><th>Nombre</th><th>Localidad</th>";
        html += "</thead>";
        html += "<tbody>";
        for (Departamento d : departamentos) {
            html += "<tr>";
            html += "<td>" + d.getNumero() + "</td>";
            html += "<td>" + d.getNombre() + "</td>";
            html += "<td>" + d.getLocalidad() + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        return html;
    }

    public String getDetallesDepartamento(int iddepartamento) throws SQLException {
        Departamento departamento
                = this.repo.buscarDepartamento(iddepartamento);
        String html = "<h1 style='color:blue'>Nombre: " + departamento.getNombre() + "</h1>";
        html += "<h1 style='color:red'>Localidad: " + departamento.getLocalidad() + "</h1>";
        html += "<h2 style='color:green'>Número: " + departamento.getNumero() + "</h2>";
        return html;
    }
}
