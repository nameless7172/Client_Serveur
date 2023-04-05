package Client_Serveur;
import java.sql.*;
import java.util.List;

public class SQL_Query {

    public <R> R getAll() {
        //on simule l'acces au BDD
        Database db = Database.getInstance();
        R result = (R) db.getAllUsers();
        return result;
    }


    public class Glu {
        //implementer la connection comme on le souhaite
        public Glu() {}
        public void finalize() throws Throwable {}
    }

    
}
