package com.todoexample.todoexample.model;

import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
public class Todoitem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(columnDefinition = "text")
    private  String firstName;

    @Column(columnDefinition = "text")
    private String lastName;

}
