package com.immersion.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "words")
@Getter
@Setter
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String front;
    @Column(nullable = false)
    private String back;
    @ManyToOne
    @JoinColumn(name = "deck_id")
    @JsonIgnore //TODO REMOVE THIS WITH DTO
    private Deck deckId;
}
