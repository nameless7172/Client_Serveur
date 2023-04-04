package Client_Serveur;

public class ClearanceRequest {
    private Security_Manager securityManager;

    public ClearanceRequest(Security_Manager securityManager) {
        this.securityManager = securityManager;
    }

    public Role SecurityAuthentication() {
        return securityManager.checkQuery();
    }
    public class Glu {
        //implementer la connection comme on le souhaite
        public Glu() {}
        public void finalize() throws Throwable {}
    }
}
