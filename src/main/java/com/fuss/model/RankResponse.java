package com.fuss.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableRankResponse.class)
@JsonDeserialize(as = ImmutableRankResponse.class)
public interface RankResponse {

    Integer getRanking();

}
