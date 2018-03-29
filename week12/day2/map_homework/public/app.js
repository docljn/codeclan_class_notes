const initialize = function(){
  const mapDiv = document.getElementById("main-map");

  const center = { lat: -29.780875, lng: 31.02881100000002 };
  const hell = { lat: 55.7342651, lng: 12.5419321 };

  const mainMap = new MapWrapper(mapDiv, center, 10);
  // const marker = mainMap.addMarker(center);
  mainMap.addClickEvent();

  const infowindow = new google.maps.InfoWindow({
    content: "Lorna's childhood home. 131 East View Road"
  });

  const marker = mainMap.addMarker(center);

  marker.addListener("click", function() {
    infowindow.open(mainMap, marker);
  });

  const bounceButton = document.querySelector("#button-bounce-markers");
  bounceButton.addEventListener("click", mainMap.bounceMarkers.bind(mainMap));


  // This is where it all goes wrong....

  const hellButton = document.querySelector("#button-goto-hell");
  hellButton.addEventListener("click", mainMap.moveMap.bind(mainMap,hell));

};

window.addEventListener("load", initialize);
