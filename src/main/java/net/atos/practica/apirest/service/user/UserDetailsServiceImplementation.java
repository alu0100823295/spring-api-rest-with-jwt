package net.atos.practica.apirest.service.user;


import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    public UserDetailsServiceImplementation() {
        super();
    }


    // Debemos implementar loadUserByUsername ( definido en UserDetailsService )
    // pero en nuestra aplicacion la equivalencia de Username sera email
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByEmail(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException(username);
        }
        return new User(userEntity.getEmail(), userEntity.getPassword(), emptyList());
    }
}
