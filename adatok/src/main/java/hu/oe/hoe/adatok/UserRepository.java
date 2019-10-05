package hu.oe.hoe.adatok;

import java.util.ArrayList;
import java.util.List;



public class UserRepository {

    private List<User> users = new ArrayList<>();


    
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
