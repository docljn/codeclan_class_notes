import React from "react";
import CountrySelect from "../components/CountrySelect";
import CountryDetail from "../components/CountryDetail";

class CountryContainer extends React.Component {

  constructor(props){
    super(props);
    this.state = {
      countries: [],
      selectedCountryIndex: null
    };
    this.handleCountrySelected = this.handleCountrySelected.bind(this);
  }



  componentDidMount(){
    const request = new XMLHttpRequest();
    const url = "https://restcountries.eu/rest/v2/all";
    request.open("GET", url);
    request.addEventListener("load", () => {
      if (request.status !== 200) return;
      const jsonString = request.responseText;
      const countriesObjects = JSON.parse(jsonString);
      this.setState({countries: countriesObjects});
    });
    request.send();
  }

  handleCountrySelected(index){
    this.setState({selectedCountryIndex: index});
  }

  render(){
    const countryNames = this.state.countries.map(country => country.name);

    const selectedCountry = this.state.countries[this.state.selectedCountryIndex];

    return (
      <div>
        <h2>Country Container</h2>
        <CountrySelect countryNames={countryNames} onCountrySelected={this.handleCountrySelected} />
        <CountryDetail country={selectedCountry} />
      </div>
    );
  }
}

export default CountryContainer;
