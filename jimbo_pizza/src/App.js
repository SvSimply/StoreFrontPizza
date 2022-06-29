THIS IS MY APP JS

import React from "react";
import logo from "./logo.svg";
import "./App.css";
import Specials from "./Components/Specials";
import Tagline from "./Components/Tagline";
<head></head>;
class App extends React.Component {
  render() {
    return (
      <div className="App">
        <div id="container">
          <div id="header">
            <img
              className="headerImg"
              src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHDxhPSjsYZ-Qa4BXeBurOENHdEV_WWKGSUSCHoynl_PPL-SF5monbEYdlAhXa0_V88wg&usqp=CAU"
            />
            Jimbo's Pizzeria{" "}
          </div>

          <button id="button1" className="button">
            Custom Order
          </button>
          <img
            class="icon"
            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHDxhPSjsYZ-Qa4BXeBurOENHdEV_WWKGSUSCHoynl_PPL-SF5monbEYdlAhXa0_V88wg&usqp=CAU"
          />
          <button id="button2" className="button">
            Quick Order
          </button>

          <div className="spHeader">
            <div> Jimbo's Classics</div>
          </div>
          <div className="tagline">
            <Tagline />
          </div>
          <div id="specialsContainer">
            <Specials typing="pepperoni" />
            <Specials typing="doge" />
            <Specials typing="deluxe" />
            <Specials typing="duns" />
            <Specials typing="ace" />
            <Specials typing="dos" />
          </div>
          <div className="sidepanel"></div>

          <div id="affiliate">Are you a Jimbo affiliate? Log in here!</div>
        </div>
      </div>
    );
  }
}

export default App;
