import Header from "./components/Header";
import Menu1 from "./components/MenuPage";
import HomePage from "./components/HomePage";
import MenuPage from "./components/MenuPage";
import Footer from "./components/Footer";
import Checkout from "./components/Checkout";
import axios from "axios";
import BackendPage from "./components/BackendPage";
import React, { useState } from "react";

function App() {
  const apiUrl = `https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getorders`;
  const pizzaAPI = 'https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getmenu/order';
  const [orders, setOrders] = useState([]);
  const [pizzaList, setPizzaList] = useState([]);

  const OrderList = []

  function retrieveOrds() {
    axios.get(apiUrl).then(updateOrders);
  }

  function retrievePizzas() {
    axios.get(pizzaAPI).then(updatePizzaList)
  }

  function updateOrders(response) {
    setOrders(response.data.menu);
  }

  function updatePizzaList(response) {
    setPizzaList(response.data.menu)
  }


  return (
    <div id="MenuAppDiv">
      <Menu1 pizzas={pizzaList} refresh={retrievePizzas} list={OrderList}/>
      <Checkout ordersList={OrderList}/>
      <BackendPage ord={orders} retrieveOrders={retrieveOrds} />
    </div>
  );
}

export default App;
