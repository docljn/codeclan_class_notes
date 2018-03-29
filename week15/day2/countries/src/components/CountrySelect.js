import React, { Component } from "react";

class CountrySelect extends Component {

  constructor(props){
    super(props);
    // we thought we would need state so that we know which option has been selected, but that is now in the next level up....
    // however, we do need to find a way to select nothing at the start....
    // this.state = {
    //   selected: null
    // };
    this.handleChange = this.handleChange.bind(this);
  }

  handleChange(event){
    this.props.onCountrySelected(event.target.value);
    this.setState({selected: event.target.value});
    console.log(event.target.value);
  }

  render() {
    const optionsHTML = this.props.countryNames.map((countryName, index) => {
      return <option key={index} value={index}>{countryName}</option>;
    });

    return (
      <select id="country-select" onChange={this.handleChange} >
        <option disabled >Choose a country...</option>
        {optionsHTML}
      </select>
    );
  }

}

export default CountrySelect;
