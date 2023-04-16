package com.example.sam.bobby.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.sam.bobby.book.dto.Book;
import com.example.sam.bobby.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookService {
	private final BookRepository bookRepository;

	public void saveBook(Book book) {
		bookRepository.insert(book.getTitle(), book.getPrice());
	}

	public void removeBook(long id) {
		bookRepository.delete(id);
	}

	public Book searchBook(long id) {
		return bookRepository.selectOne(id);
	}

	public List<Book> searchBookAll() {
		return bookRepository.selectListAll();
	}
}
