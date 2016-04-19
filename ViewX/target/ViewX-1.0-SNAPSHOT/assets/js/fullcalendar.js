/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function (){
   
     $('#calendar').fullCalendar({
        ignoreTimezone: false,
        monthNames: ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro'],
        monthNamesShort: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'],
        dayNames: ['Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sabado'],
        dayNamesShort: ['Dom', 'Seg', 'Ter', 'Qua', 'Qui', 'Sex', 'Sab'],
        buttonText: {
            today: "Hoje",
            month: "Mês",
            week: "Semana",
            day: "Dia"
        },
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay'
        },
        selectable: true,
        select: function (start, end, event) {
            fecharBotoesFeriados();
        },
        editable: true,
        eventLimit: true,
        events: {
            url: 'getEventos.json'
        },
        eventClick: function (event, element) {

            if (event) {
                var moment = $('#calendar').fullCalendar('getDate').format();
               
                
                liberarBotoesFeriados();
                $('#nomeFeriado').val(event.title);
                $('#dataFeriado').val(data);
                alert($('#nomeFeriado').val());
                alert($('#dataFeriado').val());
            }
        }

    });
});