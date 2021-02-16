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
        <h1>Eliminar enfermos PlugIn</h1>
        <html:form action="/Action16EliminarEnfermo">
            <label>Inscripción </label>
            <html:text property="inscripcion"/>
            <button type="submit">
                Eliminar enfermo
            </button>
        </html:form>
        <logic:present name="mensaje">
            <bean:write name="mensaje" filter="false"/>
        </logic:present>
        <table border="1">
            <thead>
                <tr>
                    <td>Inscripción</td>
                    <td>Apellido</td>
                    <td>Dirección</td>
                </tr>
            </thead>
            <tbody>
                <logic:iterate name="LISTENFERMOS" id="enfermo">
                    <tr>
                        <td>
                            <bean:write name="enfermo" property="inscripcion"/>
                        </td>
                        <td>
                            <bean:write name="enfermo" property="apellido"/>
                        </td>
                        <td>
                            <bean:write name="enfermo" property="direccion"/>
                        </td>
                    </tr>
                </logic:iterate>
            </tbody>
        </table>
    </body>
</html>
