package net.atos.practica.apirest.utils;

import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;

public class Mapper {
    public static UserEntity userRequestToUserEntity(UserRequest userRequest) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequest.getName());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setAddress(userRequest.getAddress());

        return userEntity;
    }
}
