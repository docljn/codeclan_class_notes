
/* // this doesn't work as written: the DOM has not loaded at this point and hence tag is null;
let tag = document.getElementById("intro");

tag.innerHTML = "Oepsie!";
CARE: innerHTML can include tags etc, so generally better to use innerText
*/

//don't do: window.onload = function () {}; - it overwrites anything else onload was set to call previously

const app = function(){
  let tag = document.getElementById("intro");
  tag.innerText = "Hello Dolly!";
};

document.addEventListener("DOMContentLoaded", app);
// app is now a callback, called when the DOMContentLoaded event happens
// CARE: don't invoke app() as otherwise it is called immediately
