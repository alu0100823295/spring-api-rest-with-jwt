package net.atos.practica.apirest.service;

import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.model.response.UserResponse;

import java.util.List;

public interface UserService {

    public UserEntity createUser(UserRequest userRequest);
    public UserEntity findUserByEmail(UserRequest userRequest);
    public List<UserEntity> findAll();
    public UserEntity modifyUser(UserRequest userRequest);
}
