let map;
var lat = $('.mapa').attr('data-latitude')
var lng = $('.mapa').attr('data-longitude')
    function initMap(lat, lng) {
            map = new google.maps.Map(document.getElementById("map"), {
                center: { lat, lng },
                zoom: 8
            });
        }
initMap(parseFloat(lat), parseFloat(lng))