package net.atos.practica.apirest.model.entity;

import com.fasterxml.jackson.annotation.JsonView;
import net.atos.practica.apirest.utils.View;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USERS")
public class UserEntity {

    public UserEntity() {
        super();
    }

    //@Id
    @Column(name = "EMAIL")
    @JsonView(View.Public.class)
    private String email;

    @Id
    @Column(name = "USERNAME")
    @JsonView(View.Admin.class)
    private String username;


    @Column(name = "PASSWORD")
    @JsonView(View.Admin.class)
    private String password;

    @Column(name = "NAME")
    @Size(min = 2, max = 50)
    @JsonView(View.Public.class)
    private String name;

    @Column(name = "ADDRESS")
    @JsonView(View.Admin.class)
    private String address;

    @Column(name = "GENDER")
    @JsonView(View.Public.class)
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
