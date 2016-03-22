<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>


<!-- Modal -->
<div id="editarUsuario" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Editar Usuário</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/editProfile" enctype="multipart/form-data">
                    <div class="dj-user__info">
                        <input type="text" name="nome" placeholder="Nome de Usuário" class="form-control"
                               required="" autofocus="" value="${usuario.nome}"/><br>
                        <input type="password" name="senha" placeholder="Senha" class="form-control" required="" value="${usuario.senha}"/><br>
                        <input type="email" name="email" placeholder="Email" class="form-control" required="" value="${usuario.email}" disabled=""/><br>
                        <input type="text" name="matricula" placeholder="Matricula" minlength="6" maxlength="6" class="form-control"
                               required="" title="A matricula deve conter 6 caracteres númericos." value="${usuario.matricula}" disabled=""/><br>
                        <select class="form-control" name="tipo" disabled="">
                            <option value="${usuario.tipo}">${usuario.tipo}</option>
                        </select><br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Editar"/>
                        </div>
                    </div>
                    <div class="dj-user__img">
                        <img id="img-loader__perfil" src="/home/image/${usuario.id}" width="200" height="200"><br><br>
                        <button type="button" class="btn btn-default" onclick="escolherFotoPerfil()">Enviar Foto</button>
                        <input type="file" name="foto" class="invisible" id="inp-foto__perfil" onchange="loadFotoPerfil(this)"/>
                    </div>
                    <br><br>
                </form>
            </div>
        </div>
    </div>
</div>