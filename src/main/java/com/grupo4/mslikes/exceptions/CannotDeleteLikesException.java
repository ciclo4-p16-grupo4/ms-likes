/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo4.mslikes.exceptions;

/**
 *
 * @author Admin
 */
public class CannotDeleteLikesException extends RuntimeException {
    

    public CannotDeleteLikesException(String message ) {
       super("No se puede eliminar el like: "+message);
    }    
}
