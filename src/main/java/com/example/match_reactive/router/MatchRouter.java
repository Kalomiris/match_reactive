package com.example.match_reactive.router;

import com.example.match_reactive.handler.MatchHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class MatchRouter {

    public RouterFunction<ServerResponse> matchRoutes(MatchHandler matchHandler) {
        return RouterFunctions.route()
                .GET("api/matches", matchHandler::getAllMatches)
                .GET("api/matches/{id}", matchHandler::getMatchById)
                .POST("/api/matches", matchHandler::createMatch)
                .PUT("/api/matches/{id}", matchHandler::updateMatch)
                .DELETE("/api/matches/{id}", matchHandler::deleteMatch)
                .build();
    }
}
