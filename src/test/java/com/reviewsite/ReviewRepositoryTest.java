package com.reviewsite;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;

public class ReviewRepositoryTest {
	
	@Resource
	private ReviewRepository underTest;
	
	private Review reviewOne = new Review(1L,"title", "Description", "Cats", "/images/cat_01.jpg");
	private Review reviewTwo = new Review(2L,"title", "Description", "Cats", "/images/cat_02.jpg");
	
	@Test
	public void shouldFindReviewOneById() {
		underTest = new ReviewRepository(reviewOne);
		Review foundReview = underTest.findOneReview(1L);
		assertThat(foundReview, is(reviewOne));
	}
	
	@Test
	public void shouldFindReviewTwoById() {
		underTest = new ReviewRepository(reviewTwo);
		Review foundReview = underTest.findOneReview(2L);
		assertThat(foundReview, is(reviewTwo));
	}
	
	@Test
	public void shouldFindAllReviews() {
		underTest = new ReviewRepository(reviewOne, reviewTwo);
		Collection<Review> foundReviews = underTest.findAllReviews();
		assertThat(foundReviews, containsInAnyOrder(reviewOne, reviewTwo));
	}

}
