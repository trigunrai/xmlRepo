package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApp 
{
    public static void main( String[] args )
    {//Spring IOC container Object
        ApplicationContext ctx=new ClassPathXmlApplicationContext("greetings.xml");
        //getting readymade object from Spring IOC container	
        Greeting g1=ctx.getBean("birthday",Greeting.class);
        	//invoking business logic method
        System.out.println(g1.sayGreet());
        
      //getting readymade object from Spring IOC container	
        Greeting g2=ctx.getBean("holi",Greeting.class);
        	//invoking business logic method
        System.out.println(g2.sayGreet());
        
        Greeting g3=ctx.getBean("birthday",Greeting.class);
        
    }
}
