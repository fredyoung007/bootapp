package com.yntbros.bootapp.book;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yntbros.bootapp.BootappApplication;

import org.springframework.web.bind.annotation.PathVariable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
@RequestMapping("/")
public class BookController {
	private static final Logger log = 
			LoggerFactory.getLogger(BootappApplication.class);
			
	private BookRepository bookRepository;
	
	@Autowired
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	@GetMapping("/hello")
	public String hello (@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
	
	@GetMapping(value="/books")
	public String authorsBooks (Model model) {
		List<Book> bookList = (List<Book>) bookRepository.findAll();
		
		if (bookList != null)
			model.addAttribute("books", bookList);
		
		return "books";
	}
	
	@PostMapping(value="/books")
	public String addBook(Book book) {
		bookRepository.save(book);
	    log.info("-------------------------------");
	    log.info(book.toString());
	    
		return "books";
	}
}
