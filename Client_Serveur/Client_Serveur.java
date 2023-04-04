package Client_Serveur;

public class Client_Serveur {
    
    public static void main(String [] args ) {
        System.out.println ("Instantiation de la configuration clientserveur");
        

        
        // Création des rôles
        Role adminRole = new Role("admin");

        Service download = new Service();
        Port port1 = new Port();
        Configuration_client Configuration_client1 = new Configuration_client();
        Composant_client Client1 = new Composant_client(adminRole, port1, download, Configuration_client1);

        //creation configuration serveur
        Security_Manager securityManager = new Security_Manager();
        ClearanceRequest clearanceRequest = new ClearanceRequest(securityManager);
        SQL_Query sql_query = new SQL_Query();
        Connection_Manager connectionManager = new Connection_Manager(clearanceRequest,sql_query); // create an instance of Connection_Manager

        Configuration_serveur Configuration_serveur1 = new Configuration_serveur(connectionManager);
        Composant_serveur serveur1 = new Composant_serveur(adminRole, port1, download, Configuration_serveur1);


        RPC Client1_Serveur1 = new RPC();
        RPC.Glu glu = Client1_Serveur1.new Glu(Client1, serveur1);
        glu.Communication();

    }
}