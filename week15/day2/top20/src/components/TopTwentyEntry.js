import React, {Component} from "react";

const TopTwentyEntry = (props) => {
  console.log(props.link);
  if (!props.title) return null;
  return (
    <li className="entry">
      <a href={props.link} target="_blank">
        <h3 className="entryTitle">
          { props.title }
        </h3>
      </a>
      <p>
        - { props.artist }
      </p>
    </li>
  );
};

export default TopTwentyEntry;
