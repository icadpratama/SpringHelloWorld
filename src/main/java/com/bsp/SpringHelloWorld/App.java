package com.bsp.SpringHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bsp.common.Hello;

public class App {
	private static ApplicationContext context;
	
    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("Beans.xml");
        
        Hello obj = (Hello) context.getBean("helloWorld");
        obj.printMessage();
    }
}
