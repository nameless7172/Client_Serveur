package Client_Serveur;

public class ServiceFourni {
    public String services(String serviceName){
        if (serviceName == "getAllUsers"){
            return this.getAll();
        } else{
            // ici autres services
            return null;
        }
    }



    public String getAll(){
        return "getUsersService";
    }

}
