import React from "react";
import Comment from "./Comment.js";

// We don"t need state, so set it up as a stateless, functional component

const CommentList = (props) => {
  var commentNodes = props.data.map((comment) => {
    return (
      <Comment author={comment.author} key={comment.id}>
        {comment.text}
      </Comment>
    );
  });

  return (
    <div className="commentList">
      {commentNodes}
    </div>
  );
};


// class CommentList extends React.Component {
//   render() {
//     var commentNodes = this.props.data.map(function(comment) {
//       return (
//         <Comment author={comment.author} key={comment.id}>
//           {comment.text}
//         </Comment>
//       );
//     });
//
//     return (
//       <div className="commentList">
//         {commentNodes}
//       </div>
//     )
//   }
// }

export default CommentList;
