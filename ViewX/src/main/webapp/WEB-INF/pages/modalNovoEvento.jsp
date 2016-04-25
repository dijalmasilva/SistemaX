<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div id="novoEvento" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Novo Evento</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/managerSala/add">
                    <div>
                        <br>
                        <input type="text" name="nome" placeholder="Nome" class="form-control"
                               required="" autofocus="" maxlength="50"/><br>
                        <textarea class="form-control" name="descricao" placeholder="Descriçao"></textarea>
                        <br>
                        <input type="number" name="participantes" placeholder="Participantes" class="form-control"
                               required="" min="1"/><br>
                        <select name="tipo" class="form-control">
                            <c:choose>
                                <c:when test="${usuario.tipo eq 'ASSISTENTE_DE_SALA'}">
                                    <c:forEach items="${users}" var="user">
                                        <option value="${user.id}">${user.nome}</option>
                                    </c:forEach>
                                </c:when>
                                <c:otherwise>
                                    <option value="${usuario.id}">${usuario.nome}</option>
                                </c:otherwise>
                            </c:choose>
                        </select><br>
                        <div class="text-left">
                            <label>Início</label>
                        </div>
                        <input class="form-control" name="inicio" placeholder="Início" type="datetime-local" /><br>
                        <div class="text-left">
                            <label>Fim</label>
                        </div>
                        <input class="form-control" name="termino" placeholder="Fim" type="datetime-local" /><br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Salvar"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>