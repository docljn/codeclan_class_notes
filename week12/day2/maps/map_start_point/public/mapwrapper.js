/*global google*/

const MapWrapper = function (container, coordinates, zoom) {
  console.log(this);
  this.googleMap = new google.maps.Map(container, {
    center: coordinates,
    zoom: zoom
  });
};

MapWrapper.prototype.addMarker = function (coordinates) {
  const marker = new google.maps.Marker({
    position: coordinates,
    map: this.googleMap
  });
};

MapWrapper.prototype.addClickEvent = function () {
  google.maps.event.addListener(this.googleMap, "click", function (event) {
    const markerCoordinates = { lat: event.latLng.lat(), lng: event.latLng.lng() };
    this.addMarker(markerCoordinates);
  }.bind(this));
};
