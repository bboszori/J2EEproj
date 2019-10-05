package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javaee
 */
public class UserRepository {

    public static final UserRepository  instance = new UserRepository();
    
    private List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("a", "a", false));
    }

    
    public void registration(String pName, String pPassword) throws RegistrationException{
        for(User u: users){
            if(u.getName().equals(pName))
                throw new RegistrationException();
        }
        User tmpUser = new User(pName, pPassword, false);       
        users.add(tmpUser);
    }

    public User login(String pName, String pPassword) throws LoginException{
        for(User u: users){
            if(u.getName().equals(pName) && u.getPassword().equals(pPassword))
                return u;
        }
        throw new LoginException();
    }

    
}
