import Header from "./components/Header";
import HomePage from "./components/HomePage";
import Footer from "./components/Footer";
import Checkout from "./components/Checkout";
import axios from "axios";
import BackendPage from "./components/BackendPage";
import React, { useState } from "react";

function App() {
  const getApi = `https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getorders`;
  const pizzaAPI = 'https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getmenu/order';
  const putApi = `https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/updateorder`;
  const [orders, setOrders] = useState([]);
  const [pizzaList, setPizzaList] = useState([]);
  const [search, setSearch] = useState("empty");

  const OrderList = []


  //get calls
  function retrieveOrds() {
    axios.get(getApi).then(updateOrders);
  }
  function retrieveAct() {
    axios.get(getApi).then(activeOrders);
  }
  function retrieveSrch() {
    axios.get(getApi).then(updateSearch);
  }

  function retrievePizzas() {
    axios.get(pizzaAPI).then(updatePizzaList)
  }

  //Backend updates
  function updateOrders(response) {
    setOrders(response.data.menu);
  }
  function activeOrders(response) {
    let respArr = response.data.menu;
    let tempArr = [];
    for (let i = 0; i < respArr.length; i++) {
      if (
        response.data.menu[i].status == "READY" ||
        response.data.menu[i].status == "IN_PROCESS"
      ) {
        tempArr.push(response.data.menu[i]);
      }
    }
    setOrders(tempArr);
  }
  function updateSearch(response) {
    setSearch(
      response.data.menu.find((order) => {
        return (
          order.orderId.toLowerCase() ==
          document.getElementById("searchInput")?.value.toLowerCase()
        );
      })
    );
  }

  function setStat() {
    let val = document.querySelector('input[name="set"]:checked').value;
    axios.post(putApi, {
      orderId: document.getElementById("searchInput")?.value.toLowerCase(),
      status: val,
    });
  }

  function updatePizzaList(response) {
    setPizzaList(response.data.menu)
  }


  return (
    <div id="MenuAppDiv">
      <Menu1 pizzas={pizzaList} refresh={retrievePizzas} list={OrderList}/>
      <Checkout ordersList={OrderList}/>
      <BackendPage
        ord={orders}
        srch={search}
        retrieveOrders={retrieveOrds}
        retrieveActive={retrieveAct}
        retrieveSearch={retrieveSrch}
        setStatus={setStat}
      />
    </div>
  );
}

export default App;
