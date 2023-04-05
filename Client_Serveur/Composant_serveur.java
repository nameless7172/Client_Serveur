package Client_Serveur;
import java.util.List;

public class Composant_serveur {
    public Role roleRequis;
    public Port portFourni;
    public ServiceFourni serviceFourni;
    public Configuration_serveur configuration_serveur;
    

    public Composant_serveur(Role roleRequis, Port portFourni, ServiceFourni serviceFourni, Configuration_serveur configuration_serveur) {
        this.roleRequis = Configuration_serveur.getRoleServeur();
        this.portFourni = portFourni;
        this.serviceFourni = serviceFourni;
        this.configuration_serveur = configuration_serveur;
    }

    public Role getRoleRequis() {
        return roleRequis;
    }

    public <R> R getServices(String serviceName){
        String askedService = this.serviceFourni.services(serviceName);
        R result = Configuration_serveur.<R>getData(askedService);
        return result;
    }

}
