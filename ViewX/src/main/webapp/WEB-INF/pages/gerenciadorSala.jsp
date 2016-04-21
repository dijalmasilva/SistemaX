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
                <li>Gerenciar Salas</li>
            </ul>
        </div>
        <%@include file="modalNovaSala.jsp" %>
        <%@include file="modalEditarSala.jsp" %>
        <%@include file="modalResposta.jsp" %>
        <div class="dj-section">
            <div class="dj-list__funcionalidades">
                <ul>
                    <li>
                        <div>
                            <button data-toggle="modal" data-target="#novaSala" class="dj-button btn-primary">
                                <img src="/assets/icons/add_black.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button class="dj-button btn-warning" data-toggle="modal" data-target="#editarSala" disabled="" id="editSala">
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
                            <th>Sala</th>
                            <th>Bloco</th>
                            <th>Capacidade</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody id="ubody">
                        <c:forEach items="${rooms}" var="room">
                            <tr onclick="selectRowSala(${room.id}, '${room.nome}', '${room.bloco.nome}', ${room.capacidade}, '${room.tipo}'); changeColor(this);">
                                <td>${room.nome}</td>
                                <td>${room.bloco.nome}</td>
                                <td>${room.capacidade}</td>
                                
                                <td>DISPONIVEL</td>
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
</html>
