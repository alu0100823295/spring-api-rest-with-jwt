package net.atos.practica.apirest.model.response;

import com.fasterxml.jackson.annotation.JsonView;
import net.atos.practica.apirest.utils.View;

public class Response {

    @JsonView(View.Admin.class)
    private int statusCode;
    @JsonView(View.Admin.class)
    private String message;

    public Response() {
        super();
    }

    public Response(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
