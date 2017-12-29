package com.dhiro.infomorf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.model.MessageFormat;
import com.dhiro.infomorf.model.SysParamModel;

@RestController
@RequestMapping("/param")
public class SysParamController {
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public ResponseEntity<MessageFormat> update(@RequestBody SysParamModel paramModel){
		return null;
	}
	
	@RequestMapping(value="/getParams", method=RequestMethod.GET)
	public ResponseEntity<MessageFormat> getParams(){
		return null;
	}
}
