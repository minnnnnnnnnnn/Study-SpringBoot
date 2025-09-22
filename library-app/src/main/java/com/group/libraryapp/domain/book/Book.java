package com.group.libraryapp.domain.book;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Book {

    @Id // primary key와 동일
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment와 동일
    private Long id = null;

    @Column(nullable = false)
    private String name;

    public Book(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
