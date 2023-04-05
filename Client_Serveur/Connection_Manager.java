package Client_Serveur;
import java.util.List;

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
    public <R> R dbquery(String serviceName){
        //encore une fois, ce code sert pour une demonstration et n'est pas optimal
        switch(serviceName){
            case "getUsersService":
                R result = (R) this.sql_query.<R>getAll();
                return result;
            default:
                return null;
        }       
    }
    public String external_socket_data(){
        return "external_socket";
    }

}
