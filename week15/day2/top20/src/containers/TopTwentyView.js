import React, {Component} from "react";
// import MockAPIReturn from "../resources/mockAPI";
import TopTwentyList from "../components/TopTwentyList";

class TopTwentyView extends Component {

  constructor(props){
    super(props);
    this.state = {
      entries: [],
      // entries: MockAPIReturn.feed.entry,
      selectedEntry: null // not currently used
    };
  }

  // NB: always do the api request here:
  componentDidMount(){
    const request = new XMLHttpRequest();
    const url = "https://itunes.apple.com/gb/rss/topsongs/limit=20/json";
    request.open("GET", url);
    request.addEventListener("load", () => {
      if(request.status !== 200) return;
      const jsonString = request.responseText;
      const entries = JSON.parse(jsonString).feed.entry;
      this.setState({entries: entries});
    });
    request.send();
  }



  render () {
    const entrySummaryList = this.state.entries.map( (entry, index) => {
      return {id: entry.id.attributes["im:id"], position: index+1, title: entry["im:name"]["label"] , artist: entry["im:artist"]["label"], link: entry["im:collection"]["link"]["attributes"]["href"]};
    });

    return (
      <div className="top-twenty-view">
        <TopTwentyList entries={entrySummaryList}/>
      </div>
    );
  }
}

export default TopTwentyView;
