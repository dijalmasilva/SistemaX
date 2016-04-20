<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Modal -->
<div id="novoCliente" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Novo Usuário</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/manageUser/add" enctype="multipart/form-data">
                    <div class="dj-user__info">
                        <input type="text" name="nome" placeholder="Nome de Usuário" class="form-control"
                               required="" autofocus="" pattern="[a-zA-Z0-9]"/><br>
                        <input type="password" name="senha" placeholder="Senha" class="form-control" required=""/><br>
                        <input type="email" name="email" placeholder="Email" class="form-control" required=""/><br>
                        <input type="text" name="matricula" placeholder="Matricula" minlength="6" maxlength="6" class="form-control"
                               required="" title="A matricula deve conter 6 caracteres númericos."/><br>
                        <select class="form-control" name="tipo" >
                            <option value="ADMINISTRADOR">ADMINISTRADOR</option>
                            <option value="ALUNO">ALUNO</option>
                            <option value="ASSISTENTE_DE_SALA">ASSISTENTE_DE_SALA</option>
                            <option value="MONITOR">MONITOR</option>
                            <option value="PROFESSOR">PROFESSOR</option>
                        </select><br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Cadastrar"/>
                        </div>
                    </div>
                    <div class="dj-user__img">
                        <img id="img-loader" src="/assets/images/perfil-nerd.jpg" width="200" height="200"><br><br>
                        <button class="btn btn-default" id="btn-foto" value="Enviar Foto" onclick="escolherFoto()"><span id="text-foto">Enviar Foto</span></button>
                        <input type="file" value="Enviar arquivo" name="foto" class="invisible" id="inp-foto" onchange="loadPicture(this)"/>
                    </div>
                    <br><br>
                </form>
            </div>
        </div>
    </div>
</div>