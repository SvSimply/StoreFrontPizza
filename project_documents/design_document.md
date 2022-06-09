# Store Front Design Document





## Store Front Design

## 1. Problem Statement

Our team is creating the online presence of Jimbo's Pizzeria, a local restaurant.
With the increased popularity of ordering food via the app, the restaurant has decided to create its own online storefront.
This design document describes the online services available to the customer.
The service is designed to receive a food order from the customer, return an order confirmation, allow special requests to be added to the order, and provide the order's status to the customer.



## 2. Top Questions to Resolve in Review

How to get order status to the customer?

How to get the front and back end to communicate with each other?

How many database tables are needed?

Update menu functionality?


## 3. Use Cases

u1: I as a customer am hungry and would like to order food online.

u2: I as a customer want to view the status of my order.

u3: I as a customer would like to view previous orders.

u4: I as a customer would like to update my order.


## 4. Project Scope

4a Minimum:

    Place default orders.
    Menu.
    List of active orders.
    Take in customer information.
    Calculate price.



4b In Scope:

    Custom pizza from ingredients list.
    Customer facing front end.
    Business facing back end.
    Random pizza.
    User Log in.
    Orders will have an updatable status.


4c Out of Scope:

        Communicate with customers through phone numbers.
        Credit card functionality.
        Delivery.


# 5. Proposed Architecture Overview

**Webpages with all features:**

**Start page** 

* with buttons “make an order”, “check order’s status”, and “for business use”.
* check the order’s status input field on the start page instead of a separate page.

**Client front-end part:**

* Menu list with the ability to select items and enter counts. Button “Next”.
* A custom pizza page with ingredients to choose from.
* A checkout page with places to enter customer data and the button “Order”.
* Shows the total sum.
* Additional feature: show selected items.
* Additional feature: change order.
* Order succeeded page with a happy phrase, a new order id, total, and a list of ordered items (?).
* Use the Order status result page to show status immediately after the order is placed.
* If an error occurs then an unhappy phrase.
* Check the order’s status page with two input fields (order id or phone number).
* Order status result page with the order’s status with update time.

**Business facing front-end:**

* List of active orders page with a button to mark order done.
* Additional feature: show all orders sorted by status.
* Restaurant stock page with information from the database.
* Additional feature: change the remaining count of ingredients in stock.

**Features mentioned above:**

* Display menu items on the website from the database (not a hardcode).
* Make and save orders to the database.
* Business facing front end.
* Retrieve the order’s status with update time by order Id or customer’s phone number (the last order with this customer’s phone number).
* Maybe split into two parts: first retrieve status by order id, second alternative way using customer’s phone number.
* Ingredient multiplayer for each ingredient to convert amounts from per pizza to common units.
* Create a custom pizza.
* Restaurant stock tracking. Can be part of Business facing front end.
* Mark the item as unavailable on the website because of the lack of ingredients.
* Show selected items and total before confirming an order.
* Change the remaining count of ingredients in stock from the Business facing front-end (not manually in the database).
* Change order during checkout.
* On business front-end page show all orders from the database sorted by status. Maybe add filters.
* Ingredient multiplayer for each ingredient to convert amounts from per pizza to common units.
* Add different sizes of pizza.


# 6. API

## 6.1. Public Models

*Define the data models your service will expose in its responses via your
*`-Model`* package. These will be equivalent to the *`PlaylistModel`* and
*`SongModel`* from the Unit 3 project.*

## 6.2. *First Endpoint*

*Describe the behavior of the first endpoint you will build into your service
API. This should include what data it requires, what data it returns, and how it
will handle any known failure cases. You should also include a sequence diagram
showing how a user interaction goes from user to website to service to database,
and back. This first endpoint can serve as a template for subsequent endpoints.
(If there is a significant difference on a subsequent endpoint, review that with
your team before building it!)*

*(You should have a separate section for each of the endpoints you are expecting
to build...)*

## 6.3 *Second Endpoint*

*(repeat, but you can use shorthand here, indicating what is different, likely
primarily the data in/out and error conditions. If the sequence diagram is
nearly identical, you can say in a few words how it is the same/different from
the first endpoint)*

# 7. Tables


**Tables and POJO classes:**

* Table with Ingredients and remaining count.
* For the MVP part can be an enum class.
* 1 means the need for 1 pizza.
* Note: remaining count needed for additional restaurant stock tracking feature.
* One more additional feature: mark the item as unavailable on the website because of the lack of ingredients.
* Amount of each ingredient for one pizza.
* Table with Menu items, descriptions, and prices for website display.
* Additionally, an ingredient list with amounts needed to prepare items (Note: for additional restaurant stock tracking feature).
* How to store ingredients and amount pairs? - store the list of ingredients in the Menu table and store amounts separately in the Ingredients table.
* Table with Orders information: customer info, list of items, date of order, total sum, the status of an order, update DateTime.
* Orders are saved in this table.
* The table is used to show the orders list for the Business facing front end.
* Table with Customer for login.
* Don’t need for MVP.

# 8. Pages

*Include mock-ups of the web pages you expect to build. These can be as
sophisticated as mockups/wireframes using drawing software, or as simple as
hand-drawn pictures that represent the key customer-facing components of the
pages. It should be clear what the interactions will be on the page, especially
where customers enter and submit data. You may want to accompany the mockups
with some description of behaviors of the page (e.g. “When customer submits the
submit-dog-photo button, the customer is sent to the doggie detail page”)*
