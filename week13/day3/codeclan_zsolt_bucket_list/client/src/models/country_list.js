const CountryList = function(url) {
  this.countries = [];
  this.onUpdate = null;
  this.url = url;
};

CountryList.prototype.populate = function(){
    const request = new XMLHttpRequest();
    request.open("GET", this.url);
    console.log("After calling GET in populate");
    request.onload = function() {
        if (request.status === 200) {
            const jsonString = request.responseText;
            const countries = JSON.parse(jsonString);
            this.countries = countries;
            this.onUpdate(countries);
            console.log("After calling onUpdate in CountryList.populate");
        }
    }.bind(this);
    request.send(null);
}

CountryList.prototype.addCountry = function(country){
    this.countries.push(country);
    // NB: commented out for bug hunt:
    // result is nothing in countries array, nothing displayed in bucketlist div, and one country in database
    // if you call get on "/" then the multiple countries are displayed again
    // the bug is *NOT* in this bit, then
    this.onUpdate(this.countries);
    //persist
    const request = new XMLHttpRequest();
    request.open("POST", this.url);
    request.setRequestHeader("Content-Type", "application/json");
    request.onload = function() {
      if(request.status === 200) {
      }
    };
    request.send( JSON.stringify( {country: country} ) );
}
module.exports = CountryList;
