import MenuTile from "./MenuTile";
import Tagline from "./Tagline";
import Header from "./Header";

import Order from "./Order";

const BackendPage = ({ ord, retrieveOrders }) => {
  return (
    <div className="backendContainer">
      <div id="header">
        <Header msg="Jimbo's orders" />
      </div>
      <div className="tagline">
        <Tagline />
      </div>
      <button
        id="backendRefresh"
        class="button"
        onClick={() => retrieveOrders()}
      >
        Refresh Orders
      </button>
      <form className="formTile">
        {" "}
        <h2 className="formTitle"> Search for an Order</h2>
        <input
          placeholder="Order Number"
          type="text"
          className="formInput"
        ></input>
        <input
          className="formSubmit"
          type="submit"
          value="Search for Order"
        ></input>
      </form>
      <div className="orders">
        <div id="orderTile">
          {ord.map((orders) => (
            <Order className="orders" ord={orders} />
          ))}
        </div>
      </div>
    </div>
  );
};

export default BackendPage;
