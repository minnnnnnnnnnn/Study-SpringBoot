package com.group.libraryapp.domain.user;

import com.group.libraryapp.domain.user.loanHistory.UserLoanHistory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity // DB와 객체를 매핑
public class User {

    @Id // primary key와 동일
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment와 동일
    private Long id = null;

    @Column(nullable = false, length = 20) // name varchar(20)
    private String name;

    private Integer age;

    @OneToMany(mappedBy = "user")
    private List<UserLoanHistory> userLoanHistories = new ArrayList<>();

    protected User() {} // JPA 사용 시 기본 생성자가 꼭 필요함!

    public User(String name, Integer age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다", name));
        }
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void updateName(String name) {
        this.name = name;
    }
}
