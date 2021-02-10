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
        <h1>Insertar departamento</h1>
        <html:form action="/Action08InsertarDepartamento">
            <label>Id departamento: </label>
            <html:text property="numero"/>
            <br/>
            <label>Nombre: </label>
            <html:text property="nombre"/><br/>
            <label>Localidad: </label>
            <html:text property="localidad"/><br/>
            <button type="submit">
                Insertar departamento
            </button>
            <div style="color:red">
                <html:errors property="nombre"/>
                <html:errors property="localidad"/>                
            </div>
        </html:form>
    </body>
</html>
