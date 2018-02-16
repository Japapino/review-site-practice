package wcci.spring.reviewsitepractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReviewRepository {
	
	Map<Long, Review> reviews = new HashMap<>();
	
	public ReviewRepository() {
		Review batman = new Review(1L,"Batma","Batman review"); 
		Review superman = new Review(2L,"Superman","Sherlock review"); 
		Review sherlock = new Review(3L,"Sherlock","Sherlock review");
		
		reviews.put(batman.getKey(), batman);
		reviews.put(superman.getKey(), superman);
		reviews.put(sherlock.getKey(), sherlock); 
	}
	public ReviewRepository(Review review) {
		reviews.put(review.getKey(), review);
	}

	public ReviewRepository(Review firstReview, Review secondReview) {
		reviews.put(firstReview.getKey(), firstReview);
		reviews.put(secondReview.getKey(), secondReview);
	}

	public Review findOne(long reviewId) {
		return reviews.get(reviewId);
	}

	public Collection<Review> findAll() {
		
		return reviews.values();
	}

}
