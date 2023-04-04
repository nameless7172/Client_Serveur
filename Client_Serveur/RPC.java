package Client_Serveur;

public class RPC {
    public String service_type = "communication";
    public class Glu {
        public Glu(){ }
        public void Role1 () {}
        public void Role2 () {}
        public void Communication (){
	        Role1();
	        Role2();
        }
        public void finalize(){};
    }
    public RPC() { }
}