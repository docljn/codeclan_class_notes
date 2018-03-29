import React, { Component } from "react";
import TopTwentyView from "./containers/TopTwentyView";
import "./App.css";

class App extends Component {
  render() {
    return (
      <main className="App">
        <TopTwentyView />
      </main>
    );
  }
}

export default App;
