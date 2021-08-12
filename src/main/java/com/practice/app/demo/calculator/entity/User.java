package com.practice.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "users")
@Data @AllArgsConstructor @NoArgsConstructor
public class User{
    private @Id long userId;
    private String username;
    private String name;
    private String password;
    private String email;
    private Date regDate;
}