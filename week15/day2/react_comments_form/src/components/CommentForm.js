import React, {Component} from "react";

class CommentForm extends Component {

  // we need state, so we need a constructor
  constructor(props){
    super(props);
    this.state = {
      author: "",
      text: ""
    };

    this.handleAuthorChange = this.handleAuthorChange.bind(this);
    this.handleTextChange = this.handleTextChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);

  }

  // NB: If you want to type in the textbox, you have to update the state, which will then reflect on the screen
  // you need an eventListener
  // setState makes the change AND triggers a re-render

  handleAuthorChange(event){
    this.setState({author: event.target.value});
  }

  handleTextChange(event){
    this.setState({text: event.target.value});
  }

  handleSubmit(event){
    event.preventDefault();
    const author = this.state.author.trim();
    // .trim() removes whitespace at beginning and end
    const text = this.state.text.trim();
    // error handling:
    if(!text || !author) return;
    // we passed the function handleSubmit in props, which requires an object as argument.... The function will then be invoked where it was declared: in the commentBox
    this.props.onCommentSubmit({author: author, text: text});
    // clear the input and re-render the page
    this.setState({author: "", text: ""});

  }

  render(){
    return(
      <form className="comment-form" onSubmit={this.handleSubmit}>
        <input
          type="text"
          placeholder="Your name"
          value={this.state.author}
          onChange={this.handleAuthorChange}
        />
        <input
          type="text"
          placeholder="Say something"
          value={this.state.text}
          onChange={this.handleTextChange}
        />
        <input type="submit" value="Post Comment" />
      </form>
    );
  }
}

export default CommentForm;
