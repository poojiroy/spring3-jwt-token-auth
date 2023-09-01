package controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.UserData;
import service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userservice;

	@GetMapping("/user")
	public List<UserData> user() {
		return userservice.getUsers();
	}
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
		
	}
	
}
