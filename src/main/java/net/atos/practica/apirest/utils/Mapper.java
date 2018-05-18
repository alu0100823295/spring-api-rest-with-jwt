package net.atos.practica.apirest.utils;

import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.model.response.UserResponse;

public class Mapper {
    public static UserEntity userRequestToUserEntity(UserRequest userRequest) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName(userRequest.getName());
        userEntity.setEmail(userRequest.getEmail());
        userEntity.setAddress(userRequest.getAddress());

        return userEntity;
    }

    public static UserResponse userEntityToUserResponse(UserEntity userEntity) {

        UserResponse userResponse = new UserResponse();
        userResponse.setName(userEntity.getName());
        userResponse.setEmail(userEntity.getEmail());

        return userResponse;
    }
}
