package com.tca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author {

    @Id
    private Long authorId;

    private String authorName;

    @ManyToMany(cascade = {CascadeType.DETACH,
                          CascadeType.MERGE,
                          CascadeType.PERSIST,
                          CascadeType.REFRESH},
                fetch = FetchType.LAZY)
    @JoinTable(
                name = "BOOK_AUTHOR",
                joinColumns = @JoinColumn(name = "BOOK_ID"),
                inverseJoinColumns = @JoinColumn(name="AUTHOR_ID")
    )
    private List<Book> books;

}
