package Client_Serveur;

public class Connection_Manager {
    private ClearanceRequest clearanceRequest;
    private SQL_Query sql_query;

    //constructor
    public Connection_Manager(ClearanceRequest clearanceRequest, SQL_Query sql_query) {
        this.clearanceRequest = clearanceRequest;
        this.sql_query = sql_query;
    }
    public Role SecurityCheck(){
        clearanceRequest.SecurityAuthentication();
        Role role = new Role("admin");
        return role;
    }
    public String external_socket_data(){
        return "external_socket";
    }

}
