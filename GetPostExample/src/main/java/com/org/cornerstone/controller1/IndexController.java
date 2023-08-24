/**
 * 
 */
package com.org.cornerstone.controller1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.cornerstone.dto1.EmpRequestDto;
import com.org.cornerstone.dto1.EmpResponseDto;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class IndexController {
	
	@Autowired
	private EmpRequestDto dto;
	
	@GetMapping("/")
	public EmpResponseDto  getEmployee(){
		return this.dto.getData();
	}
			



}
