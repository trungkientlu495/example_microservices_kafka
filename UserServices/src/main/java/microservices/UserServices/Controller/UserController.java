package microservices.UserServices.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.UserServices.Model.UserModel;
import microservices.UserServices.Services.UserServices;

@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	UserServices userServices;
	@PostMapping("/createUser")
	public void createUser(@ModelAttribute("userModel") UserModel userModel) {
		userServices.createUser(userModel);
	}
	
	@GetMapping("/tongUser")
	public int tongUser() {
		return userServices.tongUser();
	}
}
