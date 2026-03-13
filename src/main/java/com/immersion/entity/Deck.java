package com.immersion.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.immersion.model.Language;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "decks")
@Getter
@Setter
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore //TODO REMOVE THIS WITH DTO
    private User user;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Language language;

    @OneToMany(mappedBy = "deckId")
    private List<Word> wordList;
}
