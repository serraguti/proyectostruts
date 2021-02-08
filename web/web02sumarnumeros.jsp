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
        <h1>Sumar números</h1>
        <html:form action="/Action02SumarNumeros">
            <label>Número 1:</label>
            <html:text property="numero1"/><br/>
            <label>Número 2: </label>
            <html:text property="numero2"/><br/>
            <button type="submit">
                Mostrar suma
            </button>
        </html:form>
        <logic:present name="suma">
            <bean:write name="suma" filter="false"/>    
        </logic:present>
    </body>
</html>
