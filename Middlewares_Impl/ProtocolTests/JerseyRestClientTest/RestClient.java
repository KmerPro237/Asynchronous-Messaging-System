public class RestClient {

    private static final String REST_URI
            = "http://localhost:8082/spring-jersey/resources/employees";

    private Client client = ClientBuilder.newClient();

    public Employee getJsonEmployee(int id) {
        return client
                .target(REST_URI)
                .path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(Employee.class);
    }
    //...

    public Response createJsonEmployee(Employee emp) {
        return client
                .target(REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(emp, MediaType.APPLICATION_JSON));
    }


}