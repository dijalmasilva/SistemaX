<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div id="importarFeriado" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Importar Feriados</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/managerFeriado/import" enctype="multipart/form-data">
                    <div class="dj-user__img">                                                
                        <br><br>
                        <input type="file" value="Enviar arquivo" name="arquivoCsv"/>
                        <br><br>
                        <input type="checkbox" class="mdl-switch__input" name="sobrescrever" id="sobrescrever">
                        <span class="mdl-switch__label">Sobrescrever feriados</span>
                    </div>
                    <div class="dj-user__info">                        
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Importar"/>
                        </div>                        
                    </div><br>
                    <br><br>
                </form>
            </div>
        </div>
    </div>
</div>