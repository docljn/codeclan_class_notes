import React, { Component } from 'react';
import CommentBox from './containers/CommentBox';

class App extends Component {
  render() {
    return (
      <CommentBox data={[{id: 1, author: 'Beth', text: 'I love hats!'},{id: 2, author: 'Seth', text: 'I love bats!'},{id: 3, author: 'Geth', text: 'I love gnats!'}]
      }/>
    );
  }
}

export default App;

// data is the props of CommentBox
