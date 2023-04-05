package Client_Serveur;

public class ServiceFourni {
    public String services(String serviceName){
        switch(serviceName){
            case "getAllUsers":
                return this.getAll();
            case "getAllRoles":
                return this.getAllRoles();
            default:
                return null;
        }
        
    }

    public String getAll(){
        return "getUsersService";
    }

    public String getAllRoles(){
        return "getUsersService";
    }

}
