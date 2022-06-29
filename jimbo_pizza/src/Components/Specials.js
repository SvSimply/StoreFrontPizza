const Specials = ({ typing }) => {
  const onClick = () => {
    console.log("click!");
  };

  switch (typing) {
    case "pepperoni":
      return (
        <header>
          <img
            onClick={onClick}
            className="specials"
            src="https://images.contentstack.io/v3/assets/bltbb619fd5c667ba2d/blt2094c59e43e6f946/60ce79bbe1b3f7481347ddb0/Pizza.jpg"
          />
        </header>
      );
    case "doge":
      return (
        <header>
          <img
            onClick={onClick}
            className="specials"
            src="https://cdn.discordapp.com/attachments/821095929909870603/986380607166754897/unknown.png"
          />
        </header>
      );
    case "deluxe":
      return (
        <header>
          <img
            onClick={onClick}
            className="specials"
            src="http://www.angelinaspizza.com/images/DELUXE.GIF"
          />
        </header>
      );
    case "duns":
      return (
        <header>
          <img
            onClick={onClick}
            className="specials"
            src="https://peacepizza.com.au/images/wood-fired/old-country-dunsborough-pizza.jpg"
          />
        </header>
      );

    case "ace":
      return (
        <header>
          <img
            onClick={onClick}
            className="specials"
            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPqlqWMXsXPE5XCuPuFyAdNM8m8prCBzUQvWQxvq6EG1sVTEan5bUPbWxOIsD92np5AYs&usqp=CAU"
          />
        </header>
      );

    case "dos":
      return (
        <header>
          <img
            onClick={onClick}
            className="specials"
            src="https://slicelife.imgix.net/14172/photos/original/product-gyro-pizza-3774469.jpeg?auto=compress&auto=format"
          />
        </header>
      );
  }
};

export default Specials;
