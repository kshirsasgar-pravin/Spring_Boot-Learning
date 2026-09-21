package com.tca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {

    @Id
    private Long bookId;

    private String bookName;

    @ManyToMany(cascade = {
                             CascadeType.DETACH,
                             CascadeType.MERGE,
                             CascadeType.PERSIST,
                             CascadeType.PERSIST},
                fetch =  FetchType.LAZY,
                mappedBy = "books"
            )
    List<Author> authors;


}
