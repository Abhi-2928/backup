package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entities.Book;
import com.demo.services.BookService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BookService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Service: "+service);
//		service.saveBook(new Book("java", "zucker", "programming",100L,"introduction to java Development",1));
//		service.saveBook(new Book("python", "david", "programming",200L,"introduction to python",1));
//		service.saveBook(new Book("ruby", "jack", "coding",300L,"introduction to Coding MAkes Less",2));
//		service.saveBook(new Book("selenium", "sweds", "Junit",400L,"introduction to atomation",3));
//		service.saveBook(new Book("sql", "james", "databasee",500L,"introduction to database",1));

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
