package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.demo.entities.Author;
import com.demo.services.AuthorService;

@SpringBootApplication
@EnableFeignClients
public class Application implements CommandLineRunner {

	@Autowired
	private AuthorService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Service: "+service);
//		service.save(new Author("salem", "salem@gmail.com", "jisnu",2));
//		service.save(new Author("someshekar", "somy@gmail.com", "samy",1));
//		service.save(new Author("tanu", "tanu@gmail.com", "tanu",1));
//		service.save(new Author("manu", "manu@gmail.com", " ",3));

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
