package com.yntbros.bootapp.book;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
	List<Book> findByAuthor(String author);
}
