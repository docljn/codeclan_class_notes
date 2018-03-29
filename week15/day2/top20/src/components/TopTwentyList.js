import React, {Component} from "react";
import TopTwentyEntry from "./TopTwentyEntry";

class TopTwentyList extends Component {
  constructor(props){
    super(props);
  }

  render () {
    const entryListEntries = this.props.entries.map( (entry) => {
      return (
        <TopTwentyEntry
          position={entry.position}
          title={entry.title}
          artist={entry.artist}
          link={entry.link}
          key={entry.id}
        />
      );
    });

    console.log(entryListEntries);

    return(
      <div className="top-twenty-view">
        <h1>UK Top Twenty</h1>
        <ol>
          {entryListEntries}
        </ol>
      </div>
    );
  }
}


export default TopTwentyList;
