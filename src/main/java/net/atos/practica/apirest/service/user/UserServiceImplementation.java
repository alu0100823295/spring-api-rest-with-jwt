package net.atos.practica.apirest.service.user;

import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.model.response.UserResponse;
import net.atos.practica.apirest.repository.UserRepository;
import net.atos.practica.apirest.service.UserService;
import net.atos.practica.apirest.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImplementation() {
        super();
    }

    @Override
    public UserResponse createUser(UserRequest userRequest) {

        UserEntity newUserEntity = userRepository.save(
                Mapper.userRequestToUserEntity(userRequest));

        return Mapper.userEntityToUserResponse(newUserEntity);
    }

    @Override
    public UserResponse findUserByEmail(UserRequest userRequest) {

        UserEntity showedUser = userRepository.findByEmail(
                Mapper.userRequestToUserEntity(userRequest).getEmail());

        return Mapper.userEntityToUserResponse(showedUser);
    }
}
