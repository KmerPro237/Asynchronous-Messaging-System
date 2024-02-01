
@XmlRootElement
public class Employee {
    private int id;
    private String firstName;
    // standard getters and setters


    public Employee(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget webTarget
                = client.target("http://localhost:8082/spring-jersey");
        WebTarget employeeWebTarget
                = webTarget.path("resources/employees");
        Invocation.Builder invocationBuilder
                = employeeWebTarget.request(MediaType.APPLICATION_JSON);
        Response response
                = invocationBuilder.get(Employee.class);
        Response response
                = invocationBuilder
                .post(Entity.entity(employee, MediaType.APPLICATION_JSON);
    }
}