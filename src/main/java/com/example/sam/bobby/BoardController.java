package com.example.sam.bobby;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@GetMapping("/board")
	public String getBoardList() {
		return "abc";
	}
}
