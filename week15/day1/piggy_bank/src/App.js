import React, { Component } from 'react';
import PiggyBank from './PiggyBank';
import './App.css';

class App extends Component {
  render() {
    return (
      <main>
        <PiggyBank owner="Lorna" title="Hog Bank" depositAmount={10}/>
      </main>
    );
  }
}

export default App;

// you can only have one render() method per component

// Add an owner property to the piggy bank.
// Add a 'withdraw' button which decreases the total.
// Add a depositAmount property - pass in a value which depositing or withdrawing will change the total by.
