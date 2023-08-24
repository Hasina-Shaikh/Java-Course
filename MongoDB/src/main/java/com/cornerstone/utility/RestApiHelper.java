/**
 * 
 */
package com.cornerstone.utility;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cornerstone.dto.Root;
import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

/**
 * @author muskanshaikh
 *
 */
@Service
@Slf4j
//@Component
public class RestApiHelper {

	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<String> callApi() {
		String url = "https://gorest.co.in/public/v2/users";
		ResponseEntity<String> response = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("x-api-key", "d");
		response = restTemplate.getForEntity(url, String.class);
		if(response.getStatusCodeValue() == 200)
		{
			log.debug("Response" + response.getBody());
		}
		return response;
	}
	public ResponseEntity<String> callExchangeAPI() {
		String url = "https://gorest.co.in/public/v2/users";
		ResponseEntity<String> response = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("x-api-key", "d");
		response = restTemplate.exchange(url, HttpMethod.GET, response, String.class);
		if(response.getStatusCodeValue() == 200)
		{
			log.debug("Response" + response.getBody());
		}
		return response;
	}
	
	public ResponseEntity<String> postAPI() {
		String url = "https://gorest.co.in/public/v2/users";
		ResponseEntity<String> response = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("x-api-key", "d");
		Root root = new Root();
		root.setId(1001);
		root.setEmail("abc@gmail.com");
		root.setGender("female");
		root.setName("Muskan");
		root.setStatus("active");
		Gson gson = new Gson();
		String gsonreq = gson.toJson(root);
		log.debug("Gson String" + gsonreq);
		HttpEntity<String> httpentity = new HttpEntity<> (gsonreq);		
		response = restTemplate.exchange(url, HttpMethod.POST, httpentity, String.class);
		if(response.getStatusCodeValue() == 200)
		{
			log.debug("Response" + response.getBody());
		}
		return response;
	}
	
}
