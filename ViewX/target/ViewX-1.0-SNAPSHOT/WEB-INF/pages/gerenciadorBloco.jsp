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
                <li>Gerenciar Blocos</li>
            </ul>
        </div>
        <%@include file="modalNovoBloco.jsp" %>
        <%@include file="modalEditarBloco.jsp" %>
        <%@include file="modalResposta.jsp" %>
        <div class="dj-section">
            <div class="dj-list__funcionalidades">
                <ul>
                    <li>
                        <div>
                            <button data-toggle="modal" data-target="#novoBloco" class="dj-button btn-primary">
                                <img src="/assets/icons/add_black.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <button data-toggle="modal" data-target="#editarBloco" class="dj-button btn-warning" >
                                <img src="/assets/icons/edit_black.png">
                            </button>
                        </div>
                    </li>
                    <li>
                        <div>
                            <form action="/home/managerBloco/remove" method="POST">
                                <input type="hidden" name="id" id="remove-id" />                                
                                <button class="dj-button btn-danger" id="bt-remove">                                    
                                    <img src="/assets/icons/trash.png" class="dj-img__menor">
                                </button>
                            </form>
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
                            <th>Nome do Bloco</th>
                        </tr>
                    </thead>
                    <tbody id="ubody">
                        <c:forEach items="${blocos}" var="bloco">
                            <tr onclick="selectRowName('${bloco.nome}', ${bloco.id});
                                    changeColor(this)">
                                <td>${bloco.nome}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <br>
            </div>
        </div>
        <c:if test="${result != null}">
            <button data-toggle="modal" data-target="#modal" class="invisible" id="showModal"></button>
        </c:if>
    </body>
</html>
