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
        <h1>Detalles empleado</h1>
        <html:link action="/Action14Empleados">
            Volver a Empleados
        </html:link>
        <html:link action="/Action14DetallesEmpleado"
                   paramId="incrementar"
                   paramName="EMPLEADO"
                   paramProperty="idEmpleado">
            Incrementar
        </html:link>    
        <logic:present name="detallesempleado">
            <bean:write name="detallesempleado" filter="false"/>
        </logic:present>
    </body>
</html>
