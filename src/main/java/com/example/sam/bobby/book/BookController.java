package com.example.sam.bobby.book;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sam.bobby.book.dto.Book;
import com.example.sam.bobby.book.service.BookService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BookController {
	private final BookService bookService;

	// get localhost:8080/book -> 책 목록 조회
	@GetMapping("/book")
	public List<Book> searchBookAll() {
		return bookService.searchBookAll();
	}

	// get localhost:8080/book/{id} -> 책 단건 조회
	@GetMapping("/book/{id}")
	public Book search(@PathVariable Long id) {
		return bookService.searchBook(id);
	}

	// post localhost:8080/book -> 책 단건 저장
	// request body -> json {id: 1, title: 제목, price: 100}
	@PostMapping("/book")
	public void save(Book book) {
		bookService.saveBook(book);
	}

	// post localhost:8080/book -> 책 단건 저장
	@DeleteMapping("/book/{id}")
	public void delete(@PathVariable Long id) {
		bookService.removeBook(id);
	}
}
