package com.group.libraryapp.dto.user.request;

import lombok.Getter;

@Getter
public class UserCreateRequest {

    private String name;
    private Integer age; // int: null 불가 , Integer: null 가능

}
