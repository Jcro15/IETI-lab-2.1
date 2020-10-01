package edu.eci.ieti.taskplanner.services;

import edu.eci.ieti.taskplanner.exceptions.LabException;
import edu.eci.ieti.taskplanner.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getById(String userId) throws LabException;

    User create(User user);

    User update(String id, User user) throws LabException;

    void remove(String userId);
}
