package net.atos.practica.apirest.service;

import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;

import java.util.List;

public interface UserService {

    public UserEntity createUser(UserRequest userRequest) throws Exception;
    public UserEntity findUserByEmail(UserRequest userRequest);
    public List<UserEntity> findAll();
    public UserEntity modifyUser(UserRequest userRequest);
    public void deleteUser(List<UserRequest> userRequests) throws Exception;
}
