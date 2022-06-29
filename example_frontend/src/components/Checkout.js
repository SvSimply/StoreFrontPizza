import axios from 'axios';
import {useState} from 'react';

const Checkout = (ordersList) => {

    const [name, setName] = useState('');
    const [phone, setPhone] = useState('')

    const nameChange = event => {
        setName(event.target.value);
    }

    const phoneChange = event => {
        setPhone(event.target.value)
    }

    function submit() {
        let ordersIdList = []
        let total = 0

        ordersList.ordersList.map(order => 
            ordersIdList.push(order.itemId)
        )

        ordersList.ordersList.map(order => 
            total = total + order.cost
        )

        var currentdate = new Date(); 
        var datetime = "Last Sync: " + currentdate.getDate() + "/"
            + (currentdate.getMonth()+1)  + "/" 
            + currentdate.getFullYear() + " @ "  
            + currentdate.getHours() + ":"  
            + currentdate.getMinutes() + ":" 
            + currentdate.getSeconds();

        axios.post('https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/createorder/checkout', {
            Name: name,
            Phone: phone,
            MenuItems: ordersIdList,
            orderDate: datetime,
            Total: total
        })
    }

    return (
        <div id='Checkout'>
            <h1>Checkout</h1>
            <div>
                <div>Name:
                    <input
                        type='text'
                        id="name"
                        name='name'
                        onChange={nameChange}
                        value={name}
                    />
                </div>
                <div>Phone#:
                    <input
                        type='text'
                     id="phone"
                        name='phone'
                        onChange={phoneChange}
                        value={phone}
                    />
                </div>
                <button onClick={submit}>Submit</button>
            </div>
        </div>
    )
}

export default Checkout