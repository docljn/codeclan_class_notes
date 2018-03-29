const generateHtml = function (countryObject) {

  const statsDiv = document.getElementById("stats");
  statsDiv.innerHTML = "";

  const flagDiv = document.getElementById("flag");
  flagDiv.innerHTML = "";

  const name = countryObject.name;
  const capital = countryObject.capital;
  const population = countryObject.population;
  const adjective = countryObject.demonym;
  const flag = countryObject.flag;
  const region = countryObject.region;

  const nameHeading = document.createElement("h2");
  nameHeading.innerText = name;

  const img = document.createElement("img");
  img.height = 100;
  img.src = flag;
  img.alt = adjective + " Flag";
  img.id = "flag";

  const ul = document.createElement("ul");

  const li = document.createElement("li");
  li.innerText = "Capital: " + capital + "\n" + "Population: " + population;

  ul.appendChild(li);
  statsDiv.appendChild(nameHeading);
  statsDiv.appendChild(ul);

  flagDiv.appendChild(img);


  displayGraph(countryObject);


};
