package com.example.match_reactive.repository;

import com.example.match_reactive.entity.Match;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MatchRepository extends ReactiveCrudRepository<Match, Long> {
}