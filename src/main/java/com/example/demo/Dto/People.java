package com.example.demo.Dto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import javax.persistence.*;


@Table(name="people")
@Entity
@Getter @Setter
@ToString
public class People {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private Long ID;
    @Column
    private String Name;
    @Column
    private String Surname;
    @Column
    private int Age;
    @Column
    private String BirthDay;



}
