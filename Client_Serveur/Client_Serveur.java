package Client_Serveur;
import java.util.List;

public class Client_Serveur {
    
    public static void main(String [] args ) {
        System.out.println ("Instantiation de la configuration clientserveur");
        

        
        // Création de rôle
        Role adminRole = new Role("admin");

        //Creation de service
        ServiceRequis getAllUsers = new ServiceRequis();
        ServiceFourni sendAllUsers = new ServiceFourni();
        Port port1 = new Port();

        //configuration client et composant client
        Configuration_client Configuration_client1 = new Configuration_client();
        Composant_client Client1 = new Composant_client(adminRole, port1, getAllUsers, Configuration_client1);

        //configuration serveur et composant serveur
        Security_Manager securityManager = new Security_Manager();
        ClearanceRequest clearanceRequest = new ClearanceRequest(securityManager);
        SQL_Query sql_query = new SQL_Query();
        Connection_Manager connectionManager = new Connection_Manager(clearanceRequest,sql_query); // create an instance of Connection_Manager
        Configuration_serveur Configuration_serveur1 = new Configuration_serveur(connectionManager);
        Composant_serveur serveur1 = new Composant_serveur(adminRole, port1, sendAllUsers, Configuration_serveur1);


        //Remote Protocol Communication
        RPC Client1_Serveur1 = new RPC();
        RPC.Glu glu = Client1_Serveur1.new Glu(Client1, serveur1);
        glu.Communication();

    }
}