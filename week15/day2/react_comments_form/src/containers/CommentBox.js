import React from "react";
import CommentList from "../components/CommentList.js";
import CommentForm from "../components/CommentForm.js";

class CommentBox extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      data: [{id: 1, author: "Beth", text: "I love hats!"},{id: 2, author: "Seth", text: "I love bats!"},{id: 3, author: "Geth", text: "I love gnats!"}]
    };

    this.handleCommentSubmit = this.handleCommentSubmit.bind(this);
  }

  handleCommentSubmit(comment){
    comment.id = Date.now();
    const newCommentsArray = this.state.data.concat(comment);
    // can't use .push() because that would modify the existing state, rather than returning a new array.  We DON'T want to change state ourselves.
    this.setState({data: newCommentsArray});
  }

  // react requires that anything in an array which is used by react has a unique key: simple solution is to give it the same as the array item"s index
  // if you use an actually unique id, react can optimise things better

  render() {
    return (
      <div className="comment-box">
        <h2>Add a Comment</h2>
        <CommentForm onCommentSubmit={this.handleCommentSubmit}/>
        <CommentList data={this.state.data} />
      </div>
    );
  }

}

export default CommentBox;
