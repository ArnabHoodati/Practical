package com.anudipspringdb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anudipspringdb.entity.Book;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("spring-configuration.xml");
    	Book b1 = new Book();
    	b1.setBname("Java");
    	b1.setAuthorname("James Gosling");
    	b1.setType("Technical");
    	b1.setPrice(700);
    	
    	Book b2 = new Book();
    	b2.setBname("Secret");
    	b2.setAuthorname("Rhonda Byrne");
    	b2.setType("Self-Help");
    	b2.setPrice(500);
    	
    	Book b3 = new Book();
    	b3.setBname("Rich Dad Poor Dad");
    	b3.setAuthorname("Robert Kiyosaki");
    	b3.setType("Finance");
    	b3.setPrice(600);
    }

}

	