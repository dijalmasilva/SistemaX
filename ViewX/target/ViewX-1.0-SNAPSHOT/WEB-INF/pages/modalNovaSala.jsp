<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div id="novaSala" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Nova Sala</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/managerSala/add">
                    <div>
                        <br>
                        <input type="text" name="nome" placeholder="Sala" class="form-control"
                               required="" autofocus="" maxlength="50"/><br>
                        <select name="bloco" class="form-control">
                            <c:forEach items="${blocos}" var="bloco">
                                <option value="${bloco.nome}">${bloco.nome}</option>
                            </c:forEach>
                        </select>
                        <br>
                        <input type="number" name="capacidade" placeholder="Capacidade" class="form-control"
                               required="" min="1"/><br>
                        <select name="tipo" class="form-control">
                            <option value="COMUM">COMUM</option>
                            <option value="INTELIGENTE">INTELIGENTE</option>
                            <option value="LABORATORIO">LABORATORIO</option>
                            <option value="OFICINA">OFICINA</option>
                        </select>
                        <br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Cadastrar"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>