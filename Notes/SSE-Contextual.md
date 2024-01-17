## What is SSE?
---------
- Server-Sent Events is an API that allows clients to subscribe to a stream of events that is pushed from a server. First, the client makes a connection with the server over HTTP. The server continuously pushes events to the client as long as the connection persists. SSE differs from traditional HTTP requests, which use one request for one response. SSE also differs from Web Sockets in that SSE is unidirectional from the server to the client, and Web Sockets allow for bidirectional communication.

- For example, an application that provides real-time stock quotes might use SSE to push price updates from the server to the browser as soon as the server receives them. Such an application wouldn’t need Web Sockets because the data travels in only one direction, and polling the server by using HTTP requests wouldn’t provide real-time updates.


    ![image](https://github.com/KmerPro237/Asynchronous-Messaging-System/assets/118595893/e84bcf2c-5da8-48e2-abaf-8583cdebb708)
