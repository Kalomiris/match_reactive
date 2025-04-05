package com.example.match_reactive.service;

import com.example.match_reactive.dto.MatchDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class MatchService {
    public Flux<MatchDTO> getAllMatches() {
    }
}
