import MenuTile from "./MenuTile"

const Menu = () => {
  return (
    <div id='MenuPageDiv'>
        <h1>Our Menu</h1>
        <div id='MenuTileGrid'> 
            <MenuTile NameOfPizza={'Pepperoni'} />
            <MenuTile NameOfPizza={'Sausage'} />
            <MenuTile NameOfPizza={'Cheese'} />
            <MenuTile NameOfPizza={'Supreme'} />
            <MenuTile NameOfPizza={"Meat Lover's"} />
            <MenuTile NameOfPizza={'Canadian Bacon'} />
            <MenuTile NameOfPizza={'Hawaiian'} />
        </div>
    </div>
  )
}

export default Menu;