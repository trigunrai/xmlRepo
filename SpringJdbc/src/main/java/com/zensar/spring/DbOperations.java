package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
    Product product=new Product(4503,"Laptop","Lenovo",28000.00f);
    ProductService service=ctx.getBean("productServiceImpl",ProductService.class);
   //service.create(product);
    product=service.findProductById(4503);
    System.out.println(product);
    
    Product product1=new Product(4503,"Laptop","Lenovo",30000.00f);
    service.edit(product1);
    
    Product product2=new Product();
    product2.setProductid(4503);
    //service.remove(product2);
    List<Product>productList=service.findAllProducts();
    for(Product p: productList)
    	System.out.println(p);
    }
}
