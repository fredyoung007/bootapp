package com.yntbros.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yntbros.bootapp.book.*;

@SpringBootApplication
public class BootappApplication {
	
	private static final Logger log = 
			LoggerFactory.getLogger(BootappApplication.class);
			

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}
	
	 @Bean
	  public CommandLineRunner demo(BookRepository repository) {
	    return (args) -> {
	      // save a few customers
	      repository.save(new Book("Book1", "Nan", "Book 1"));
	      repository.save(new Book("Book2", "Nan", "Book 2"));
	      
	      // fetch all books
	      log.info("Books found with findAll():");
	      log.info("-------------------------------");
	      for (Book book : repository.findAll()) {
	        log.info(book.toString());
	      }
	      log.info("End");
	    };
	  }
}
