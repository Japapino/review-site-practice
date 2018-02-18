package wcci.spring.reviewsitepractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class Review {
	private long reviewId;
	private String name;
	private String review;
	private ArrayList<String> tags = new ArrayList<>();
	private String imagePath; 

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

	public void setImage(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getImage() {
		return imagePath; 
	}

	public void addTag(String tag) {
		tags.add(tag);
	}

	public Collection<String> getTags() {
		return tags;
	}

}
