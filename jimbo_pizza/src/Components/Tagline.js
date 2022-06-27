import React from "react";

const Tagline = () => {
  let line = "";
  let num = Math.floor(Math.random() * 3) + 1;
  switch (num) {
    case 1:
      line = "Two-topping carryout anytime, all the time at $8.99!";
      break;
    case 2:
      line = "We're open seven days a week!";
      break;
    case 3:
      line = "Want to make your own custom pizza? Click custom order below!";
      break;
  }

  return <div>{line}</div>;
};

export default Tagline;
