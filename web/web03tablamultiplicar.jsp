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
        <h1>Tabla multiplicar</h1>
        <html:form action="/Action03TablaMultiplicar">
            <label>Número: </label>
            <html:text property="numero"/>
            <button type="submit">
                Tabla multiplicar
            </button>
        </html:form>
        <logic:present name="tablamultiplicar">
            <bean:write name="tablamultiplicar" filter="false"/>
        </logic:present>
    </body>
</html>
