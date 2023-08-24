
/**
 * 
 */
package com.cornerstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@RestController
@Slf4j
public class TestController {

	@GetMapping("/public/v2/users/2065/posts")
	public String getData() {
		return "Get Method Called";
	}

	@PostMapping("/public/v2/users/2065/posts")
	public String getPostData() {
		return "Post Method Called";
	}

}
