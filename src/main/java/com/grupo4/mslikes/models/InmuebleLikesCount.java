/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo4.mslikes.models;

/**
 *
 * @author Admin
 */
public class InmuebleLikesCount {
    private int inmuebleId;
    private long likesCount;

    public InmuebleLikesCount(int inmuebleId, long likesCount) {
        this.inmuebleId = inmuebleId;
        this.likesCount = likesCount;
    }

    public int getInmueble_id() {
        return inmuebleId;
    }

    public long getLikes_count() {
        return likesCount;
    }

    public void setInmueble_id(int inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public void setLikes_count(int likesCount) {
        this.likesCount = likesCount;
    }
    
}