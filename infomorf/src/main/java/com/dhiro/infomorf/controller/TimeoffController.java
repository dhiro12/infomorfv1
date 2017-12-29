package com.dhiro.infomorf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.model.MessageFormat;
import com.dhiro.infomorf.model.TimeoffModel;

@RestController
@RequestMapping("/timeoff")
public class TimeoffController {
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> addTimeoff(@RequestBody TimeoffModel timeoffModel){
		return null;
	}
	
	@RequestMapping(value="/apporveOrReject", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> ApproveOrReject(@RequestBody TimeoffModel timeoffModel){
		return null;
	}
}
