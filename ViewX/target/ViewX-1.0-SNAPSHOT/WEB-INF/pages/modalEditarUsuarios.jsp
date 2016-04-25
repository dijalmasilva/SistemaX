<%-- 
    Document   : modalCliente
    Created on : 24/02/2016, 09:46:53
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>


<!-- Modal -->
<div id="editarUsuarios" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h2 class="modal-title">Editar Usuário</h2>
            </div>
            <div class="modal-body">
                <form class="form-group" method="post" action="/home/manageUser/editUsuarios" enctype="multipart/form-data">
                    <div class="dj-user__info">
                        <input type="number" name="id" class="invisible" id="idUsuarios"/>
                        <input id="nomeUsuarios" type="text" name="nome" placeholder="Nome de Usuário" class="form-control"
                               required="" autofocus="" value="" pattern="[a-zA-Z0-9.\s]+$"/><br>
                        <input id="senhaUsuarios" type="password" name="senha" placeholder="Senha" class="form-control" required="" value=""
                               minlength="8"/><br>
                        <input id="emailUsuarios" type="email" name="email" placeholder="Email" class="form-control" required="" value="" /><br>
                        <input id="matriculaUsuarios" type="text" name="matricula" placeholder="Matricula" minlength="6" maxlength="6" class="form-control"
                               required="" title="A matricula deve conter 6 caracteres númericos." value=""/><br>
                        <select class="form-control" name="tipo" >
                            <option value="ADMINISTRADOR">ADMINISTRADOR</option>
                            <option value="ALUNO">ALUNO</option>
                            <option value="ASSISTENTE_DE_SALA">ASSISTENTE_DE_SALA</option>
                            <option value="MONITOR">MONITOR</option>
                            <option value="PROFESSOR">PROFESSOR</option>
                        </select><br>
                        <div class="text-right">
                            <input type="submit" class="btn btn-primary btn-lg" value="Editar"/>
                        </div>
                    </div>
                    <div class="dj-user__img">                        
                        <img id="img-loader__perfil2" src="" width="200" height="200" ><br><br>
                        <button type="button" class="btn btn-default" onclick="escolherFotoPerfil()">Enviar Foto</button>
                        <input type="file" name="foto" class="invisible" id="inp-foto__perfil" onchange="loadFotoPerfil(this)"/>
                    </div>
                    <br><br>
                </form>
            </div>
        </div>
    </div>
</div>