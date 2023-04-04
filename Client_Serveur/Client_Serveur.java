package Client_Serveur;

public class Client_Serveur {
    
    public static void main(String [] args ) {
        System.out.println ("Instantiation de la configuration clientserveur");
        
        RPC Client1_Serveur1;
        Role adminRole = new Role();
        Service download = new Service();
        Port port1 = new Port();
        Configuration_client Configuration_client1 = new Configuration_client();
        Composant_client Client1 = new Composant_client(adminRole, port1, download, Configuration_client1);
        System.out.println(Client1);

    }
}