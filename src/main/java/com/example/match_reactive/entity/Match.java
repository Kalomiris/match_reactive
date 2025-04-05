package com.example.match_reactive.entity;

import com.example.match_reactive.enums.Sport;
import jakarta.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "match")
public class Match {

    public Match() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "match_date", nullable = false)
    private LocalDate matchDate;

    @Column(name = "match_time", nullable = false)
    private LocalTime matchTime;

    @Column(name = "team_a", length = 255, nullable = false)
    private String teamA;

    @Column(name = "team_b", length = 255, nullable = false)
    private String teamB;

    @Enumerated(EnumType.STRING)
    @Column(name = "sport", nullable = false)
    private Sport sport;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MatchOdd> matchOdds = new ArrayList<>();

}