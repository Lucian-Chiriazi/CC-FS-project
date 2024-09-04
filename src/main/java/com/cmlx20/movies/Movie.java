package com.cmlx20.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //Represents each document in the movie's collection.
@Data //takes care of getters and setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id //This tells the database that this property is the unique identifier.
    private ObjectId id;

    private String title;
    private String imdbId;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference  //Manual Reference Relationship - Saves only the objectId of the review and the body in a separate collection.
    private List<Review> reviewIds;

}
