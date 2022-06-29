import MenuTile from "./MenuTile";
import Tagline from "./Tagline";
import Header from "./Header";
import axios from "axios";
import { useState } from "react";
const api = axios.create({
  baseURL: "https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test",
});

const Search = ({ ord }) => {
  if (ord === "empty") {
    return <div>Search for an order to populate this field.</div>;
  }
  if (!ord) {
    return <div>Query didn't return any results.</div>;
  }
  const searchItems = ord.menuItems.map((itemList) => <p>{itemList}</p>);

  return (
    <div className="orderTile">
      <h4 className="orderId">Order Id</h4>
      <p className="orderId">{ord.orderId}</p>
      <div className="custName">
        <h4>Customer Name</h4>
        <p>{ord.customerName}</p>
      </div>
      <div className="phone">
        <h4>Customer Phone#</h4>
        <p>{ord.customerPhone}</p>
      </div>
      <div className="ordDate">
        <h4>Order Date</h4>
        <p>{ord.orderDate}</p>
      </div>
      <div className="item">
        <div className="itemTitle">
          <h4>Item list</h4>
        </div>
        <div className="itemName">
          <p>{searchItems}</p>
        </div>
      </div>
      <div className="status">
        <h4>Status</h4>
        <p>{ord.status}</p>
      </div>
      <div className="update">
        <h4>Update Date</h4>
        <p>{ord.updateDate}</p>
      </div>
      <div className="price">
        <h4>Total Price</h4>
        <p>{ord.total}</p>
      </div>
    </div>
  );
};
export default Search;
