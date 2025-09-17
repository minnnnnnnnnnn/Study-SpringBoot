package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// jpaRepository를 상속받으면 자동으로 Bean으로 등록됨
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name); // Spring data jpa가 알아서 메서드를 만들어줌

}
