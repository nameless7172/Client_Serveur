package Client_Serveur;

public class Security_Manager {
    private Security_Query security_query;

    public Security_Manager() {
        security_query = new Security_Query();
    }

    public Role checkQuery() {
        return security_query.checkQueryRole();

        // return roleDeDatabase;
    }
    
}
