import React from 'react'

const HomePage = () => {
  return (
    <div id="container">
        <div id="header"><img class="headerImg" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHDxhPSjsYZ-Qa4BXeBurOENHdEV_WWKGSUSCHoynl_PPL-SF5monbEYdlAhXa0_V88wg&usqp=CAU"/>Jimbo's Pizzeria </div>

        <button  id="button1" class="button">Custom Order</button>
        <img class="icon" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHDxhPSjsYZ-Qa4BXeBurOENHdEV_WWKGSUSCHoynl_PPL-SF5monbEYdlAhXa0_V88wg&usqp=CAU"/>
        <button  id="button2" class="button">Quick Order</button>

        <div class="spHeader">
            <div> Jimbo's Classics</div>
        </div>

        <div class="tagline"> Two-topping carryout anytime, all the time at $8.99!</div>
        <div id="specialsContainer">
          <img class="specials" src="https://images.contentstack.io/v3/assets/bltbb619fd5c667ba2d/blt2094c59e43e6f946/60ce79bbe1b3f7481347ddb0/Pizza.jpg"/>
          <img class="specials"src="https://cdn.discordapp.com/attachments/821095929909870603/986380607166754897/unknown.png"/>
          <img class="specials"src="http://www.angelinaspizza.com/images/DELUXE.GIF"/>
          <img class="specials"src="https://slicelife.imgix.net/14172/photos/original/product-gyro-pizza-3774469.jpeg?auto=compress&auto=format"/>
          <img class="specials"src="https://peacepizza.com.au/images/wood-fired/old-country-dunsborough-pizza.jpg"/>
          <img class="specials"src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPqlqWMXsXPE5XCuPuFyAdNM8m8prCBzUQvWQxvq6EG1sVTEan5bUPbWxOIsD92np5AYs&usqp=CAU"/>
        </div>

        <div class="sidepanel"></div>

        
    </div>
  )
}

export default HomePage
