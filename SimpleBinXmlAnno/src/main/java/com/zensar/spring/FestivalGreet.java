package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component ("Diwali")
public class FestivalGreet implements Greeting {
	public FestivalGreet() {
	// TODO Auto-generated constructor stub
	System.out.println("Greeting Created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}

}
