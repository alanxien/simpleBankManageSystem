'use strict';
$(document).ready(function () {

    $(document).on('click', 'a.tour', function(){
        Tour.run([
            {
                element: $('.header ul.navbar-nav li.nav-item:first'),
                content: 'This is the hamburger menu.',
                position: 'bottom'
            },
            {
                element: $('.header .search-form form'),
                content: 'This is the search form.',
                position: 'bottom'
            },
            {
                element: $('.page-header'),
                content: 'This page title',
                position: 'bottom'
            },
            {
                element: $('.main-content .card:first'),
                content: 'This page is content.',
                position: 'top'
            }
        ]);
    });

});