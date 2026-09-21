package com.tca.service.Implementation;

import com.tca.entity.Author;
import com.tca.repository.AuthorRepository;
import com.tca.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService  {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author fetchAuthor(Long authorId) {
        return authorRepository.findById(authorId).get();
    }

    @Override
    public void deleteAuthorById(Author author) {
        authorRepository.delete(author);
    }
}
