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
        <h1>Menú de Struts</h1>
        <ul>
            <li>
                <html:link href="web02sumarnumeros.jsp">
                    Sumar números
                </html:link>
            </li>
            <li>
                <html:link action="/Action06Departamentos">
                    Departamentos
                </html:link>
            </li>
            <li>
                <html:link href="web09menudepartamentossestatico.jsp">
                    Menú departamentos estático
                </html:link>
            </li>
        </ul>
    </body>
</html>
