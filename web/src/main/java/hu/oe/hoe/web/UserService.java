/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.oe.hoe.web;

import hu.oe.hoe.adatok.LoginException;
import hu.oe.hoe.adatok.RegistrationException;
import hu.oe.hoe.adatok.User;
import hu.oe.hoe.adatok.UserRepository;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserService {
    @Inject
    UserRepository ur;
    
    
    
    
    public void registration(String pName, String pPassword) throws RegistrationException{
        try{
            ur.getByName(pName);
            ur.add(new  User(pName, pPassword, false));
            
        }
        catch(Exception e){throw new RegistrationException();}
    }

    public User login(String pName, String pPassword) throws LoginException{
        try{
            return ur.getByNamePassword(pName, pPassword);
            
        }
        catch(Exception e){throw new LoginException();}
    }
}
