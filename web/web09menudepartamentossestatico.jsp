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
        <h1>Menú estático departamentos</h1>
        <ul>
            <li>
                <html:link action="/Action09DetallesDepartamento?iddepartamento=10">
                    CONTABILIDAD
                </html:link>
            </li>
            <li>
                <html:link action="/Action09DetallesDepartamento?iddepartamento=20">
                    INVESTIGACION
                </html:link>
            </li>
            <li>
                <html:link action="/Action09DetallesDepartamento?iddepartamento=30">
                    VENTAS
                </html:link>
            </li>
            <li>
                <html:link action="/Action09DetallesDepartamento?iddepartamento=40">
                    PRODUCCION
                </html:link>
            </li>
        </ul>
    </body>
</html>
