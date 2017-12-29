package com.dhiro.infomorf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.model.MessageFormat;
import com.dhiro.infomorf.model.RoleModel;
import com.dhiro.infomorf.model.UserModel;

@RestController
@RequestMapping("/user")
public class UserRoleController {
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> addUser(@RequestBody UserModel userModel){
		return null;
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.PUT)
	public ResponseEntity<MessageFormat> updateUser(@RequestBody UserModel userModel){
		return null;
	}
	
	@RequestMapping(value="/addRole", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> addRole(@RequestBody RoleModel roleModel){
		return null;
	}
	
	@RequestMapping(value="/updateRole", method=RequestMethod.PUT)
	public ResponseEntity<MessageFormat> updateRole(@RequestBody RoleModel roleModel){
		return null;
	}
	
	@RequestMapping(value="/getRole", method=RequestMethod.GET)
	public ResponseEntity<MessageFormat> getRole(){
		return null;
	}
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	public ResponseEntity<MessageFormat> getUser(){
		return null;
	}
}
