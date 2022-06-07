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

*Describe broadly how you are proposing to solve for the requirements you
described in Section 2.*

*This may include class diagram(s) showing what components you are planning to
build.*

*You should argue why this architecture (organization of components) is
reasonable. That is, why it represents a good data flow and a good separation of
concerns. Where applicable, argue why this architecture satisfies the stated
requirements.*

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

*Define the DynamoDB tables you will need for the data your service will use. It
may be helpful to first think of what objects your service will need, then
translate that to a table structure, like with the *`Playlist` POJO* versus the
`playlists` table in the Unit 3 project.*

# 8. Pages

*Include mock-ups of the web pages you expect to build. These can be as
sophisticated as mockups/wireframes using drawing software, or as simple as
hand-drawn pictures that represent the key customer-facing components of the
pages. It should be clear what the interactions will be on the page, especially
where customers enter and submit data. You may want to accompany the mockups
with some description of behaviors of the page (e.g. “When customer submits the
submit-dog-photo button, the customer is sent to the doggie detail page”)*
