package com.zensar.spring;
/*
 * Author: Trigun Rai
 * Creation Date:27-07-2019/12:55 pm IST
 * Modification Date:27-07-2019/12:55 pm IST
 * Version:1.0
 * Copyright:Zensar Technologies.All right reserved
 * Description:It is specialized greeting used to greet jimmy for holi
 * 
 */

public class HoliGreeting implements Greeting {
	public HoliGreeting() {
		// TODO Auto-generated constructor stub
	System.out.println("HoliGreeting created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi Jimmy. May your life be filled with colours";
	}

}
