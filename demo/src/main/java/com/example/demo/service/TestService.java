package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Human;

@Service
public class TestService {
	
	List<Human> humanList= new ArrayList<Human>();

	public List<Human> addHuman(Human addHuman) {
		humanList.add(addHuman);
		return humanList;
	}

	public List<Human> removeHuman(Human removeHuman) {
		humanList.remove(removeHuman);
		return humanList;
	}

	public List<Human> getAllHumans() {
		humanList.add(new Human("a@email.com", 45,3453554));
		humanList.add(new Human("b@email.com", 37,3444444));
		return humanList;
	}

}
