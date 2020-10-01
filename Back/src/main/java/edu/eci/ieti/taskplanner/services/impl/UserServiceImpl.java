package edu.eci.ieti.taskplanner.services.impl;

import edu.eci.ieti.taskplanner.exceptions.LabException;
import edu.eci.ieti.taskplanner.model.User;
import edu.eci.ieti.taskplanner.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private User[] usuariosIniciales= {new User("1","sancarbar@gmail.com","santiago carrillo","password")};
    private  LinkedList<User> usuarios=new LinkedList<User>(Arrays.asList(usuariosIniciales));


    @Override
    public List<User> getAll() {
        return usuarios;
    }

    @Override
    public User getById(String userId) throws LabException {
        User user=null;
        for (User u: usuarios) {
            if(u.getId().equals(userId)){
                user=u;
                break;
            }
        }
        if(user==null)throw new LabException(LabException.USER_NOT_FOUND);
        return user;
    }

    @Override
    public User create(User user) {
        usuarios.push(user);
        return user;
    }

    @Override
    public User update(String id, User user) throws LabException {
        User actual= getById(id);
        if(user.getCorreo()!=null){
            actual.setCorreo(user.getCorreo());
        }
        if(user.getNombre()!=null){
            actual.setNombre(user.getNombre());
        }
        if(user.getPassword()!=null){
            actual.setPassword(user.getPassword());
        }

        return actual;
    }

    @Override
    public void remove(String userId) {
        for (User u: usuarios) {
            if(u.getId().equals(userId)){
                usuarios.remove(u);
                break;
            }
        }
    }
}
