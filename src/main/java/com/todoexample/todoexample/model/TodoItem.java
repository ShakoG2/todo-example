package com.todoexample.todoexample.model;

import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@Table(name = "todoTable")
public class TodoItem {

    public TodoItem(String firstName, String lastName, String email, Long privateNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.privateNumber = privateNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_Name",columnDefinition = "text",nullable = false)
    private  String firstName;

    @Column(name = "last_Name",columnDefinition = "text",nullable = false)
    private String lastName;

    @Column(columnDefinition = "text",updatable = false, nullable = false)
    private String email;

    @Column(columnDefinition = "number",nullable = false, updatable = false)
    private Long privateNumber;

}
