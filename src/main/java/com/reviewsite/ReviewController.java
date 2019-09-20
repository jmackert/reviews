package com.reviewsite;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReviewController {
	
	@Resource
	private ReviewRepository reviewRepo; 
	
	@GetMapping("/show_reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviewsModel", reviewRepo.findAllReviews());
		return "reviews_template";
	}
	
	@GetMapping("/show_reviews/{id}")
	public String findOneReview(@PathVariable(value="id") Long id, Model model) throws ReviewNotFoundException {
		if(reviewRepo.findOneReview(id) == null) {
			throw new ReviewNotFoundException();
		}
		model.addAttribute("reviewModel",reviewRepo.findOneReview(id));
		return "review_template";
	}

}
