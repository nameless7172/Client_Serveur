package Client_Serveur;

public class Security_Query {
    
    public Role checkQueryRole() {
        // String result = "";
        // if (role.equals("SELECT * FROM users")) {
        //     result = "SELECT * FROM users";
        // }
        Role roleDeDatabase = new Role("ADMIN");
        System.out.println("ACCES BDD SECURITY QUERY");
        return roleDeDatabase;
    }

    public static String getAll() {
        return "SELECT * FROM users";
    }

    public class Glu {
        //implementer la connection comme on le souhaite
        public Glu() {}
        public void finalize() throws Throwable {}
    }
}
