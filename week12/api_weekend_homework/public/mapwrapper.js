/*global google*/

const MapWrapper = function (container, coordinates, zoom) {
  this.markerArray = [];
  this.googleMap = new google.maps.Map(container, {
    center: coordinates,
    zoom: zoom,
  });
};

MapWrapper.prototype.addMarker = function (coordinates) {
  const marker = new google.maps.Marker({
    position: coordinates,
    map: this.googleMap
  });
  return marker;
};


MapWrapper.prototype.addClickEvent = function () {
  google.maps.event.addListener(this.googleMap, "click", function (event) {
    if (this.markerArray.length !== 0){
      const oldMarker = this.markerArray[0];
      oldMarker.setMap(null);
      this.markerArray = [];}
    const clickCoordinates = { lat: event.latLng.lat(), lng: event.latLng.lng() };
    geolocator(clickCoordinates);
    getAirQuality(clickCoordinates);
    const marker = this.addMarker(clickCoordinates);
    this.markerArray.push(marker);
    this.googleMap.setCenter(clickCoordinates);
    this.googleMap.setZoom(5);
  }.bind(this));
};
