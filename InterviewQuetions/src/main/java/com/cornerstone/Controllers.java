/**
 * 
 */
package com.cornerstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class Controllers {
	
	@PostMapping("/savedata")
	public EntityNew printData(@RequestBody EntityNew employeeRequestDto )
	{
		EntityNew employeeResponeDto = new EntityNew();
		employeeResponeDto.setName(employeeRequestDto.getName());
		employeeResponeDto.setNumber("7378366215");
		return employeeResponeDto;
	}
}
