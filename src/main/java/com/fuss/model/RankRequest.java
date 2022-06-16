package com.fuss.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRankRequest.class)
@JsonDeserialize(as = ImmutableRankRequest.class)
public interface RankRequest {

    Long getPlayerId();

    Long getLeagueId();


}
