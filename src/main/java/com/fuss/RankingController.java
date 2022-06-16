package com.fuss;

import com.fuss.exception.LeagueNotFoundException;
import com.fuss.exception.PlayerNotFoundException;
import com.fuss.league.League;
import com.fuss.league.LeagueRepository;
import com.fuss.model.ImmutableRankResponse;
import com.fuss.model.RankRequest;
import com.fuss.model.RankResponse;
import com.fuss.player.Player;
import com.fuss.player.PlayerRepository;
import com.fuss.ranking.Rank;
import com.fuss.ranking.RankRepository;
import com.fuss.service.FussballService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.trace.http.HttpTrace;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RankingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RankingController.class);
    private final FussballService fussballService;


    public RankingController(FussballService fussballService) {
        this.fussballService = fussballService;
    }

    @PostMapping("/ranking")
    @ResponseBody
    RankResponse getRank(@RequestBody RankRequest rankRequest){
        LOGGER.info("Got a request: " + rankRequest);

        Integer ranking = fussballService.getRanking(rankRequest.getPlayerId(),
                rankRequest.getLeagueId());

        return ImmutableRankResponse.builder()
                .ranking(ranking)
                .build();
    }


}
