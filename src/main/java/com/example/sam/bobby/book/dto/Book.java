package com.example.sam.bobby.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Book {
	private long id;
	@Setter
	private String title;
	@Setter
	private int price;
}
