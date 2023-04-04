package Client_Serveur;
public class Configuration_serveur {
    private static Connection_Manager connection_manager;

    public Configuration_serveur(Connection_Manager connection_manager) {
        Configuration_serveur.connection_manager = connection_manager;
    }

    public static Role getRoleServeur(){
        return connection_manager.SecurityCheck();
    }
}
