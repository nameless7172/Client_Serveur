package Client_Serveur;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<RoleDataBase> roles;
    private List<User> users;

    private static Database database;


    private Database() {
        this.roles = new ArrayList<RoleDataBase>();
        this.users = new ArrayList<User>();
        RoleDataBase adminRole = new RoleDataBase("admin");
        RoleDataBase userRole = new RoleDataBase("user");
        this.roles.add(adminRole);
        this.roles.add(userRole);
        this.users.add(new User("theo", "vivi", userRole ));
        this.users.add(new User("admin", "superAdmin", adminRole ));
    }

    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }

    public void addRole(String name){
        roles.add(new RoleDataBase(name));
    }

    public void addUser(String name){
        roles.add(new RoleDataBase(name));
    }

    public List<User> getAllUsers(){
        return this.users;
    }

    public List<RoleDataBase> getAllRoles(){
        return this.roles;
    }
   
}
