package wcci.spring.reviewsitepractice;

public class Review {
	private long reviewId;
	private String name; 
	private String review; 
	
	public Review(long reviewId, String name, String review) {
		this.reviewId = reviewId; 
		this.name = name; 
		this.review = review; 
	}

	public Long getKey() {
		return reviewId;
	}
	
	public String getName() {
		return name; 
	}

	public String getReview() {
		return review; 
	}
}
