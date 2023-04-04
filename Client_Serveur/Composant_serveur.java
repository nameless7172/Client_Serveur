package Client_Serveur;

public class Composant_serveur {
    public Role roleRequis;
    public Port portFourni;
    public Service serviceRequis;
    public Configuration_serveur configuration_serveur;
    

    public Composant_serveur(Role roleRequis, Port portFourni, Service serviceRequis, Configuration_serveur configuration_serveur) {
        this.roleRequis = Configuration_serveur.getRoleServeur();
        this.portFourni = portFourni;
        this.serviceRequis = serviceRequis;
        this.configuration_serveur = configuration_serveur;
    }

    public Role getRoleRequis() {
        return roleRequis;
    }

}
