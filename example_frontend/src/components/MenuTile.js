import React from "react";

const MenuTile = ({NameOfPizza, Cost, Description}) => {
  return (
    <div id='Tile'>
        <div><span id='TileText'>{NameOfPizza}</span></div>
        <div>
            <span id='TileText'>Cost: ${Cost}</span>
        </div>
        <div>
            <span id='TileText'>Size:</span>
            <select>
                <option>Large</option>
                <option>Medium</option>
                <option>Small</option>
            </select>
        </div>
        <div>
            <button>Add To Order</button>
            <input type='number' max='5' id='TileInputField'></input>
        </div>
        <div>
            <span id='TileText'>{Description}</span>
        </div>
    </div>
  )
}

export default MenuTile
