package CanteenSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repo;

    //Create User
    public boolean addUser(String u_id,String u_fname,String u_lname,String u_username,String u_email,Integer u_phone,String u_password,String u_usertype) {
        repo.getCreateUser(u_id, u_fname, u_lname, u_username, u_email, u_phone, u_password, u_usertype);
        return true;
    }
    //Login User
    public  User loginUser(String u_email, String u_password){
        return repo.getLogin(u_email,u_password);
    }

    //View All Users
    public List<User> getAllUser(){
        return repo.getAllUsers();
    }

    //Update User
    public void userUpdate(String u_id,String u_fname,String u_lname,String u_username,String u_email,Integer u_phone,String u_password,String u_usertype){
        repo.getUpdateUser(u_id,u_fname,u_lname,u_username,u_email,u_phone,u_password,u_usertype);
    }

    //Delete User
    public void deleteUser(String u_id,String u_username,String u_password){
        repo.getDeleteUser(u_id,u_username,u_password);
    }

}
