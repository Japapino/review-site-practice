package wcci.spring.reviewsitepractice;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

		@Resource
		ReviewRepository reviewRepo;
		
		@RequestMapping(value = "reviews")
		public String getAllReviews(Model model) {
			model.addAttribute("reviews",reviewRepo.findAll());
			return "reviews";
		}
		
}
