package ntu.savchenko.springdb.services;

import ntu.savchenko.springdb.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
