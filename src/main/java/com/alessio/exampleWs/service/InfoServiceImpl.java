package com.alessio.exampleWs.service;

import com.alessio.exampleWs.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class InfoServiceImpl implements InfoService {

	@Override
	public Greeting sayHowAreYou(String name) {
		Greeting greeting = new Greeting();
		greeting.setMessage("How are you " + name + "!!!");
		greeting.setDate(new Date());
		return greeting;
	}
}
