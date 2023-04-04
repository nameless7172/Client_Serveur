package Client_Serveur;
public class Configuration_serveur {
    private static Connection_Manager connection_manager;

    public Configuration_serveur(Connection_Manager connection_manager) {
        Configuration_serveur.connection_manager = connection_manager;
    }

    public static Role getRoleServeur(){
        return connection_manager.SecurityCheck();
    }

    //ceci n'est pas la meilleur maniere d'implementer un service mais ca sers pour une demonstration du principe
    public static String getData(String serviceName){
        System.out.println("service demandé par l'utilisateur:" + serviceName);
        return connection_manager.dbquery(serviceName);
    }
}
