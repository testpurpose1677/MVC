package webMVCControllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class momcontroller {
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "Ok , Here is your sugar . ";
		
	}
}
