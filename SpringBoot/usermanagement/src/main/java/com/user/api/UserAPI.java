package com.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.bean.UserBean;
import com.user.controller.UserController;

@RestController
@RequestMapping("/gateway")
public class UserAPI {
	
	@Autowired
	private UserController userController;
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody UserBean userBean) {
		userController.createUserController(userBean);
		return null;
	}
	
	@GetMapping("/getUsers")
	public UserBean getUsers() {
		userController.getUserController();
		return null;
	}
	
	@GetMapping("/getUser/{id}")
	public UserBean getUserById(@PathVariable Integer id) {
		userController.getUserByIdController(id);
		return null;
	}
	
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody UserBean userBean) {
		userController.updateUserController(userBean);
		return null;
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Integer id) {
		userController.deleteUserController(id);
		return null;
	}
	
	
}
	