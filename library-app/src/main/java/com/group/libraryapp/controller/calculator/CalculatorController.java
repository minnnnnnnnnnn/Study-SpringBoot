package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // API가 해당 메소드를 사용할 수 있게 함
public class CalculatorController {

    @GetMapping("/add") // GET 메소드 (덧셈)
    public int addToNumbers(CalculatorAddRequest request) { // 객체
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply") // Post 메소드
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) { // 객체
        return request.getNumber1() * request.getNumber2();
    }

}
