package com.tca.service.Implementation;

import com.tca.entity.Book;
import com.tca.repository.BookRepository;
import com.tca.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
