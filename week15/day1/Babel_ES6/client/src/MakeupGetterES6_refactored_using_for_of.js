class MakeupGetterES6 {

  constructor(brand){
    this.brand = brand;
    this.products = [];
  }

  fetchProducts(){
    const url = `http://makeup-api.herokuapp.com/api/v1/products.json?brand=${this.brand}`;

    const xhr = new XMLHttpRequest();

    xhr.open('GET', url);
    xhr.addEventListener('load', function () {
      this.products = JSON.parse(xhr.responseText);

      for (const [index, value] of this.products.entries()){
        console.log('product at index', index, 'in loop:', value);
      }

      console.log('i after loop:', index);

    }.bind(this));

    xhr.send();
  }

}

module.exports = MakeupGetterES6;
