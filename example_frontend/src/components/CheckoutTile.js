import React from 'react'

const CheckoutTile = ({Count, Pizza, Total}) => {
  return (
    <div id='CheckoutTile'>
        <span id='Count'>{Count}</span>
        <span id='Pizza'>{Pizza}</span>
        <span id='Total'>{Total}</span>
    </div>
  )
}

export default CheckoutTile
