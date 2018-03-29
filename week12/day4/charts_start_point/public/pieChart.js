const PieChart = function () {
  const container = document.querySelector("#pie-chart");

  const chart = new Highcharts.Chart({
    chart: {
      type: "pie",
      renderTo: container
    },
    title: {
      text: "Pokemon Types I've caught"
    },
    series: [
      {
        name: "PokemonTypes",
        data: [
          {
            name: "Fire",
            y: 74,
            color: "#ffac33"
          },
          {
            name: "Water",
            y: 25,
            color: "#73b7ff",
            sliced: true
          },
          {
            name: "Grass",
            y: 1,
            color: "#00ba2f"
          },
          {
            name: "Rock",
            y: 15,
            color: "#111111"
          }
        ]
      }
    ]
  });


};
