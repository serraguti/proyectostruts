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
        <h1>Menú estático de oficios</h1>
        <ul>
            <li>
                <html:link action="/Action10MenuOficiosEstatico?oficio=PRESIDENTE">
                    PRESIDENTE
                </html:link>
            </li>
            <li>
                <html:link action="/Action10MenuOficiosEstatico?oficio=ANALISTA">
                    ANALISTA
                </html:link>
            </li>
            <li>
                <html:link action="/Action10MenuOficiosEstatico?oficio=DIRECTOR">
                    DIRECTOR
                </html:link>
            </li>          
            <li>
                <html:link action="/Action10MenuOficiosEstatico?oficio=VENDEDOR">
                    VENDEDOR
                </html:link>
            </li>            
        </ul>
    </body>
</html>
