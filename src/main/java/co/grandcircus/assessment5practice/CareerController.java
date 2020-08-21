package co.grandcircus.assessment5practice;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CareerController {

	
	@RequestMapping("/")
    public String yearSelection(){
        return "year-selection";
    }
	
	
    @RequestMapping("sorry")
    public String submitYear(Model model, int year, String name){
    	model.addAttribute("year",year);
    	model.addAttribute("name",name);
        return "sorry";
    }
	
	@PostMapping("submit-details")
	public String validator(String name, int year, Model model) {
		
		model.addAttribute("year",year);
		model.addAttribute("name",name);
		String msg = "";

		if (year < 1943 || year > 2003) {
			if (year < 1943) {
				msg = "Sorry!! Birthyear is out of range";
				model.addAttribute("msg", msg);
				return "sorry";
			}
			if (year > 2003) {
				msg = "Sorry! You are too young";
				model.addAttribute("msg", msg);
				return "sorry";
			}	
				
		}
		if (!Character.isUpperCase(name.charAt(0))) {
			msg = "Your name does not follow guidelines";
			model.addAttribute("msg", msg);
			return "sorry";
		} 	
		return "career-selection";
	}

	@RequestMapping("/career-display")
		public String careerChoice(Model model, @RequestParam("career") String career){
		
			model.addAttribute("career", career);
			String path = "/career?career=" + career;
			
		    return "/career";
		}
	


}
