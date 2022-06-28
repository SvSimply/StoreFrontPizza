import axios from "axios"
import { Component } from "react";
import CheckoutTile from "./CheckoutTile";

class Checkout extends Component {

    render() {
        return (
            <div id='Checkout'>
                <h1>Checkout</h1>
                <div>
                    <CheckoutTile Count='Count' Pizza='Pizza' Total='Total'/>
                    <CheckoutTile Count='1' Pizza='Pepperoni' Total='$9.50'/>
                    <CheckoutTile Count='3' Pizza='Pepperoni' Total='$6.50'/>
                    <CheckoutTile Count='1' Pizza='Pepperoni' Total='$9.50'/>
                    <CheckoutTile Count='2' Pizza='Pepperoni' Total='$7.50'/>
                    <CheckoutTile Count='7' Pizza='' Total='$53.50'/>
                </div>
            </div>
        )
    }

}

export default Checkout