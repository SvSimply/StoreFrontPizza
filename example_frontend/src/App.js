import Header from "./components/Header";
import Menu1 from "./components/MenuPage";
import HomePage from "./components/HomePage";
import MenuPage from "./components/MenuPage";
import Footer from "./components/Footer";
import axios from "axios";
import BackendPage from "./components/BackendPage";
import React, { useState } from "react";

function App() {
  const apiUrl = `https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getorders`;
  const [orders, setOrders] = useState([]);

  function retrieveOrds() {
    axios.get(apiUrl).then(updateOrders);
  }

  function updateOrders(response) {
    setOrders(response.data.menu);
  }

  return (
    <div id="MenuAppDiv">
      <BackendPage ord={orders} retrieveOrders={retrieveOrds} />
    </div>
  );
}

export default App;
