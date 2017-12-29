package com.dhiro.infomorf;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhiro.infomorf.enums.ResponseStatus;
import com.dhiro.infomorf.model.AccessibilitiesModel;
import com.dhiro.infomorf.model.EmployeeModel;
import com.dhiro.infomorf.model.LoginRequestModel;
import com.dhiro.infomorf.model.LoginResponseModel;
import com.dhiro.infomorf.model.ResponseFormat;
import com.dhiro.infomorf.model.RoleModel;
import com.dhiro.infomorf.model.UserModel;
import com.dhiro.infomorf.repository.AccessRepository;
import com.dhiro.infomorf.repository.EmployeeRepository;
import com.dhiro.infomorf.repository.RolesRepository;
import com.dhiro.infomorf.repository.UserLoginRepository;

@RestController
public class MainController {
	private ResponseFormat res;
	private String msg;
	
	@Autowired
	private UserLoginRepository repository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RolesRepository rolesRepository;
	
	@Autowired
	private AccessRepository accessRepository;
	
	public ResponseFormat success(String status, String msg, Object obj){
		res = new ResponseFormat();
		if(status.equals(ResponseStatus.Success.toString())){
			res.setResponseCode("00");
		}else if(status.equals(ResponseStatus.Error.toString())){
			res.setResponseCode("99");
		}
		res.setResponseDesc(status);
		res.setResult(obj);
		return res;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseEntity<ResponseFormat> login(@RequestBody LoginRequestModel request){
		UserModel model = new UserModel();
		res = new ResponseFormat();
		model = repository.findByUsername(request.getUsername());
		if(model!=null){
			// generate session
			EmployeeModel employeeModel = employeeRepository.findOne(model.getUserId());
			RoleModel role = rolesRepository.findByRoleCode(employeeModel.getRoleCode());
			List<AccessibilitiesModel> accessibilitiesModel = accessRepository.findByRoleCode(employeeModel.getRoleCode());
			
			LoginResponseModel loginResponseModel = new LoginResponseModel();
			loginResponseModel.setAddress(employeeModel.getAddress());
			loginResponseModel.setDob(employeeModel.getDob());
			loginResponseModel.setGender(employeeModel.getGender());
			loginResponseModel.setRoleName(role.getRoleName());
			loginResponseModel.setName(employeeModel.getName());
			loginResponseModel.setAccessibilitiesModels(accessibilitiesModel);
			

			res = success(ResponseStatus.Success.toString(), "success", loginResponseModel);
			
			return ResponseEntity.ok().body(res);
		}else{
			res = success(ResponseStatus.INVALID.toString(), "Invalid Username & Password", null);
		}
		
		return ResponseEntity.badRequest().body(res);
	}
	
	@RequestMapping(value="/sync", method=RequestMethod.GET)
	public ResponseEntity<ResponseFormat> syncMasterdata(){
		LoginResponseModel model = new LoginResponseModel();
		msg="Success Login";
		res = success(ResponseStatus.Success.toString(),msg,model);
		return ResponseEntity.ok().body(res);
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ResponseEntity<ResponseFormat> list(){
		LoginResponseModel model = new LoginResponseModel();
		msg="Success Login";
		res = success(ResponseStatus.Success.toString(),msg,model);
		return ResponseEntity.ok().body(res);
	}
}
