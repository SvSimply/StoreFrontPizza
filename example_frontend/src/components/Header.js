const Header = ({ msg }) => {
  return (
    <header>
      <img
        class="headerImg"
        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHDxhPSjsYZ-Qa4BXeBurOENHdEV_WWKGSUSCHoynl_PPL-SF5monbEYdlAhXa0_V88wg&usqp=CAU"
      />
      {msg}{" "}
    </header>
  );
};

Header.defaultProps = {
  msg: "Jimbo's Pizzeria",
};

export default Header;
