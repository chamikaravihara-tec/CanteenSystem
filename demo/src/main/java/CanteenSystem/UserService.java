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
    public boolean addUser(User user) {
        repo.save(user);
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
    public boolean deleteUser(String u_id){
        repo.getDeleteUser(u_id);
        return false;
    }

    //get user
    public User getUser(Integer u_id){
        return repo.findById(u_id).get();
    }


}
