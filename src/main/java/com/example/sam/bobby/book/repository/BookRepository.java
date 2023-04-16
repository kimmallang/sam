package com.example.sam.bobby.book.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.sam.bobby.book.dto.Book;

@Component
public class BookRepository {
	private final List<Book> books = new ArrayList<>();;

	public void insert(String title, int price) {
		long id = getLastId() + 1;
		books.add(new Book(id, title, price));
	}

	public void delete(long id) {
		Book book = selectOne(id);
		if (book == null) {
			return;
		}

		books.remove(book);
	}

	public Book selectOne(long id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}

	public List<Book> selectListAll() {
		return books;
	}

	private long getLastId() {
		if (books.size() == 0) {
			return 0;
		}
		return books.get(books.size() - 1).getId();
	}
}
