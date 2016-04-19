/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

function selectRow(id){
    
}

function selectRowName(nome, id){
    console.log('selecionou!');
    $('#idBloco').val(id);
    $('#nomeNovo').val(nome);
}

function loadFoto(valor){
    var reader = new FileReader(valor);
    reader.onload = function (e) {
        setImage(e.target.result);
    };
    
    reader.readAsDataURL(valor.files[0]);
}

function loadPicture(valor){
    var reader = new FileReader(valor);
    reader.onload = function (e) {
        setImage(e.target.result);
    };
    
    reader.readAsDataURL(valor.files[0]);
}

function loadFotoPerfil(valor){
    var reader = new FileReader(valor);
    reader.onload = function (e) {
        setImagePerfil(e.target.result);
    };
    
    reader.readAsDataURL(valor.files[0]);
}

function setImage(image){
    $('#img-loader').attr('src', image);
}

function setImagePerfil(image){
    $('#img-loader__perfil').attr('src', image);
}

function escolherFoto(){
    $('#inp-foto').trigger("click");
}

function escolherFotoPerfil(){
    $('#inp-foto__perfil').trigger("click");
}

function resetColors(){
    $('tr').removeClass('tr-select');
}

function changeColor(row){
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