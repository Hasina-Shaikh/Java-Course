/**
 * 
 */
package com.cornerstone;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author muskanshaikh
 *
 */
@RestController
public class ControllerIndex {

	@PostMapping("/postdata")
	public Data1 getData(@RequestBody Data1 data) {
		
		Data1 data1 = new Data1();
		data1.setID(data.getID());
		data1.setName("Muskan");
		return data1;
	}
}
