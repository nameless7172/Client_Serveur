package Client_Serveur;

import java.util.List;

public class Database {
    private List<RoleDataBase> roles;
    private List<User> users;

    private static Database database;


    private Database() {
        RoleDataBase adminRole = new RoleDataBase("admin");
        RoleDataBase userRole = new RoleDataBase("user");
        roles.add(adminRole);
        roles.add(userRole);
        users.add(new User("theo", "vivi", userRole ));
        users.add(new User("admin", "superAdmin", adminRole ));
    }

    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }

    private void addRole(String name){
        roles.add(new RoleDataBase(name));
    }

    private void addUser(String name){
        roles.add(new RoleDataBase(name));
    }
   
}
