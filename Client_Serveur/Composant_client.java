package Client_Serveur;

public class Composant_client {
    public Role roleFourni;
    public Port portRequis;
    public ServiceRequis serviceRequis;
    public Configuration_client configuration_client;
    

    public Composant_client(Role roleFourni, Port portRequis, ServiceRequis serviceRequis, Configuration_client configuration_client) {
        this.roleFourni = roleFourni;
        this.portRequis = portRequis;
        this.serviceRequis = serviceRequis;
        this.configuration_client = configuration_client;
    }

    public Role getRoleFourni() {
        return roleFourni;
    }

    public ServiceRequis getServiceRequis(){
        return serviceRequis;
    }


}
