import React from 'react';
import CommentList from '../components/CommentList';

class CommentBox extends React.Component {

  // constructor(props) {
  //   super(props);
  //   // this.state is undefined at this point, and has to be changed, thus state!
  //   // this.state = this.props;
  // }

  render() {
    return <div className="comment-box">
      <h2>Comment List</h2>
      <CommentList data={this.props.data} />
    </div>;
  }
}

export default CommentBox;
