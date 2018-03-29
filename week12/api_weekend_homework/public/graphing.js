/*global: Highcharts*/

const displayGraph = function (countryObject) {

  const divDetails = document.getElementById("details");
  divDetails.innerHTML = "";

  const borderingCountryTwoLetterCodes = countryObject.borders.map( function (threeLetterCode) {
    return localStorage.getItem(threeLetterCode);
  });

  const borderingCountriesObjects = borderingCountryTwoLetterCodes.map( function (code) {
    return JSON.parse(localStorage.getItem(code));
  });

  // function to generate a graph data entry:
  const makeDataObject = function (nameData, yData) {
    const newObject = {
      name: nameData,
      y: yData,
    };
    return newObject;
  };


  // start making the Area Pie Chart Here:
  const areaDataObjects = borderingCountriesObjects.map( function (country) {
    return makeDataObject(country.name, country.area);
  });

  let selectedCountryAreaDataObject = [countryObject].map( function (country) {
    return makeDataObject(country.name, country.area);
  });
  selectedCountryAreaDataObject.sliced = true;
  selectedCountryAreaDataObject.selected = true;

  const areaDataArray = areaDataObjects.concat(selectedCountryAreaDataObject);

  // make div for area chart
  const divArea = document.createElement("div");
  divArea.class += "area";
  divDetails.appendChild(divArea);
  // generate the pie chart
  const areaChartData = {
    chart: {
      plotBackgroundColor: null,
      plotBorderWidth: null,
      plotShadow: false,
      type: "pie"
    },
    title: {
      text: "Relative area of bordering countries"
    },
    tooltip: {
      pointFormat: "<b>{point.percentage:.1f}%</b>"
    },
    plotOptions: {
      pie: {
        allowPointSelect: true,
        cursor: "pointer",
        dataLabels: {
          enabled: true,
          format: "<b>{point.name}</b>: {point.percentage:.1f} %",
          style: {
            color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || "black"
          }
        }
      }
    },
    series: [{
      name: "Countries",
      colorByPoint: true,
      data: areaDataArray
    }]
  };

  // actually render the chart
  const areaChart = Highcharts.chart(divArea, areaChartData);






  // start making the Population Pie Chart Here:
  const populationDataObjects = borderingCountriesObjects.map( function (country) {
    return makeDataObject(country.name, country.population);
  });

  let selectedCountryPopulationDataObject = [countryObject].map( function (country) {
    return makeDataObject(country.name, country.population);
  });

  const populationDataArray = populationDataObjects.concat(selectedCountryPopulationDataObject);

  // grab div for population chart
  const divPopulation = document.createElement("div"); divPopulation.class += "population";
  divDetails.appendChild(divPopulation);

  // generate the pie chart
  const populationChartData = {
    chart: {
      plotBackgroundColor: null,
      plotBorderWidth: null,
      plotShadow: false,
      type: "pie"
    },
    title: {
      text: "Relative population of bordering countries"
    },
    tooltip: {
      pointFormat: "<b>{point.percentage:.1f}%</b>"
    },
    plotOptions: {
      pie: {
        allowPointSelect: true,
        cursor: "pointer",
        dataLabels: {
          enabled: true,
          format: "<b>{point.name}</b>: {point.percentage:.1f} %",
          style: {
            color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || "black"
          }
        }
      }
    },
    series: [{
      name: "Countries",
      colorByPoint: true,
      data: populationDataArray
    }]
  };

  // actually render the chart
  const populationChart = Highcharts.chart(divPopulation, populationChartData);


};
