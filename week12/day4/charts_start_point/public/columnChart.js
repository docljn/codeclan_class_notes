const ColumnChart = function(titleText, seriesName, seriesArray, xAxisCategoriesArray){
  const container = document.querySelector("#column-chart");
  const chart = new Highcharts.Chart({
    chart: {
      type: "column",
      renderTo: container
    },
    title: {text: titleText},
    series: [{name: seriesName, data:seriesArray}],
    xAxis: {categories: xAxisCategoriesArray}
  });
};
