/*alternative export can be written as
export default class MakeupGetterES6 {...}*/

class MakeupGetterES6 {

  constructor(brand){
    this.brand = brand;
    this.products = [];
  }

  fetchProducts(){
    const url = `http://makeup-api.herokuapp.com/api/v1/products.json?brand=${this.brand}`;

    const xhr = new XMLHttpRequest();

    xhr.open('GET', url);
    xhr.addEventListener('load', () => {
      this.products = JSON.parse(xhr.responseText);

      for (const [index, value] of this.products.entries()){
        console.log('product at index', index, 'in loop:', value);
      }
      /*
      console.log('i after loop:', index); // index isn't defined here because const and let are scoped to the nearest enclosing block, not the nearest function block like var
      */
    });

    xhr.send();
  }

}

// different syntax for exporting a module when we are using a class and ES6
export default MakeupGetterES6;
