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
 * Immutable implementation of {@link RankResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRankResponse.builder()}.
 */
@Generated(from = "RankResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableRankResponse implements RankResponse {
  private final Integer ranking;

  private ImmutableRankResponse(Integer ranking) {
    this.ranking = ranking;
  }

  /**
   * @return The value of the {@code ranking} attribute
   */
  @JsonProperty("ranking")
  @Override
  public Integer getRanking() {
    return ranking;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RankResponse#getRanking() ranking} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ranking
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRankResponse withRanking(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "ranking");
    if (this.ranking.equals(newValue)) return this;
    return new ImmutableRankResponse(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRankResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRankResponse
        && equalTo((ImmutableRankResponse) another);
  }

  private boolean equalTo(ImmutableRankResponse another) {
    return ranking.equals(another.ranking);
  }

  /**
   * Computes a hash code from attributes: {@code ranking}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + ranking.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code RankResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RankResponse{"
        + "ranking=" + ranking
        + "}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RankResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RankResponse {
    Integer ranking;
    @JsonProperty("ranking")
    public void setRanking(Integer ranking) {
      this.ranking = ranking;
    }
    @Override
    public Integer getRanking() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRankResponse fromJson(Json json) {
    ImmutableRankResponse.Builder builder = ImmutableRankResponse.builder();
    if (json.ranking != null) {
      builder.ranking(json.ranking);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RankResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RankResponse instance
   */
  public static ImmutableRankResponse copyOf(RankResponse instance) {
    if (instance instanceof ImmutableRankResponse) {
      return (ImmutableRankResponse) instance;
    }
    return ImmutableRankResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRankResponse ImmutableRankResponse}.
   * <pre>
   * ImmutableRankResponse.builder()
   *    .ranking(Integer) // required {@link RankResponse#getRanking() ranking}
   *    .build();
   * </pre>
   * @return A new ImmutableRankResponse builder
   */
  public static ImmutableRankResponse.Builder builder() {
    return new ImmutableRankResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRankResponse ImmutableRankResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RankResponse", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_RANKING = 0x1L;
    private long initBits = 0x1L;

    private Integer ranking;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RankResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RankResponse instance) {
      Objects.requireNonNull(instance, "instance");
      ranking(instance.getRanking());
      return this;
    }

    /**
     * Initializes the value for the {@link RankResponse#getRanking() ranking} attribute.
     * @param ranking The value for ranking 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ranking")
    public final Builder ranking(Integer ranking) {
      this.ranking = Objects.requireNonNull(ranking, "ranking");
      initBits &= ~INIT_BIT_RANKING;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRankResponse ImmutableRankResponse}.
     * @return An immutable instance of RankResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRankResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRankResponse(ranking);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_RANKING) != 0) attributes.add("ranking");
      return "Cannot build RankResponse, some of required attributes are not set " + attributes;
    }
  }
}
