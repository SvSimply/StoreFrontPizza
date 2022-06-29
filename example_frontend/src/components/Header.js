const Header = ({ msg }) => {
  return (
    <header>
      <img class="headerImg" src="https://i.ibb.co/5GK4F2h/pizza-Logo.png" />
      {msg}{" "}
    </header>
  );
};

Header.defaultProps = {
  msg: "Jimbo's Pizzeria",
};

export default Header;
