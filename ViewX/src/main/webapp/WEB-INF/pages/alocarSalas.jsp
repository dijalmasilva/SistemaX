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
                <li>Alocar Sala</li>
            </ul>
        </div>
        <%@include file="modalNovoEvento.jsp" %>
        <%@include file="modalResposta.jsp" %>
        <div class="dj-section">
            <div class="dj-list__funcionalidades">
                <ul>
                    <li>
                        <div>
                            <button data-toggle="modal" data-target="#novoEvento" class="dj-button btn-primary">
                                <img src="/assets/icons/newEvent.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-danger">
                                <img src="/assets/icons/calendarRemove.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button data-toggle="modal" data-target="#novoCliente" class="dj-button btn-primary">
                                <img src="/assets/icons/locker.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-danger">
                                <img src="/assets/icons/unlocker.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-warning">
                                <img src="/assets/icons/return.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-default" onclick="buscar()">
                                <img src="/assets/icons/search_black.png">
                            </button>
                        </div>
                    </li>
                </ul>
            </div>
            <input class="form-control" type="search" placeholder="Buscar" id="buscar" autofocus="">
            <div>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Data</th>
                            <th>Duração</th>
                            <th>Evento</th>
                            <th>Situação</th>
                            <th>Local</th>
                        </tr>
                    </thead>
                    <tbody id="ubody">
                        <c:forEach items="${eventos}" var="evento">
                            <tr onclick="selectRow(${evento.id}); changeColor(this);">
                                <td>${evento.inicio}</td>
                                <td>30h30m00</td>
                                <td>${evento.nome}</td>
                                <td>Agendado</td>
                                <td>${evento.local.nome} - ${evento.local.bloco.nome}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <br>
            </div>
        </div>
        <c:if test="${result != null}">
            <button data-toggle="modal" data-target="#modal" class="invisible" id="showModal">
        </c:if>
    </body>
    <%@include file="javascripts.jsp" %>
</html>
