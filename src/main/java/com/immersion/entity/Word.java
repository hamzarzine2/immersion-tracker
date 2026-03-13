package com.immersion.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "words")
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
    private Deck deckId;
}
