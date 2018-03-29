let counter = 0;

const handleButtonClick = function () {
  console.log("handleButtonClick");
  const pTag = document.querySelector("#button-result");
  counter += 1;
  pTag.innerText = "OK, I clicked it " + counter;
};

const handleInputKeyUp = function () {
  console.log(this);
  console.log("handleInputKeyUp");
  const pText = document.querySelector("#text-result");
  // const input = document.querySelector("input");
  // console.log(input.value);
  // // console.log(input.innerText.value);
  // pText.innerText = input.value;
  pText.innerText = this.value;
};

const handleOptionChange = function () {
  console.log("handleOptionChange");
  const pTag = document.getElementById("select-result");
  console.log(this);
  pTag.innerText = this.value + ". Excellent! deedle deedle";
};


const app = function(){
  const button = document.querySelector("button");
  button.addEventListener("click", handleButtonClick);

  const input = document.querySelector("input");
  input.addEventListener("keyup", handleInputKeyUp);

  const select = document.querySelector("select");
  select.addEventListener("change", handleOptionChange);

};

window.addEventListener("load", app);
