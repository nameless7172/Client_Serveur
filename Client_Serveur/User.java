package Client_Serveur;

//permet de simuler la table USER de la base de données
public class User {
    private String nom, prenom;
    private RoleDataBase role;

    public User (String nom, String prenom, RoleDataBase role){
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public RoleDataBase getRole(){
        return this.role;
    }
}
