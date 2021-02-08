
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
        <h1>PREGUNTA IMPORTANTE...</h1>
        <html:form action="/Action01VistaControlador">
            <p><b>¿Cuanto son 2 + 2?</b></p>
            <html:text property="respuesta"/>
            <html:submit value="Comprobar respuesta"/>
        </html:form>
    </body>
</html>
