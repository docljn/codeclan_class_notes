import React from 'react';

class PiggyBank extends React.Component {

  constructor(props) {
    // I want access to the props from the extended Component so I need to pass in props and call super:  PROPS ARE IMMUTABLE...
    // get the props
    // set the state
    super(props);
    this.state = {
      total: 0
    };

    this.deposit = this.deposit.bind(this);
    this.reset = this.reset.bind(this);
    this.withdraw = this.withdraw.bind(this);
    // without this line, the deposit() method does not know the correct context
    // by binding this here, the context stays PiggyBank
  }

  deposit(){
    // I don't want to have to call render each time I make a deposit
    // instead, use a built-in method "setState(updater-function)" which triggers render().
    this.setState(prevState => {
      // prevState gives the most recent state despite any asynchronous calls
      // return a new object containing the change you wish to make using prevState to reference the original value
      return {total: prevState.total + this.props.depositAmount};
    });
  }

  withdraw(){
    this.setState(prevState => {
      return {total: prevState.total - 1};
    });
  }

  reset(){
    this.setState({total: 0});
  }

  render(){
    return (
      <div className="bank-box">
        <p>{this.props.owner + "'s " + this.props.title}</p>
        <p>I contain £{this.state.total}</p>
        <button onClick={this.deposit} onDoubleClick={this.reset}>Add</button>
        <button onClick={this.withdraw}>Withdraw</button>
      </div>
    );
  }
}

export default PiggyBank;

// You don't have to declare that PiggyBank has a title anywhere before setting it and accessing it
