package com.grupo4.mslikes.models;
import java.util.Date;
import org.springframework.data.annotation.Id;

public class Likes {
    @Id
    private String id;
    private int userId;
    private int inmuebleId;
    private Date creado;

    public Likes(String id, int userId, int inmuebleId, Date creado) {
        this.id = id;
        this.userId = userId;
        this.inmuebleId = inmuebleId;
        this.creado = creado;
    }

    public String getId() {
        return id;
    }

    public int getUser_id() {
        return userId;
    }

    public int getInmueble_id() {
        return inmuebleId;
    }

    public Date getCreado() {
        return creado;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public void setInmueble_id(int inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }
    
    
    
}
