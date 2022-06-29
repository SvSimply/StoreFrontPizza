import MenuTile from "./MenuTile";
import Tagline from "./Tagline";
import Header from "./Header";
import Search from "./Search";

import Order from "./Order";

const BackendPage = ({
  ord,
  srch,
  retrieveOrders,
  retrieveActive,
  retrieveSearch,
  setStatus,
}) => {
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
        className="button"
        onClick={() => retrieveOrders()}
      >
        Get all orders
      </button>
      <button
        id="activeRefresh"
        className="button"
        onClick={() => retrieveActive()}
      >
        Get active orders
      </button>
      <div className="formTile">
        {" "}
        <h2 className="formTitle"> Search for an Order</h2>
        <input
          onSubmit={() => {
            retrieveSearch();
          }}
          placeholder="Order Number"
          type="text"
          className="formInput"
          id="searchInput"
        />
        <input
          className="formSubmit"
          type="button"
          value="Search for Order"
          onClick={() => retrieveSearch()}
        />
        <div id="srchComp">
          <Search className="orders" ord={srch} />
        </div>
        <div className="radioOne">
          <input type="radio" id="rdyRadio" name="set" value="READY" />
          <label for="rdyButton">Ready</label>
        </div>
        <div className="radioTwo">
          <label for="rdyButton">In process</label>
          <input
            type="radio"
            id="inProcessRadio"
            name="set"
            value="IN_PROCESS"
          />
        </div>
        <div className="buttonGrid">
          <button id="setButton" className="button" onClick={() => setStatus()}>
            Set status
          </button>
        </div>
      </div>

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
