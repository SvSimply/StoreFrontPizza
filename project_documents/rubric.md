# Store Front Project Rubric

## Background

*This captures the expectations that we have for your team during the unit.
This is how we will evaluate whether you have demonstrated these expectations.*

## Instructions

*As a team, complete this rubric (everything except for the Appendix) by
answering the questions below. Each question should usually only require one or
two sentences, so please be brief. The remainder of expectations will be
evaluated by instructors, so you don’t need to write anything in the Appendix.
We want you to see the full set of expectations for transparency’s sake.*

## Deliverables

*Provide links to the following project deliverables:*

|Deliverable                                                      |Due Date                  | Date Completed | URL                                                    |
|---                                                              |---                       |----------------|--------------------------------------------------------|
|Team name                                                        |Sprint 1 Module 1         | 6/6/2022       | name: Store Front                                      |
|[Design Document - problem statement](design_document.md)        |Sprint 1 Module 2         |      6/7/2022          |       project_documents/design_document.md                                                 |
|[Team Charter](team_charter.md)                                  |Sprint 1 Modeul 3         |  6/9/2022             |                   project_documents/team_charter.md                                     |
|[Design Document](design_document.md)                            |Sprint 1 Friday by 5pm    |   6/10/2022             |        project_documents/design_document.md                                                |
|Project Completion (Feature Complete)                            |Sprint 3 Friday by 5pm    |      6/24/2022          |         https://github.com/BloomTechBackend/bd-team-project-store-front-bd5                                               |
|[Team Reflection](reflection_template.md)                                 |Sprint 4 Wednesday by 5PM |     6/28/2022           |    project_documents/store_front/reflection.md                                                    |
|[Accomplishment Tracking (person 1)](accomplishment_tracking.md) |Sprint 4 Wednesday by 5PM |      6/28/2022           |            project_documents/store_front/accomplishment_tracking_jeremy.md                                            |
|[Accomplishment Tracking (person 2)](accomplishment_tracking.md) |Sprint 4 Wednesday by 5PM |      6/28/2022           |             project_documents/store_front/accomplishment_tracking_jonathan.md                                           |
|[Accomplishment Tracking (person 3)](accomplishment_tracking.md) |Sprint 4 Wednesday by 5PM |       6/28/2022          |                                         project_documents/store_front/accomplishment_tracking_raymond.md               |
|[Accomplishment Tracking (person 4)](accomplishment_tracking.md) |Sprint 4 Wednesday by 5PM |       6/28/2022          |                                                     project_documents/store_front/accomplishment_tracking_svetlana.md   |
[Accomplishment Tracking (person 5)](accomplishment_tracking.md) |Sprint 4 Wednesday by 5PM |       6/28/2022          |                                                        project_documents/store_front/accomplishment_tracking_violet.md|
|Self Reflection (person 1)                        |Sprint 4 Wednesday by 5PM |                | n/a (will be submitted via Canvas - "Wrap-up" section) |
|Self Reflection (person 2)                        |Sprint 4 Wednesday by 5PM |                | n/a (will be submitted via Canvas - "Wrap-up" section) |
|Self Reflection (person 3)                        |Sprint 4 Wednesday by 5PM |                | n/a (will be submitted via Canvas - "Wrap-up" section) |
|Self Reflection (person 4)                        |Sprint 4 Wednesday by 5PM |                | n/a (will be submitted via Canvas - "Wrap-up" section) |

## Technical Learning Objectives

### API Design

**Design an API to meet the needs of your application.** Provide a link to the
definition for your endpoints (can be code/configuration, or can be
documentation). List one thing that your team learned about designing a good
API.

*Endpoint definition location:*     https://7fy93af9yj.execute-api.us-west-2.amazonaws.com/Test/getorders  
*What we learned:*  We learned the necessity of planning use cases, as well as the details of what will be communicated for each use case.

**Develop a service endpoint definition that uses complex inputs and outputs.**
Select one of your endpoints and list the operation’s input and output objects.
Under each, list its attributes.

*Endpoint:* /createorder

*Input object(s):* 

* List of menu items.
* Client name.
* Client phone.
* Total cost.


*Output object(s):*      

* Order id.
* Order date.
* List of menu items.
* Client name.
* Client phone.
* Total cost.

**Given a user story that requires a user to provide values to a service
endpoint, design a service endpoint including inputs, outputs, and errors.**
Select one of your endpoints that accepts input values from a client. List the
error cases you identified and how the service responds in each case. Provide at
most 3 error cases.

