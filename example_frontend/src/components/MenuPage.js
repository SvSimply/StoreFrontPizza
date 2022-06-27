import MenuTile from "./MenuTile"
import axios from "axios"
import { Component } from "react";

class Menu extends Component {

  state = {
    pizzas: []
  }

  constructor() {
    super();
    axios.get('https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getmenu/order').then(res => {
      this.setState({ pizzas: res.data.menu})
    })
  }

  render() {
    return (
      <div id='MenuPageDiv'>
          <h1>Our Menu</h1>
          <div id='MenuTileGrid'> 

            {this.state.pizzas.map(pizzas => <MenuTile 
              NameOfPizza={pizzas.name} 
              Cost={pizzas.cost} 
              Description={pizzas.description} 
              ItemId={pizzas.itemId}
            />)}

          </div>
      </div>
    )
  }
}

export default Menu;