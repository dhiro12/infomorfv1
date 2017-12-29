package com.dhiro.infomorf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.model.ResponseMessage;
import com.dhiro.infomorf.model.TimesheetModel;

@RestController
@RequestMapping("/timesheet")
public class TimesheetController {
	@ResponseBody @RequestMapping("/addTime")
	public ResponseEntity<ResponseMessage> addTimesheet(@RequestBody(required=true) TimesheetModel model){
		return null;
		
	}
	
	
	
}
