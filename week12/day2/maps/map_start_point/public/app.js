const initialize = function () {

  const mapDiv = document.querySelector("#main-map");
  const center = { lat: -29.780875, lng: 31.02881100000002 };
  const school = {lat: -29.778233, lng: 31.0396};
  const zoom = 15;

  const mainMap = new MapWrapper(mapDiv, center, zoom);

  mainMap.addMarker(center);
  mainMap.addMarker(school);
  mainMap.addClickEvent();

};

document.addEventListener("DOMContentLoaded", initialize);
