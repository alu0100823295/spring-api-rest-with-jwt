package net.atos.practica.apirest.service.user;

import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.repository.UserRepository;
import net.atos.practica.apirest.service.UserService;
import net.atos.practica.apirest.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImplementation() {
        super();
    }

    @Override
    public UserEntity createUser(UserRequest userRequest) throws Exception {

        if ( userRepository.findByEmail(
                Mapper.userRequestToUserEntity(userRequest).getEmail() ) != null ) {
            throw new Exception("User already created");
        }
        else {
            return userRepository.save(
                    Mapper.userRequestToUserEntity(userRequest)
            );
        }
    }

    @Override
    public UserEntity findUserByEmail(UserRequest userRequest) {

        return userRepository.findByEmail(
                Mapper.userRequestToUserEntity(userRequest).getEmail()
        );

    }

    @Override
    public List<UserEntity> findAll() {

        return userRepository.findAll();
    }

    @Override
    public UserEntity modifyUser(UserRequest userRequest) {
        return userRepository.save(
                Mapper.userRequestToUserEntity(userRequest)
        );
    }

    @Override
    public void deleteUser(List<UserRequest> userRequests) throws Exception {

        for ( UserRequest userRequest: userRequests ) {
            if ( !( userRepository.findByEmail(userRequest.getEmail()) == null ) ) {
                userRepository.delete(
                        Mapper.userRequestToUserEntity(userRequest)
                );
            }
            else {
                throw new Exception("User Not Found");
            }
        }
    }
}
