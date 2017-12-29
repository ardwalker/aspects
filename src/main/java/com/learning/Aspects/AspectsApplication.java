package com.learning.Aspects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AspectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectsApplication.class, args);
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        AnyObject anyObject = ctx.getBean(AnyObject.class);
        GenericAnyObject<AnyObject> obj = (GenericAnyObject<AnyObject>) ctx.getBean("anyObjectGeneric");
        obj.save(anyObject);
    }
}
