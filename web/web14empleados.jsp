<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Empleados</h1>
        <ul>
            <logic:iterate name="listaempleados" id="emp">
                <li>
                    <bean:write name="emp" property="apellido"/> |
                    <html:link action="/Action14DetallesEmpleado"
                               paramName="emp" paramProperty="idEmpleado"
                               paramId="idempleado">
                        Detalles
                    </html:link>
                </li>
            </logic:iterate>
        </ul>
    </body>
</html>
