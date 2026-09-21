package com.tca.controller;

import com.tca.entity.Author;
import com.tca.entity.Book;
import com.tca.repository.BookRepository;
import com.tca.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class MyRunner implements ApplicationRunner  {

   @Autowired
    AuthorService authorService;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Book b1 = new Book();
        b1.setBookId(1L);
        b1.setBookName("Java");

        Book b2 = new Book(2L,"Spring Boot");

        List<Book> books = new ArrayList<>();

        books.add(b1);
        books.add(b2);

//        Author author = new Author(1L,"Prvin Kshirsagar",books);
//
//        if(authorService.saveAuthor(author) != null){
//            System.out.println("Record Added Succefully");
//        }
//        else {
//            System.out.println("Failed to save record");
//        }


        Author author1 = authorService.fetchAuthor(1L);

        System.out.println("Author Id "+author1.getAuthorId());
        System.out.println("Author Name "+author1.getAuthorName());

        System.out.println("---------------------------------------------------");
        List<Book> books1 = author1.getBooks();
        if(books.isEmpty()) System.out.println("This list is empty");

        for(Book book : books){
            System.out.println("Book Id "+book.getBookId());
            System.out.println("Book Name "+book.getBookName());
        }

         authorService.deleteAuthorById(author1);

    }
}
