<%-- 
    Document   : index
    Created on : 12/03/2016, 14:10:42
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <c:if test="${result != null}">
        <%@include file="notification.jsp" %>
    </c:if>
    <body class="text-center dj-background__vermelho">
        <br><br><br><br>
        <img src="/assets/icons/SistemaX.png" width="400"/>
        <br><br><br><br>
    <form class="form-group dj-form" action="/index/logar" method="post">
        <div class="form-group">
            <input  class="form-control text-center" type="text" placeholder="Nome de usuário / Email" name="login" autofocus="" required="">
        </div>
        <div class="form-group">
            <input  class="form-control text-center" type="password" placeholder="Senha" name="senha" required="">
        </div>
        <div>
            <div>
                <a href="#" class="dj-color__withe">Esqueci minha senha</a>
                <input type="checkbox" id="lembrar" name="lembrar" class="dj-margin__left"/>
                <label for="lembrar">Lembrar</label>
            </div>
            <br>
            <input type="submit" class="btn btn-primary btn-lg" value="Login">
        </div>
    </form>
</body>
</html>
