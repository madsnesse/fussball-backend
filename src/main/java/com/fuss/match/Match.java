package com.fuss.match;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableMatch.class)
@JsonDeserialize(as = ImmutableMatch.class)
public interface Match {
    Long getPlayerIdOne();
    Long getPlayerIdTwo();
    Integer getScoreOne();
    Integer getScoreTwo();
    Long getLeagueId();

}
