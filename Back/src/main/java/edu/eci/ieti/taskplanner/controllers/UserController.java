package edu.eci.ieti.taskplanner.controllers;


import edu.eci.ieti.taskplanner.exceptions.LabException;
import edu.eci.ieti.taskplanner.model.User;
import edu.eci.ieti.taskplanner.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<?>getAllUsers(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>getUserById(@PathVariable String id){
        try {
            return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
        } catch (LabException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public ResponseEntity<?> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.create(user), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public  ResponseEntity<?> updateUser(@PathVariable String id,@RequestBody User user){
        try{
            return new ResponseEntity<>(userService.update(id,user),HttpStatus.OK);
        }
        catch (LabException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<?> deleteUser(@PathVariable String id){
        userService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
