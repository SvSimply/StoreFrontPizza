import React from "react";

const MenuTile = ({Pizza, orderList}) => {

  function addToOrder() {
    orderList.push(Pizza)
    console.log(Pizza)
    console.log(orderList)
    window.location.reload(false)
  }

  return (
    <div id='Tile'>
        <div><span id='TileText'>{Pizza.name}</span></div>
        <div>
            <span id='TileText'>Cost: ${Pizza.cost}</span>
        </div>
        <div>
            <button onClick={addToOrder}>Add To Order</button>
        </div>
        <div>
            <span id='TileText'>{Pizza.description}</span>
        </div>
    </div>
  )
}

export default MenuTile