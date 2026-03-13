package com.immersion.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true)
    private String mail;
    @Column(nullable = false)
    private String password; //TODO hash

    @OneToMany(mappedBy = "user")
    private List<Deck> deckList;
}
