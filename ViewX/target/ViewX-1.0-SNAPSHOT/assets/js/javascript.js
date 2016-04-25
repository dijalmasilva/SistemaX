/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var bloco = null;

$(document).ready(function () {

    abrirModalNotificacao();

    //filtro na tabela de clientes cadastrados
    $("#buscar").keyup(function () {
        //split the current value of searchInput
        var data = this.value.split(" ");
        //create a jquery object of the rows
        var jo = $("#ubody").find("tr");
        if (this.value === "") {
            jo.show();
            return;
        }
        //hide all the rows
        jo.hide();

        //Recusively filter the jquery object to get results.
        jo.filter(function (i, v) {
            var $t = $(this);
            for (var d = 0; d < data.length; ++d) {
                if ($t.is(":contains('" + data[d] + "')")) {
                    return true;
                }
            }
            return false;
        })
                //show the rows that match.
                .show();
    }).focus(function () {
        this.value = "";
        $(this).css({
            "color": "black"
        });
        $(this).unbind('focus');
    }).css({
        "color": "#C0C0C0"
    });
});

var clickBuscar = 0;

function buscar() {
    if (clickBuscar === 0) {
        $('#buscar').fadeIn(200);
        $('#buscar').focus();
        clickBuscar++;
    } else {
        $('#buscar').fadeOut(200);
        clickBuscar--;
    }
}

function selectRow(id, nome, senha, email, matricula) {
    idUsuarioSelecionado = id;
    $('#idUsuarios').val(id);
    $('#nomeUsuarios').val(nome);
    $('#senhaUsuarios').val(senha);
    $('#emailUsuarios').val(email);
    $('#matriculaUsuarios').val(matricula);    
}

function excluirUsuario() {
    b = window.confirm("Deseja realmente remover este Usuario?");
    if (b) {
        $('#removeUsuario').val(idUsuarioSelecionado);
        $('#subRemoveUsuario').trigger('click');
    } 
}

idClicado = -1;
function liberarBotoes(idUsuario) {

    if (idClicado === -1) {
        $('#edit').removeAttr('disabled');
        $('#remove').removeAttr('disabled');
        $('#linha' + idUsuario).addClass('rowSelect');
        b = false;
    } else if (idUsuario !== idClicado) {
        $('#linha' + idClicado).removeClass('rowSelect');
        $('#linha' + idUsuario).addClass('rowSelect');
        b = false;
    } else {
        $('#linha' + idUsuario).removeClass('rowSelect');
        $('#edit').attr('disabled', '');
        $('#remove').attr('disabled', '');
        b = true;
    }

    idClicado = idUsuario;

    if (b) {
        idClicado = -1;
    }
}

function selectRowName(nome, id) {
    $('#idBloco').val(id);
    $('#nomeNovo').val(nome);
    $("input#remove-id").attr("value", id);
}

function selectRowSala(id, nome, bloco, capacidade, tipo) {
    $('#editSala').removeAttr('disabled');
    $('#idSala').val(id);
    $('#nomeSala').val(nome);
    $('#blocoSala').val(bloco);
    $('#blocoSala').text(bloco);
    $('#capacidadeSala').val(capacidade);
    $('#tipoSala').val(tipo);
    $('#tipoSala').text(tipo);
}

function loadFoto(valor) {
    var reader = new FileReader(valor);
    reader.onload = function (e) {
        setImage(e.target.result);
    };

    reader.readAsDataURL(valor.files[0]);
}

function loadPicture(valor) {
    var reader = new FileReader(valor);
    reader.onload = function (e) {
        setImage(e.target.result);
    };

    reader.readAsDataURL(valor.files[0]);
}

function loadFotoPerfil(valor) {
    var reader = new FileReader(valor);
    reader.onload = function (e) {
        setImagePerfil(e.target.result);
    };

    reader.readAsDataURL(valor.files[0]);
}

function setImage(image) {
    $('#img-loader').attr('src', image);
}

function setImagePerfil(image) {
    $('#img-loader__perfil').attr('src', image);
}

function escolherFoto() {
    $('#inp-foto').trigger("click");
}

function escolherFotoPerfil() {
    $('#inp-foto__perfil').trigger("click");
}

function resetColors() {
    $('tr').removeClass('tr-select');
}

function changeColor(row) {
    resetColors();
    $(row).addClass('tr-select');
}

function abrirModalNotificacao() {
    console.log("modal abriu!");
    modal = $('#notificacao');
    modal.fadeIn(100);
    modal.animate({
        bottom: "+=20px"
    }, 400);

    setTimeout(function () {
        modal.fadeOut(600);
        modal.animate({
            bottom: "-=20px"
        });
    }, 5000);
}

function excluirFeriado() {
    b = window.confirm("Deseja realmente remover este feriado?");
    if (b) {
        $('#removeFeriado').val(tituloDoEvento);
        $('#subRemoveFeriado').trigger('click');
    }
}