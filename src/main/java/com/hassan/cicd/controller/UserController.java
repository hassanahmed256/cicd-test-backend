//package com.hassan.cicd.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.hassan.cicd.models.Users;
//import com.hassan.cicd.service.UsersService;
//
//@Controller
//public class UserController {
//	@Autowired
//	UsersService usersService;
//	
//	@GetMapping("/api/getAllUsers")
//	@ResponseBody
//	public List<Users> getAllUsers() {
//		return usersService.getAllUsers();
//	}
//}
