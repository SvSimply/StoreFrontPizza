import React from "react";

const MenuTile = ({NameOfPizza}) => {
  return (
    <div id='Tile'>
        <div>{NameOfPizza}</div>
        <div>
            <text>Size:</text>
            <select>
                <option>Large</option>
                <option>Medium</option>
                <option>Small</option>
            </select>
        </div>
        <div>
            <text>Crust:</text>
            <select>
                <option>Normal</option>
                <option>Flat</option>
                <option>Stuffed</option>
            </select>
        </div>
        <div>
            <button>Add To Order</button>
            <input type='number' max='5' id='TileInputField'></input>
        </div>
    </div>
  )
}

export default MenuTile
