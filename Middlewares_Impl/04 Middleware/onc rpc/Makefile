add: add_client.c add_server.c
	gcc -g -DRPC_SVC_FG -c -o add_clnt.o add_clnt.c 
	gcc -g -DRPC_SVC_FG -c -o add_client.o add_client.c 
	gcc -g -DRPC_SVC_FG -c -o add_xdr.o add_xdr.c 
	gcc -g -DRPC_SVC_FG -o add_client add_clnt.o add_client.o add_xdr.o 
	gcc -g -DRPC_SVC_FG -c -o add_svc.o add_svc.c 
	gcc -g -DRPC_SVC_FG -c -o add_server.o add_server.c 
	gcc -g -DRPC_SVC_FG -o add_server add_svc.o add_server.o add_xdr.o 


