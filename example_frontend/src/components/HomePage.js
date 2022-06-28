import React from "react";

import Specials from "./Specials";
import Tagline from "./Tagline";
import Header from "./Header";

const HomePage = () => {
  return (
    <div id="container">
      <div id="header">
        <Header />
      </div>
      <button id="button1" class="button">
        Custom Order
      </button>
      <img class="icon" src="https://i.ibb.co/5GK4F2h/pizza-Logo.png" />
      <button id="button2" class="button">
        Quick Order
      </button>
      <div class="spHeader">
        <div> Jimbo's Classics</div>
      </div>
      <div class="tagline">
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
      <div class="sidepanel"></div>
    </div>
  );
};
export default HomePage;
