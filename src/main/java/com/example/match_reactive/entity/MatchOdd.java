package com.example.match_reactive.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "match_odd")
public class MatchOdd {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @Column(name = "specifier", length = 50, nullable = false)
    private String specifier;

    @Column(name = "odd", nullable = false)
    private Double odd;
}