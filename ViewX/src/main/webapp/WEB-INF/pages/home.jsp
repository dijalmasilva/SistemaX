<%-- 
    Document   : home
    Created on : 12/03/2016, 20:08:07
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body class="">
        <%@include file="header.jsp" %>
        <div class="dj-breadcrumb">
            <ul>
                <li>Home</li>
            </ul>
        </div>
        <div class="dj-section">
            <div class="modal-header">
                <h2 class="dj-section__title">Funcionalidades</h2>
            </div>
            <c:if test="${usuario.tipo == 'ADMINISTRADOR'}">
                <br>
                <div class="dj-list__funcionalidades">
                    <ul>
                        <li>
                            <img src="/assets/icons/manager3.png" width="40"><br>
                            <a href="/home/manageUser">Gerenciar Usuários</a>
                        </li>
                        <li>
                            <img src="/assets/icons/rest5.png" width="40"><br>
                            <a href="/home/managerFeriado">Gerenciar Feriados</a>
                        </li>
                        <li>
                            <img src="/assets/icons/class.png" width="40"><br>
                            <a href="/home/managerSala">Gerenciar Salas</a>
                        </li>
                        <li>
                            <img src="/assets/icons/material.png" width="40"><br>
                            <a href="/home/managerMaterial">Gerenciar Material</a>
                        </li>
                        <li>
                            <img src="/assets/icons/blocos.png" width="40"><br>
                            <a href="/home/managerBloco">Gerenciar Bloco</a>
                        </li>
                        <li>
                            <img src="/assets/icons/alocar.png" width="40"><br>
                            <a href="/home/alocarSala">Alocar Salas</a>
                        </li>
                    </ul>
                </div>
            </c:if>
        </div>
    </body>
    <%@include file="javascripts.jsp" %>
</html>
