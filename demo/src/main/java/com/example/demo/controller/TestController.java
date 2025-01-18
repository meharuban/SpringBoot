package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Human;
import com.example.demo.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService tService;
	
	@GetMapping("/names/{name}")
	public String getName(@PathVariable String name) {
		return name;
	}

	@GetMapping("/names")
	public String getName(@RequestParam String name,@RequestParam int age ) {
		return name +"  "+age;
	}
	
	@GetMapping("/humans")
	public List<Human> getAllHumans( ) {
		return tService.getAllHumans();
	}
	
	@PostMapping("/humans")
	public List<Human> addHuman(@RequestBody Human addHuman ) {
		return tService.addHuman(addHuman);
	}
	
	@DeleteMapping("/humans")
	public List<Human> deleteHuman(@RequestBody Human removeHuman ) {
		return tService.removeHuman(removeHuman);
	}
	
}
