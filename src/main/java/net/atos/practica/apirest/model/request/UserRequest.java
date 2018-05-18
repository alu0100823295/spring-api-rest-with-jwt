package net.atos.practica.apirest.model.request;

import javax.validation.constraints.Size;

public class UserRequest {

    private String email;
    @Size(min = 2, max = 10)
    private String name;
    private String address;

    public UserRequest() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
