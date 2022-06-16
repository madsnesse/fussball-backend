package com.fuss.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link RankRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRankRequest.builder()}.
 */
@Generated(from = "RankRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableRankRequest implements RankRequest {
  private final Long playerId;
  private final Long leagueId;

  private ImmutableRankRequest(Long playerId, Long leagueId) {
    this.playerId = playerId;
    this.leagueId = leagueId;
  }

  /**
   * @return The value of the {@code playerId} attribute
   */
  @JsonProperty("playerId")
  @Override
  public Long getPlayerId() {
    return playerId;
  }

  /**
   * @return The value of the {@code leagueId} attribute
   */
  @JsonProperty("leagueId")
  @Override
  public Long getLeagueId() {
    return leagueId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RankRequest#getPlayerId() playerId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for playerId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRankRequest withPlayerId(Long value) {
    Long newValue = Objects.requireNonNull(value, "playerId");
    if (this.playerId.equals(newValue)) return this;
    return new ImmutableRankRequest(newValue, this.leagueId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RankRequest#getLeagueId() leagueId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for leagueId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRankRequest withLeagueId(Long value) {
    Long newValue = Objects.requireNonNull(value, "leagueId");
    if (this.leagueId.equals(newValue)) return this;
    return new ImmutableRankRequest(this.playerId, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRankRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRankRequest
        && equalTo((ImmutableRankRequest) another);
  }

  private boolean equalTo(ImmutableRankRequest another) {
    return playerId.equals(another.playerId)
        && leagueId.equals(another.leagueId);
  }

  /**
   * Computes a hash code from attributes: {@code playerId}, {@code leagueId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + playerId.hashCode();
    h += (h << 5) + leagueId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RankRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RankRequest{"
        + "playerId=" + playerId
        + ", leagueId=" + leagueId
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RankRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RankRequest {
    Long playerId;
    Long leagueId;
    @JsonProperty("playerId")
    public void setPlayerId(Long playerId) {
      this.playerId = playerId;
    }
    @JsonProperty("leagueId")
    public void setLeagueId(Long leagueId) {
      this.leagueId = leagueId;
    }
    @Override
    public Long getPlayerId() { throw new UnsupportedOperationException(); }
    @Override
    public Long getLeagueId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRankRequest fromJson(Json json) {
    ImmutableRankRequest.Builder builder = ImmutableRankRequest.builder();
    if (json.playerId != null) {
      builder.playerId(json.playerId);
    }
    if (json.leagueId != null) {
      builder.leagueId(json.leagueId);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RankRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RankRequest instance
   */
  public static ImmutableRankRequest copyOf(RankRequest instance) {
    if (instance instanceof ImmutableRankRequest) {
      return (ImmutableRankRequest) instance;
    }
    return ImmutableRankRequest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRankRequest ImmutableRankRequest}.
   * <pre>
   * ImmutableRankRequest.builder()
   *    .playerId(Long) // required {@link RankRequest#getPlayerId() playerId}
   *    .leagueId(Long) // required {@link RankRequest#getLeagueId() leagueId}
   *    .build();
   * </pre>
   * @return A new ImmutableRankRequest builder
   */
  public static ImmutableRankRequest.Builder builder() {
    return new ImmutableRankRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRankRequest ImmutableRankRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RankRequest", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_PLAYER_ID = 0x1L;
    private static final long INIT_BIT_LEAGUE_ID = 0x2L;
    private long initBits = 0x3L;

    private Long playerId;
    private Long leagueId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RankRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RankRequest instance) {
      Objects.requireNonNull(instance, "instance");
      playerId(instance.getPlayerId());
      leagueId(instance.getLeagueId());
      return this;
    }

    /**
     * Initializes the value for the {@link RankRequest#getPlayerId() playerId} attribute.
     * @param playerId The value for playerId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("playerId")
    public final Builder playerId(Long playerId) {
      this.playerId = Objects.requireNonNull(playerId, "playerId");
      initBits &= ~INIT_BIT_PLAYER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link RankRequest#getLeagueId() leagueId} attribute.
     * @param leagueId The value for leagueId 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("leagueId")
    public final Builder leagueId(Long leagueId) {
      this.leagueId = Objects.requireNonNull(leagueId, "leagueId");
      initBits &= ~INIT_BIT_LEAGUE_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRankRequest ImmutableRankRequest}.
     * @return An immutable instance of RankRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRankRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRankRequest(playerId, leagueId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PLAYER_ID) != 0) attributes.add("playerId");
      if ((initBits & INIT_BIT_LEAGUE_ID) != 0) attributes.add("leagueId");
      return "Cannot build RankRequest, some of required attributes are not set " + attributes;
    }
  }
}
