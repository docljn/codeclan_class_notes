const generateWeatherData = function (airQualityObject) {

  const weatherDiv = document.getElementById("weather");
  weatherDiv.innerHTML = "";

  const nearestWeatherStation = airQualityObject.data.city + ", " + airQualityObject.data.country;

  const weatherData =  airQualityObject.data.current.weather;

  const weatherIconSource = "https://airvisual.com/images/" + weatherData.ic + ".png"

  const currentTemperature = weatherData.tp

  const htmlDegrees = "℃"


  // make html elements needed

  const stationHeading = document.createElement("h3");
  stationHeading.innerText = "Nearest Weather Station";

  const weatherUL = document.createElement("ul");

  const icon = document.createElement("img")
  icon.src = weatherIconSource;
  icon.width = "50";

  const liStation = document.createElement("li");
  liStation.innerText = nearestWeatherStation;

  const liTemp = document.createElement("li");
  liTemp.innerText = currentTemperature + htmlDegrees;

  weatherUL.appendChild(icon);
  weatherUL.appendChild(liTemp);
  weatherUL.appendChild(liStation);

  weatherDiv.appendChild(stationHeading);
  weatherDiv.appendChild(weatherUL);

};


/*const nameHeading = document.createElement("h2");
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

descriptionDiv.appendChild(img);
descriptionDiv.appendChild(nameHeading);
descriptionDiv.appendChild(ul);*/
