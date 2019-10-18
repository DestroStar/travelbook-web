package Kh033Java.travelbook.service;

import Kh033Java.travelbook.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {


    ResponseEntity<Iterable<User>> getAllUsers();

    ResponseEntity<User> getUser(String id);

    ResponseEntity<User>  saveUser(User user);

    ResponseEntity<User> updateUser(String id, User user);

    ResponseEntity<User> deleteAllUsers();

    ResponseEntity<User> deleteUser(String id);
}
