package com.example.match_reactive.repository;

import com.example.match_reactive.entity.MatchOdd;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MatchOddRepository extends ReactiveCrudRepository<MatchOdd, Long> {
}