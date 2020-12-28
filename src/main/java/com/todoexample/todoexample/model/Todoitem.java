package com.todoexample.todoexample.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;


import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
@FieldNameConstants
@Table(name="table")
public class Todoitem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(columnDefinition = "text")
    private  String firstName;

    @Column(columnDefinition = "text")
    private String lastName;



}
