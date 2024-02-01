public class JerseyRestClientTest {
    public static final int HTTP_CREATED = 201;
    private RestClient client = new RestClient();

    @Test
    public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {
        Employee emp = new Employee(6, "Johny");

        Response response = client.createJsonEmployee(emp);

        assertEquals(response.getStatus(), HTTP_CREATED);
    }
}
