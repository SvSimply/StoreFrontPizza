import MenuTile from "./MenuTile"

const Menu = ({pizzas, refresh, list}) => {

  window.onload = refresh

  return (
    <div id='MenuPageDiv'>
        <h1>Our Menu</h1>
        <div id='MenuTileGrid'> 

          {pizzas.map(pizzas => <MenuTile 
            Pizza={pizzas}
            orderList={list}
          />)}

        </div>
    </div>
  )
}

export default Menu
