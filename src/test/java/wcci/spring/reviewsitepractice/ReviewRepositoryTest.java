package wcci.spring.reviewsitepractice;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewId = 23L;
	private Review firstReview = new Review(firstReviewId, "first review", "review of first game");

	private long secondReviewId = 86L;
	private Review secondReview = new Review(secondReviewId, "second review", "review of second game");

	@Test
	public void shouldFindFirstCourse() {
		underTest = new ReviewRepository(firstReview);

		Review result = underTest.findOne(firstReviewId);

		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondCourse() {

		underTest = new ReviewRepository(firstReview, secondReview);

		Review result = underTest.findOne(secondReviewId);

		assertThat(result, is(secondReview));
	}

	@Test
	public void shouldFindAll() {
		underTest = new ReviewRepository(firstReview, secondReview); 

		Collection<Review> result = underTest.findAll();

		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
	
	@Test
	public void shouldSetImagePathAsString() {
		underTest = new ReviewRepository(firstReview); 
		firstReview.setImage("test");
		String result = firstReview.getImage(); 
		assertThat(result, is("test")); 
	}
	
	@Test
	public void shouldAddTag() {
		underTest = new ReviewRepository(firstReview); 
		firstReview.addTag("action");
		List result = firstReview.getTags(); 
		assertThat(result, contains("action")); 

	}
	
}
