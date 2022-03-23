package com.yntbros.bootapp.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.yntbros.bootapp.domain.*;

@Entity
public class Book extends NamedEntity {
	private String isbn;
	private String author;
	private String description;

	protected Book() {}
	
	public Book(String name, String author, String desc) {
		super.setName(name);
		this.author = author;
		this.description = desc;
	}

	@Override
	public String toString() {
		return String.format(
	        "Book[id=%d, name='%s', author='%s', description='%s']",
	        super.getId(), super.getName(), author, description);
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
