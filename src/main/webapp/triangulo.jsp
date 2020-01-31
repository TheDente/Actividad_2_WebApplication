<%-- 
    Document   : triangulo
    Created on : Jan 30, 2020, 9:07:20 PM
    Author     : The_Dente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="calculos.triangulo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculo del area y perimetro</title>
    </head>
    <body>
        <%
            String base=request.getParameter("base");
            String altura=request.getParameter("altura");
            
           triangulo t=new triangulo(base,altura);
           t.calperimetro();
           t.calarea();
           
           float perimetro = t.getPerimetro();
           float area = t.getArea();
            
            %>
            
        <h2>El perimetro del triangulo equilatero es (cm): </h2>
        <%=perimetro%> <br>
        <h2>El area del triangulo equilatero es (cm): </h2>
        <%=area%><br>
    </body>
</html>
