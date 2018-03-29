import React from 'react'

// If using a stateless component (much lighter weight) aka a functional component:
// You don't need render as the entire function *is* the render

// jsx is NOT javascript: webpack and babel do the conversion, so you need React in scope for this to work

// an anonymous function which is saved into a variable

// we no longer have a constructor, as this isn't a class, so we can't call this.props.whatever

// remember that props is whatever you pass in when you create the component

const Comment = (props) => {
  return (
    <div className="comment">
      <h4 className="commentAuthor">
        { props.author }
      </h4>
      { props.children }
    </div>
  );
};

// If using a class, with full state etc:

// class Comment extends React.Component {
//
//   render() {
//     return (
//       <div className="comment">
//         <h4 className="commentAuthor">
//           { this.props.author }
//         </h4>
//         { this.props.children }
//       </div>
//     )
//   }
// }

export default Comment;

// children references any information in between the <element>children_here</element> tags
