package Client_Serveur;

public class RPC {
    public String service_type = "communication";
    public class Glu {
        private Role roleFourni;
        private Role roleRequis;
        private Composant_client composant_client;
        private Composant_serveur composant_serveur;

        public Glu(Composant_client composant_client, Composant_serveur composant_serveur) {
            this.composant_client = composant_client;
            this.composant_serveur = composant_serveur;
        }
        
        public void Communication (){
            this.roleFourni = getRoleFourni();
            this.roleRequis = getRoleRequis();
            try{
                if(this.roleFourni.getName() == this.roleRequis.getName()){
                    System.out.println("Communication réussie");

                    //lancement du service
                    String serviceRequis = this.composant_client.getServiceRequis().getAllUsers();
                    String reponse = this.composant_serveur.getServices(serviceRequis);
                    System.out.println(reponse);
                }
            }
            catch(Exception e){
                System.out.println("Erreur de communication");
            }
        }
        public Role getRoleFourni(){
            return composant_client.getRoleFourni();
        }
        public Role getRoleRequis(){
            return composant_serveur.getRoleRequis();
        }
    }
}