|**Endpoint:** Create Order |                     |
|---            |---                  |
|**Error case** |**Service response** |
|  input contains invalid characters.             |     code 403 Invalid_Request                |
|        the database is unreachable        |              code 500 Database_Not_Found       |
|               |                     |

**Develop a service endpoint definition that uses query parameters to determine
how results are sorted or filtered.** List at least one endpoint that allows
sorting or filtering of results. Which attribute(s) can be sorted/filtered on?

*Endpoint:*         Create Order Endpoint

*Attribute(s):*  Status 

**Determine whether a given error condition should result in a client or server
exception.** List one client exception and one server exception that your
service code throws. List one condition in which this exception is thrown.

|                       |**Exception** |**One case in which it is thrown** |
|---	                |---	       |---	                               |
|**Client exception:**  |	Invalid_Request_Exception           |	      the client has provided an orderId that does not exist                         |
|**Service exception:** |	 Database_Not_Found_Exception          |	    DynamoDB is unreachable                           |

### DynamoDB Table Design

**Decompose a given set of use cases into a set of DynamoDB tables that provides
efficient data access.** List the DynamoDB tables in your project:

1. Ingredients Table 
2. Orders Table
3. Menu Table


**Design a DynamoDB table key schema that allows items to be uniquely
identified.** Describe the primary key structure for your DynamoDB table with
the most interesting primary key. In a sentence or two, explain your choice of
partition/sort key(s).

1. We use unique partition keys for all 3 of our tables.

**Design the attributes of a DynamoDB table given a set of use cases.** List a
DynamoDB table with at least 3 attributes. List one relevant use case that uses
the attribute. In one sentence, describe why the attribute is included.

**Table name:**  Orders Table 
 
**Attributes:** 

|Attribute name |(One) relevant use case |attribute purpose |
|---            |---                     |---               |
|   Status            |   To check if a given order is ready.                     |    Display order's status              |
|    Phone           |        To have customer contact information.                |      Stores the customer's phone number            |
|   OrderId            |    Checking the contents of an order.                    |    Provides a unique identifier for every order.              |


### DynamoDB Indexes

**Design a GSI key schema and attribute projection that optimizes queries not
supported by a provided DynamoDB table.** In one or two sentences, explain why
you created one of the GSIs that your project uses, including one use case that
uses that index.

**Table name:** Orders Table

**Table keys:** Order Id

**GSI keys:** Status

**Use case for GSI:** Sort the table by status. Query for business user to view either finished or unfinished orders. 

**Implement functionality that uses query() to retrieve items from a provided
DynamoDB's GSI.** List one of your use cases that uses `query()` on a GSI.

**Table name:** Orders Table

**Use case for `query()` on GDI:** Sort the table by status. Query for business user to view either finished or unfinished orders.

## Soft(er) Outcomes

**Learn a new technology.** For each team member, list something new that that
team member learned:

|Team Member |Something new the team member learned |   
|---   |---                                   |
|  Jeremy    | Fundamentals of API design with API Gateway.                                   |   
| Svetlana     |  Dealing with dependency issues in build.gradle. Also managing conflicts in GitHub                                    |     
| Violet     |  How to use React and how to call API functions.                                    |     
| Jonathan     | How to use java script, html, and css.                                   |     
| Raymond |  How to use VIM.                           |

**Identify key words to research to accomplish a technical goal | Use sources
like sage and stack overflow to solve issues encountered while programming.**
Give an example of a search term that your team might have used to find an
answer to a technical question/obstacle that your team ran into. List the
resource that you found that was helpful.

**Search terms:** Java Convert Date to String

**Helpful resource:** https://www.javatpoint.com/java-date-to-string  




**Find material online to learn new technical topics.** List one resource that
your team found on your own that helped you on your project.

**Topic:** Use State React

**Resource:** https://www.youtube.com/watch?v=O6P86uwfdR0

**Share what was worked on yesterday, the plan for today, and any blockers as a
part of a scrum standup.** In one or two sentences, describe what your team
found to be the most useful outcome from holding daily standups.

Yesterday:
* Create Order endpoint. 
* Troubleshooting the API security. 
* Made tests. 
* Create Order front end.

Today: 
* Write project reflection.
* Prepare for project demo.
* Fill out Rubric.
* Set up API errors.

Blockers:
* API errors.
* Test writing.

Daily standups were useful to keep everyone on the same page. Everyone knew what they needed to work on next after we came together to discuss the project.

