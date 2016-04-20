<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div id="novoMaterial" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Novo Usuário</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/managerMaterial/add">
                    <div>
                        <input type="text" name="nome" placeholder="Material" class="form-control"
                               required="" autofocus=""/><br>
                        <input type="number" min="1" name="quantidade" placeholder="Quantidade" class="form-control" required=""/><br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Cadastrar"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>