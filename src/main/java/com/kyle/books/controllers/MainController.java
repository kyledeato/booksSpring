package com.kyle.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kyle.books.models.Book;
import com.kyle.books.services.BookService;

@Controller
public class MainController {
	
	@Autowired
	BookService bookService;

	@RequestMapping("/books/{bookId}")
	public String show(Model model,@PathVariable("bookId") Long bookId) {
		
		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
		
		model.addAttribute("book",book);
		return "show.jsp";
	}
}
