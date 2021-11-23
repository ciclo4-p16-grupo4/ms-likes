package com.grupo4.mslikes.repositories;

import com.grupo4.mslikes.models.InmuebleId;
import com.grupo4.mslikes.models.Likes;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface LikesRepository extends MongoRepository<Likes, String> {
    List<Likes> findByUserId(int userId);
    List<Likes> findByInmuebleId(int inmuebleId);
    @Query(value="{inmuebleId: ?0}", count=true)
    long countLikesByInmuebleId(int inmuebleId);
    
//    @Query(value="{$group: {$or: ?0}}")
//    List<Likes> getAllListedLikedCount(List <InmuebleId> q);
}
