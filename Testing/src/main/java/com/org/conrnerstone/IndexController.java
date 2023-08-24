/**
 * 
 */
package com.org.conrnerstone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.conrnerstone.dto.EmployeeRequestDto;
import com.org.conrnerstone.dto.EmployeeResponeDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@Slf4j
@RestController
public class IndexController {

	@GetMapping("/")
	public String getHome() {
		log.debug("Inside the Home method");
		log.info("This is info Log");
		log.error("This is Error Log");
		log.trace("This is Trace Log");
		log.warn("this is LOG for Warning");

		return "Hello";
	}

	@PostMapping("/getempdetails")
	public EmployeeResponeDto getEmpDetails(@RequestBody EmployeeRequestDto employeeRequestDto) {
		log.info("Inside the getEmpDetails");
		log.debug("Request Json String " + employeeRequestDto.toString());
		EmployeeResponeDto employeeResponeDto = new EmployeeResponeDto();

		employeeResponeDto.setEmpid(employeeRequestDto.getEmpid());
		employeeResponeDto.setEmailid(employeeRequestDto.getEmailid());
		employeeResponeDto.setEmpname(employeeRequestDto.getEmpname());
		employeeResponeDto.setEmpstatus(employeeRequestDto.isEmpstatus());
		employeeResponeDto.setMobileno(employeeRequestDto.getMobileno());
		employeeResponeDto.setAddress("Kondhwa");
		employeeResponeDto.setSalary(50000);
		try {
			int x = employeeResponeDto.getSalary() / 0;
		} catch (ArithmeticException e) {
			log.error("Exception occured while Calculating the salary " + e.getMessage());
		}
		return employeeResponeDto;
	}

	@GetMapping("/checklogger")
	public String checklogger() {
		log.info("inside the checklooger Method");
		for (int i = 0; i < 100000; i++) {
			log.debug("Random Number is " + Math.random());
		}
		log.info("Method Execution Completed");
		return "";
	}

}
