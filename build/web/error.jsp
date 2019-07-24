<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.StringWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>AS ELECTRON S.A.S</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--PLUGINS-->
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="assets/js/jquery.min.js" type="text/javascript"></script>
        <script src="assets/js/popper.js" type="text/javascript"></script>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>

        <%@include file="components/navbar.jsp" %>
        <br>

        <div class="container">
            <div class="row">
                <div class="col">
                    <h1>Error 404!</h1>
                    <h3>Page not found</h3>
                    <br><br>

                    <%--<%= exception.getMessage()%>
                    <%
                        StringWriter stringWriter = new StringWriter();
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        exception.printStackTrace(printWriter);
                        out.println(stringWriter);
                        printWriter.close();
                        stringWriter.close();
                    %>--%>

                </div>
            </div>
        </div>
    </body>
</html>
