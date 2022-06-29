import React from "react";

const Tagline = () => {
  let line = "";
  let num = Math.floor(Math.random() * 4) + 1;
  switch (num) {
    case 1:
      line = "Two-topping carryout anytime, all the time at $8.99!";
      break;
    case 2:
      line = "We're open seven days a week!";
      break;
    case 3:
      line = "Jimbo's pepperoni classic is positively good";
      break;
    case 4:
      line = "Now serving all hungry customers!";
      break;
  }

  return <div>{line}</div>;
};

export default Tagline;
