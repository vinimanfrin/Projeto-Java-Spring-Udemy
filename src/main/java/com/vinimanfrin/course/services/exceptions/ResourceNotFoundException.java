package com.vinimanfrin.course.services.exceptions;

import java.util.Objects;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
