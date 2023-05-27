package com.sbasics.reg;
import java.util.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);// container is created

		ProductServices service= context.getBean(ProductServices.class);
		
		//service.addproduct(new Products("Redmi charger","adapter","dressing table",2026));
		
		List<Products> smp=service.show();
		
		smp.forEach((n)-> System.out.println(n));
		
		service.isexist();
		
		service.findwithname("Redmi charger");
		
		service.findwithplace("Bedroom cart");
		
		service.findwithwar();
	}

}
 