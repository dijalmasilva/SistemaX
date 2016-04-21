<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div id="editarSala" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Nova Sala</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/managerSala/edit">
                    <div>
                        <br>
                        <input type="number" class="invisible" name="id" id="idSala">
                        <input type="text" name="nome" placeholder="Sala" class="form-control"
                               required="" autofocus="" id="nomeSala"/><br>
                        <select name="bloco" class="form-control" disabled="">
                           <option value="" id="blocoSala"></option>
                        </select>
                        <br>
                        <input type="number" name="capacidade" placeholder="Capacidade" class="form-control"
                               required="" min="1" id="capacidadeSala"/><br>
                        <select name="tipo" class="form-control">
                            <option value="" id="tipoSala"></option>
                            <option value="COMUM">COMUM</option>
                            <option value="INTELIGENTE">INTELIGENTE</option>
                            <option value="LABORATORIO">LABORATORIO</option>
                            <option value="OFICINA">OFICINA</option>
                        </select>
                        <br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Editar"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>