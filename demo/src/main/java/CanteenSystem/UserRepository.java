package CanteenSystem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    //Insert User
    @Transactional
    @Procedure(procedureName = "add_user")
    void getCreateUser(String id,String fname,String lname,String username,String email,Integer phone,String password,String usertype);

    //Login User
    @Query(value = "SELECT u from User u WHERE u.email=?1 AND u.password=?2")
    User getLogin(String email,String password);

    //Get All Users
    @Query(value = "SELECT * FROM view_users", nativeQuery = true)
    List<User> getAllUsers();

    //Update Users
    @Transactional
    @Procedure(procedureName = "update_user")
    void getUpdateUser(String id,String fname,String lname,String username,String email,Integer phone,String password,String usertype);

    //Delete Users
    @Transactional
    @Procedure(procedureName = "delete_user")
    void getDeleteUser(String id,String username,String password );
}
