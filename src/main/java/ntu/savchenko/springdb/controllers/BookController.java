package ntu.savchenko.springdb.controllers;

import ntu.savchenko.springdb.entities.Book;
import ntu.savchenko.springdb.services.BookService;
import org.hibernate.annotations.Collate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "/books")
    public @ResponseBody List<Book> getAllBooks(){
        return bookService.findAll();
    }
}
