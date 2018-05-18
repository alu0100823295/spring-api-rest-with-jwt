package net.atos.practica.apirest.controller;

import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.model.response.UserResponse;
import net.atos.practica.apirest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {
        super();
    }

    @PostMapping("/createUser")
    public UserResponse createUser(
            @Valid
            @RequestBody
            final UserRequest userRequest
    ) {
        return userService.createUser(userRequest);
    }

    @GetMapping("/show")
    public UserResponse showUser(
            @RequestBody
            final UserRequest userRequest
    ) {
        return userService.findUserByEmail(userRequest);
    }
}
