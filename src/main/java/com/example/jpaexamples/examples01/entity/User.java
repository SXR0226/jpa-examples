package com.example.jpaexamples.examples01.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition = "DATETIME NOT NULL "+
            "DEFAULT CURRENT_TIMESTAMP",
            updatable = false,
            insertable = false)
    private LocalDateTime insertTime;
    @OneToMany(mappedBy = "user")
    private List<Address> addressList;
    public User(String name){
        this.name=name;
    }
}
