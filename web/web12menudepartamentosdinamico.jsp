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
        <h1>Menú Departamento dinámicos</h1>
        <logic:present name="DEPARTAMENTOS">
            <ul>
                <logic:iterate name="DEPARTAMENTOS" id="departamento">
                    <li>
                        <html:link action="/Action12DetallesDepartamento"
                                   paramId="iddepartamento"
                                   paramName="departamento"
                                   paramProperty="numero">
                            <bean:write name="departamento" property="nombre"/>
                        </html:link>
                    </li>
                </logic:iterate>
            </ul>
        </logic:present>
    </body>
</html>
