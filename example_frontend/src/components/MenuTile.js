import React from "react";

const MenuTile = ({NameOfPizza, Cost, Description, ItemId}) => {
  return (
    <div id='Tile'>
        <div><span id='TileText'>{NameOfPizza}</span></div>
        <div>
            <span id='TileText'>Cost: ${Cost}</span>
        </div>
        <div>
            <button onClick={console.log(ItemId)}>Add To Order</button>
        </div>
        <div>
            <span id='TileText'>{Description}</span>
        </div>
    </div>
  )
}

export default MenuTile