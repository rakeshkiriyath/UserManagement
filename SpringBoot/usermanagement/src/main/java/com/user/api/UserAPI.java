package com.user.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.UserException;
import com.user.bean.UserBean;

@RestController
@RequestMapping("/gateway")
public class UserAPI {
	
	@PostMapping("/createUser")
	public String createUser(@RequestBody UserBean userBean) throws UserException{
		return null;
	}
	
	@GetMapping("/getUsers")
	public UserBean getUsers() throws UserException{
		return null;
	}
	
	@GetMapping("/getUser/{id}")
	public UserBean getUserById(@PathVariable Integer id) throws UserException{
		return null;
	}
	
	@PutMapping("/updateUser/{loginId}")
	public String updateUser(@PathVariable String loginId,@RequestBody UserBean userBean) throws UserException{
		return null;
	}
	
	@DeleteMapping("/deleteUser/{loginId}")
	public String deleteUser(@PathVariable String loginId,@RequestBody UserBean userBean) throws UserException{
		return null;
	}
}
	