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

    @Id
    @Column(name = "EMAIL")
    @JsonView(View.Public.class)
    private String email;

    @Column(name = "NAME")
    @Size(min = 2, max = 50)
    @JsonView(View.Public.class)
    private String name;

    @Column(name = "ADDRESS")
    @JsonView(View.Admin.class)
    private String address;

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
