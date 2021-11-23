package com.grupo4.mslikes.controllers;

import com.grupo4.mslikes.exceptions.CannotDeleteLikesAdvice;
import com.grupo4.mslikes.exceptions.CannotDeleteLikesException;
import com.grupo4.mslikes.models.InmuebleLikesCount;
import com.grupo4.mslikes.models.Likes;
import com.grupo4.mslikes.repositories.LikesRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LikesController {
    
    @Autowired
    private final LikesRepository likesRepository;

    public LikesController(LikesRepository likesRepository) {
        this.likesRepository = likesRepository;
    }
    
    @GetMapping("/likes")
    List<Likes> getAllLikes() {
        return likesRepository.findAll();
    }
    
    @GetMapping("/likes/user/{userId}")
    List<Likes> getLikesByUserId(@PathVariable int userId) {
        return likesRepository.findByUserId(userId);
    }
    
    @GetMapping("/likes/inmueble/{inmuebleId}")
    List<Likes> getLikesByInmuebleId(@PathVariable int inmuebleId) {
        return likesRepository.findByInmuebleId(inmuebleId);
    }
    
    @GetMapping("/likes/count/inmueble/{inmuebleId}")
    InmuebleLikesCount getLikesCountByInmuebleId(@PathVariable int inmuebleId) {
        long count = likesRepository.countLikesByInmuebleId(inmuebleId);
        InmuebleLikesCount inmueble = new InmuebleLikesCount(inmuebleId, count);
        return inmueble;
    }
    
    @PostMapping("/likes")
    Likes newLike(@RequestBody Likes like){
        like.setCreado(new Date());
        return likesRepository.save(like);
    }
    
    @DeleteMapping("/likes/{likeId}")
    void deleteLike(@PathVariable String likeId){
        if(!likesRepository.existsById(likeId)){
            throw new CannotDeleteLikesException(likeId.toString()+" No existe");
        }
        likesRepository.deleteById(likeId);
    }
}
