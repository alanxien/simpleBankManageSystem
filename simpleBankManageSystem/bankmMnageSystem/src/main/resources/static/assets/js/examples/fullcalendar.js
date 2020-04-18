'use strict';
$(document).ready(function () {

    var events = [
        {
            title: 'Travel',
            start: '2019-10-30:00:00',
            constraint: 'businessHours',
            className: 'bg-danger',
            icon: "camera",
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            title: 'Team Assing',
            start: '2019-10-15:00:00',
            constraint: 'availableForMeeting',
            className: 'bg-primary',
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            title: 'Friend',
            start: '2019-10-10:00:00',
            end: '2019-10-11:00:00',
            className: 'bg-info',
            icon: "user-o",
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            title: 'Holidays',
            start: '2019-10-10:00:00',
            end: '2019-10-12:00:00',
            className: 'bg-success',
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            title: 'Company',
            start: '2019-10-03:00:00',
            className: 'bg-warning',
            icon: "building-o",
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            id: 'availableForMeeting',
            start: '2019-03-13T10:00:00',
            end: '2019-03-13T16:00:00',
            rendering: 'background',
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            start: '2019-03-24',
            end: '2019-03-29',
            overlap: false,
            rendering: 'background',
            color: '#ff9f89',
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        },
        {
            start: '2019-03-06',
            end: '2019-03-29',
            overlap: false,
            rendering: 'background',
            color: '#ff9f89',
            description: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras eu pellentesque nibh. In nisl nulla, convallis ac nulla eget, pellentesque pellentesque magna.',
        }
    ];

    $('#external-events .fc-event').each(function () {

        // store data so the calendar knows to render an event upon drop
        $(this).data('event', {
            title: $.trim($(this).text()), // use the element's text as the event title
            stick: true, // maintain when user navigates (see docs on the renderEvent method),
            color: $(this).find('i').css("color"),
            icon: $(this).find('i').data('icon')
        });

        // make the event draggable using jQuery UI
        $(this).draggable({
            zIndex: 999,
            revert: true,      // will cause the event to go back to its
            revertDuration: 0  //  original position after the drag
        });

    });

    $('#calendar-demo').fullCalendar({
        header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay,listMonth'
        },
        editable: true,
        droppable: true,
        drop: function () {
            // is the "remove after drop" checkbox checked?
            if ($('#drop-remove').is(':checked')) {
                // if so, remove the element from the "Draggable Events" list
                $(this).remove();
            }
        },
        weekNumbers: true,
        eventLimit: true, // allow "more" link when too many events
        events: events,
        eventRender: function (event, element) {
            if (event.icon) {
                element.find(".fc-title").prepend("<i class='mr-1 fa fa-" + event.icon + "'></i>");
            }
        },
        dayClick: function () {
            $('#createEventModal').modal();
        },
        eventClick: function (event, jsEvent, view) {
            var modal = $('#viewEventModal');
            modal.find('.event-icon').html("<i class='fa fa-" + event.icon + "'></i>");
            modal.find('.event-title').html(event.title);
            modal.find('.event-body').html(event.description);
            modal.modal();
        },
    });
});