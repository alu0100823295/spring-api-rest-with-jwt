package net.atos.practica.apirest.controller;


import com.fasterxml.jackson.annotation.JsonView;
import net.atos.practica.apirest.model.entity.UserEntity;
import net.atos.practica.apirest.model.request.UserRequest;
import net.atos.practica.apirest.model.response.Response;
import net.atos.practica.apirest.service.UserService;
import net.atos.practica.apirest.utils.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {
        super();
    }

    @GetMapping("/showAll")
    @JsonView(View.Admin.class)
    public List<UserEntity> showAll() {
        return userService.findAll();
    }

    @GetMapping("/show")
    @JsonView(View.Admin.class)
    public UserEntity showUser(
            @RequestBody
            final UserRequest userRequest
    ) {
        return userService.findUserByEmail(userRequest);
    }

    @PostMapping("/create")
    @JsonView(View.Admin.class)
    public UserEntity createUser(
            @Valid
            @RequestBody
            final UserRequest userRequest
    ) {
        try {
            return userService.createUser(userRequest);
        }
        catch ( Exception e ) {
            return new UserEntity();
        }
    }

    @PutMapping("/modify")
    @JsonView(View.Admin.class)
    public UserEntity modifyUser(
            @Valid
            @RequestBody
            final UserRequest userRequest
    ) {
        return userService.modifyUser(userRequest);
    }

    @PostMapping("/delete")
    @JsonView(View.Admin.class)
    public Response deleteUser(
            @RequestBody
            final List<UserRequest> userRequests
    ) {
        try {
            userService.deleteUser(userRequests);
            return new Response(200, "User Deleted Successfully");
        }
        catch ( Exception e ) {
            return new Response(500, e.getMessage());
        }
    }
}
