package edu.eci.ieti.taskplanner.exceptions;

public class LabException extends Exception {
    public static final String USER_NOT_FOUND = "User not found";

    public LabException(){
        super();
    }
    public LabException(String message){
        super(message);
    }
}
