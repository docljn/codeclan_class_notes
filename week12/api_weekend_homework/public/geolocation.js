//  correct request for location data:   https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&key=YOUR_API_KEY

const geolocator = function (location) {

  const url = API_LOCATIONS.googleGeocoding.url;
  const key = API_LOCATIONS.googleGeocoding.key;

  let completeURL = url + "latlng=" + location.lat + "," + location.lng + "&result_type=country" + "&key=" + key;

  makeGeoRequest(completeURL, carryOutAPIRequest);

};

// get data from api (call in app, after DOMContentLoaded event)
const makeGeoRequest = function (url, callback) {
  const request = new XMLHttpRequest();
  request.open("GET", url);
  request.addEventListener("load", callback);
  request.send();
};

const carryOutAPIRequest = function () {
  if(this.status !== 200) return;
  const jsonString = this.responseText;
  // call a function which will get the json back in a usable format in the main app?
  fetchCountry(jsonString);


};
