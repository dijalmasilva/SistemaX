<%-- 
    Document   : gerenciadorUsuario
    Created on : 13/03/2016, 09:20:39
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="head.jsp" %>
    <body>
        <%@include file="header.jsp" %>
        <div class="dj-breadcrumb">
            <ul>
                <li><a href="/home">Home</a> ></li>
                <li>Gerenciar Feriado</li>
            </ul>
        </div>
        <%@include file="modalResposta.jsp" %>
        <div class="dj-section">
            <div class="dj-list__funcionalidades">
                <ul>
                    <li>
                        <div>
                            <button data-toggle="modal" data-target="#novoCliente" class="dj-button btn-primary">
                                <img src="/assets/icons/add_black.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-warning" disabled="">
                                <img src="/assets/icons/edit_black.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-danger" disabled="">
                                <img src="/assets/icons/trash.png" class="dj-img__menor">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div class="text-right">
                            <input type="file" class="invisible" >
                            <button type="button" class="btn btn-default btn-lg">Importar .csv</button>
                        </div>
                    </li>
                </ul>
            </div>
            <div>
                <hr>
                <div id="calendar">

                </div>
            </div>
        </div>
        <c:if test="${result != null}">
            <button data-toggle="modal" data-target="#modal" class="invisible" id="showModal">
        </c:if>
    </body>
</html>
