package com.Tourisme.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tourisme.demo.AcessData.DataUser;
import com.Tourisme.demo.Model.User;

@RestController
@RequestMapping("api/")
@CrossOrigin 
public class UserController {
	@Autowired
	private DataUser dataUser;
	
	@GetMapping("users")
	public List <User>getUser() {
		return dataUser.findAll();
	}
}
