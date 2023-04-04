package Client_Serveur;

public class Security_Query {
    
    public Role checkQueryRole() {
        Role roleDeDatabase = new Role("ADMIN");
        System.out.println("ACCES BDD SECURITY QUERY - vérification du role");
        return roleDeDatabase;
    }



    public class Glu {
        //implementer la connection comme on le souhaite
        public Glu() {}
        public void finalize() throws Throwable {}
    }
}
