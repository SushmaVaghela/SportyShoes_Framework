package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.User;
import service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserApiController {
	
	  @Autowired
	    private UserService service;

	    @GetMapping
	    public List<User> getUsers(){

	        return service.getAllUsers();

	    }
	
	 
}
