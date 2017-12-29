package com.dhiro.infomorf.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.enums.TypeCode;
import com.dhiro.infomorf.model.ExpenseCategoryModel;
import com.dhiro.infomorf.model.MessageFormat;
import com.dhiro.infomorf.model.ProjectModel;
import com.dhiro.infomorf.model.TimeoffCategoryModel;

@RestController
@RequestMapping("/lookup")
public class MasterDataController {
	@RequestMapping(value="/project/update", method=RequestMethod.PATCH)
	public ResponseEntity<MessageFormat> update(@RequestBody ProjectModel projectModel){
		
		return null;
	}
	
	@RequestMapping(value="/project/add", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> add(@RequestBody ProjectModel projectModel){
		return null;
	}
	
	@RequestMapping(value="/expense/update", method=RequestMethod.PATCH)
	public ResponseEntity<MessageFormat> update(@RequestBody ExpenseCategoryModel expenseCategoryModel){
		
		return null;
	}
	
	@RequestMapping(value="/expense/add", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> add(@RequestBody ExpenseCategoryModel expenseCategoryModel){
		return null;
	}
	
	@RequestMapping(value="/timeoff/update", method=RequestMethod.PATCH)
	public ResponseEntity<MessageFormat> update(@RequestBody TimeoffCategoryModel timeoffCategoryModel){
		
		return null;
	}
	
	@RequestMapping(value="/timeoff/add", method=RequestMethod.POST)
	public ResponseEntity<MessageFormat> add(@RequestBody TimeoffCategoryModel timeoffCategoryModel){
		return null;
	}
	
	@RequestMapping(value="/getData/{typeCode}", method=RequestMethod.GET)
	public ResponseEntity<MessageFormat> getData(@PathVariable String typeCode){
		if(typeCode.equals(TypeCode.TS)){
			
		}else if(typeCode.equals(TypeCode.EXP)){
			
		}else if(typeCode.equals(TypeCode.TO)){
			
		}else{
			return null;
		}
		
		return null;
	}
}
