package com.dhiro.infomorf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.model.ExpenseModel;
import com.dhiro.infomorf.model.MessageFormat;

@RestController
@RequestMapping("/expense")
public class ExpenseController {
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> add(@RequestBody ExpenseModel expenseModel){
		return null;
	}
	
	@RequestMapping(value="/approveOrReject", method=RequestMethod.PUT)
	public ResponseEntity<MessageFormat> ApproveOrReject(@RequestBody ExpenseModel expenseModel){
		return null;
	}
}
