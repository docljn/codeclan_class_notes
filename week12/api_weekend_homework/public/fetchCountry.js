const fetchCountry = function (jsonStringOfCountryDetails) {
  const countryObject = JSON.parse(jsonStringOfCountryDetails);

  // check that result isn't null somehow?

  const twoLetterName = countryObject.results[0].address_components[0].short_name;

  // retrieve info from local storage: - BUT I've used 3-letter-name when storing!!!
  const storedCountryString = localStorage.getItem(twoLetterName);

  const storedCountryObject = JSON.parse(storedCountryString);

  generateHtml(storedCountryObject);


};
