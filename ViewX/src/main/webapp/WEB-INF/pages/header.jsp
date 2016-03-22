<%-- 
    Document   : header
    Created on : 12/03/2016, 20:08:47
    Author     : Dijalma Silva <dijalmacz@gmail.com>
--%>

<header>
    <%@include file="modalEditarUsuario.jsp" %>
    <div class="dj-header">
        <div class="dj-info__usuario">
            <div class="dj-login">
                <h3 class="dj-color__withe text-capitalize">${usuario.nome}</h3>
                <div>
                    <h5><a href="#" data-toggle="modal" data-target="#editarUsuario">Editar Perfil</a> | <a href="/index/logout">Sair</a></h5>
                </div>
            </div>
            <div class="dj-perfil">
                <br>
                <img class="dj-img__perfil" id="img-perfil" src="/home/image/${usuario.id}">
            </div>    
        </div>
        <div class="dj-info__usuario-resp">
            <img src="/assets/icons/menu_black.png">
        </div>
        <div class="dj-info__sistema">
            <img src="/assets/icons/SistemaX.png">
            <br>
            <h5 class="dj-color__withe">Logado como ${usuario.tipo}</h5>
        </div>
    </div>
</header>