package com.example.match_reactive.handler;

import com.example.match_reactive.dto.MatchDTO;
import com.example.match_reactive.service.MatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class MatchHandler {

    public final MatchService matchService;

    public Mono<ServerResponse> getAllMatches(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(matchService.getAllMatches(), MatchDTO.class);
    }

    public Mono<ServerResponse> getMatchById(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> createMatch(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> updateMatch(ServerRequest serverRequest) {
    }

    public Mono<ServerResponse> deleteMatch(ServerRequest serverRequest) {
    }
}
