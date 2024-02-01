import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.xml.bind.annotation.XmlRootElement;

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
                = invocationBuilder.get(Response.class);
        /*Response response
                = invocationBuilder
                .post(Entity.entity(Employee.class, MediaType.APPLICATION_JSON);*/
    }
}