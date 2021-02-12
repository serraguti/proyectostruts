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
        <h1>Menú oficios dinámicos</h1>
        <logic:present name="OFICIOS">
            <ul>
                <logic:iterate name="OFICIOS" id="ofi">
                    <li>
                        <html:link action="/Action10MenuOficiosEstatico"
                                   paramId="oficio"
                                   paramName="ofi">
                            <bean:write name="ofi"/> 
                        </html:link>
                    </li>
                </logic:iterate>
            </ul>
        </logic:present>
    </body>
</html>
