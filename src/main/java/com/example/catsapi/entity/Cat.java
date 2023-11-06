package com.example.catsapi.entity;

import lombok.Data;
import lombok.Getter;
import lombok.experimental.Accessors;
//import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Accessors(chain = true)
public class Cat {
    @Id
    private String id;
    private String name;
    private LocalDate birthDay;
    private LocalDateTime createdAt;

//    public Cat setId(String id) {
//        return this;
//    }
//
//    public Cat setName(String name) {
//        return this;
//    }
//
//    public Cat setBirthDay(LocalDate birthDay) {
//        return this;
//    }
//
//    public Cat setCreatedAt(LocalDateTime createdAt) {
//        return this;
//    }
}
