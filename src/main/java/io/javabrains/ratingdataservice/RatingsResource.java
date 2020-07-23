package io.javabrains.ratingdataservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }

    @RequestMapping("users/{userId}")
    public List<Rating> getUserrating(@PathVariable("userId") String userId){
        List<Rating> ratings= Arrays.asList(
                new Rating("1234",4),
                new Rating("5675",5),
                new Rating("5676",6),
                new Rating("5677",7)
        );
        return ratings;
    }
}
