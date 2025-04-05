package com.example.match_reactive.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record MatchDTO(
        Long id,
        String description,
        LocalDate matchDate,
        LocalTime matchTime,
        String teamA,
        String teamB,
        String sport
) {
}
