package net.atos.practica.apirest.service;

import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.model.response.UserResponse;

public interface UserService {

    public UserResponse createUser(UserRequest userRequest);
}
