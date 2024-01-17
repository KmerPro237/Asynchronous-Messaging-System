## What are server sent events?

- Server-Sent Events (SSE) is a simple and efficient technology that enables a server to push real-time updates to a web client over a single, long-lived HTTP connection. SSE is a standard part of the HTML5 specification and is supported by most modern web browsers.

- Here are some key features of Server-Sent Events:

  #### - Unidirectional Communication:
    - SSE allows servers to send data to web clients over a single, long-lived HTTP connection. The communication is unidirectional, meaning that data flows from the server to the client.
  
  #### - Text-Based Format:
    - Data sent via SSE is in a text-based format, usually using the text/event-stream content type. Each event is represented as a plain text string and consists of one or more fields, including a mandatory "data" field that contains the payload.
  
  #### - Event Stream Format:
    - The data sent in SSE is organized as a stream of events. Each event is separated by double newline characters (\n\n). An event can have multiple fields, such as "event," "id," and "data."
  
  #### Automatic Reconnection:
  - SSE supports automatic reconnection. If the connection between the client and server is lost, the client can automatically attempt to reconnect to the server.
  
  #### - Event Types:
    - Events in SSE can be categorized by an "event" field, allowing clients to handle different types of events differently. This provides a way to organize and handle various updates sent by the server.
  
  Here's a basic example of an SSE event stream:

   ````cassandraql
  
    data: This is a message\n
    event: customEvent\n
    id: 123\n\n

   ````

  ## - SSE vs REST

    Server-Sent Events (SSE) and Representational State Transfer (REST) are two different concepts that serve different purposes in web development.
  
  ### - Server-Sent Events (SSE):
  
    - Purpose: SSE is a technology that enables server-to-client communication for real-time updates. It allows a server to push data to a web client over a single, long-lived HTTP connection.
    - Direction: SSE is unidirectional, meaning that data flows only from the server to the client.
    - Use Case: SSE is often used for scenarios where real-time updates or streaming data from the server to the client is required, such as live feeds, notifications, or status updates.
  
  ### - Representational State Transfer (REST):
  
    - Purpose: REST is an architectural style for designing networked applications. It is not a protocol but a set of principles that define how web services should be structured. RESTful APIs use standard HTTP methods (GET, POST, PUT, DELETE) to perform CRUD (Create, Read, Update, Delete) operations on resources.
    - Direction: RESTful communication is typically initiated by the client, and the server responds with the requested data or performs the requested action.
    - Use Case: RESTful APIs are commonly used for building web services that provide a standardized way for different systems to communicate over the web. They are widely used in scenarios where data needs to be retrieved, modified, or deleted.
  


