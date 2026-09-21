package com.tca.service;

import com.tca.entity.Author;

import java.util.List;

public interface AuthorService {
     Author saveAuthor(Author author);
     Author fetchAuthor(Long authorId);
     void deleteAuthorById(Author author);
}
