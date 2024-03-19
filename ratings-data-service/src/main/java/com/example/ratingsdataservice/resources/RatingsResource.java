package com.example.ratingsdataservice.resources;

import com.example.ratingsdataservice.models.Rating;
import com.example.ratingsdataservice.models.UserRating;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        LOG.info("Inside user-rating-info");
        List<Rating> ratings = Arrays.asList(
                new Rating("11",5),
                new Rating("12",3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserId(userId);
        userRating.setRatings(ratings);
        return userRating;
    }
}
