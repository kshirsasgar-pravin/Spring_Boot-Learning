package com.tca.service;

import com.tca.entity.Book;

public interface BookService {
    Book saveBook(Book book);
    Book findById(Long bookId);

}
