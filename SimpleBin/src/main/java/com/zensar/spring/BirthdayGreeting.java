package com.zensar.spring;
/*
 * Author: Trigun Rai
 * Creation Date:27-07-2019/12:55 pm IST
 * Modification Date:27-07-2019/12:55 pm IST
 * Version:1.0
 * Copyright:Zensar Technologies.All right reserved
 * Description:It is specialized greeting used to greet jimmy on his birthday
 * 
 */

public class BirthdayGreeting implements Greeting {
public BirthdayGreeting() {
	// TODO Auto-generated constructor stub
System.out.println("Birthday Greeting Created");
}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Wish you a very happy birthday jimmy!"; 
	}

}
