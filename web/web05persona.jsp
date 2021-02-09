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
        <h1>Action Form Persona</h1>
        <html:form action="/Action05Persona">
            <label>Nombre: </label>
            <html:text property="nombre"/>
            <span style="color:red">
                <html:errors property="nombre"/>
            </span>
            <br/>
            <label>Email: </label>
            <html:text property="email"/>
            <span style="color:red">
                <html:errors property="email"/>
            </span>
            <br/>
            <label>Edad: </label>
            <html:text property="edad"/>
            <span style="color:red">
                <html:errors property="edad"/>
            </span>
            <br/>
            <button type="submit">
                Enviar datos
            </button>
        </html:form>
        <logic:present name="datospersona">
            <bean:write name="datospersona" filter="false"/>
        </logic:present>
    </body>
</html>
