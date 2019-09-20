package com.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long,Review> reviewList = new HashMap<>();
	
	private Review reviewOne = new Review(1L,"Review One","This is a fantastic picture of kittens", "Cats", "/images/cat_01.jpg");
	private Review reviewTwo = new Review(2L,"Review Two","This is an ok picture of a cat", "Cats", "/images/cat_02.jpg");
	private Review reviewThree = new Review(3L,"Review Three","These are some cute kitties", "Cats", "/images/cat_03.jpg");
	private Review reviewFour = new Review(4L,"Review Four","Purrfect picture of a cat", "Cats", "/images/cat_04.jpg");
	private Review reviewFive = new Review(5L,"Review Five","This is the most amazing picture of a cat that I have ever seen", "Cats", "/images/cat_05.jpg");

	
	public ReviewRepository() {
		reviewList.put(reviewOne.getId(), reviewOne);
		reviewList.put(reviewTwo.getId(), reviewTwo);
		reviewList.put(reviewThree.getId(), reviewThree);
		reviewList.put(reviewFour.getId(), reviewFour);
		reviewList.put(reviewFive.getId(), reviewFive);


	}

	//uses varargs for testing purposes to take on the necessary reviews
	public ReviewRepository(Review...reviews) {
		for(Review review: reviews) {
			reviewList.put(review.getId(),review);
		}
	}

	public Review findOneReview(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAllReviews() {
		return reviewList.values();
	}

}
