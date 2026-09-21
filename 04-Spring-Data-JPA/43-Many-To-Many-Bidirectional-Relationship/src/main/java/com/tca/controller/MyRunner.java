package com.tca.controller;

import com.tca.entity.Author;
import com.tca.entity.Book;
import com.tca.repository.BookRepository;
import com.tca.service.AuthorService;
import com.tca.service.Implementation.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    AuthorService authorService;
    @Autowired
    private BookServiceImpl bookService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        // ---------------- BOOKS ----------------

        Book b1 = new Book();
        b1.setBookId(1L);
        b1.setBookName("Java");

        Book b2 = new Book();
        b2.setBookId(2L);
        b2.setBookName("Spring Boot");


        // ---------------- AUTHORS ----------------

        Author a1 = new Author();
        a1.setAuthorId(1L);
        a1.setAuthorName("Pravin Kshirsagar");

        Author a2 = new Author();
        a2.setAuthorId(2L);
        a2.setAuthorName("ABC");


        // ---------------- AUTHOR → BOOK ----------------

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);

        a1.setBooks(books);
        a2.setBooks(books);


        // ---------------- BOOK → AUTHOR ----------------

        List<Author> authors = new ArrayList<>();
        authors.add(a1);
        authors.add(a2);

        b1.setAuthors(authors);
        b2.setAuthors(authors);


        // ---------------- SAVE ----------------

        authorService.saveAuthor(a1);
        authorService.saveAuthor(a2);


        System.out.println("Records saved successfully");


        // ---------------- FETCH AUTHOR ----------------

        Author author = authorService.fetchAuthor(1L);

        System.out.println("\nAuthor ID: " + author.getAuthorId());
        System.out.println("Author Name: " + author.getAuthorName());

        System.out.println("Books:");

        for (Book book : author.getBooks()) {
            System.out.println(
                    book.getBookId() + " - " + book.getBookName()
            );
        }


        // ---------------- FETCH BOOK ----------------

        Book book = bookService.findById(1L);

        System.out.println("\nBook ID: " + book.getBookId());
        System.out.println("Book Name: " + book.getBookName());

        System.out.println("Authors:");

        for (Author author1 : book.getAuthors()) {
            System.out.println(
                    author1.getAuthorId() + " - " + author1.getAuthorName()
            );
        }
    }
}
