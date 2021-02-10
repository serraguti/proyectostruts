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
        <h1>Buscar datos departamentos</h1>
        <html:form action="/Action07BuscarDepartamentos">
            <label>Número departamento: </label>
            <html:text property="iddepartamento"/>
            <button type="submit">
                Buscar departamento
            </button>
        </html:form>
        <logic:present name="datodepartamento">
            <bean:write name="datodepartamento" filter="false"/>
        </logic:present>
        <logic:present name="mensaje">
            <h1 style="color:red">
                <bean:write name="mensaje"/>
            </h1>
        </logic:present>
    </body>
</html>
