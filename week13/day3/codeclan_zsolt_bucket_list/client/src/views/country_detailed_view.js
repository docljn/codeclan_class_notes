const CountryDetailView = function(element) {
  this.element = element;
  this.onAdd = console.log;
};

CountryDetailView.prototype.render = function(country){
    const tags = this.element.querySelectorAll('p');
    tags[0].innerText = country.name;
    tags[1].innerText = country.population;
    tags[2].innerText = country.capital;
    const addButton = this.element.querySelector('#add-button');
    addButton.addEventListener('click', function() {
      this.onAdd(country);
    }.bind(this));
}

module.exports = CountryDetailView;
