package com.equifax.fabric.dataprep.domain.au.bureau;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class AccountLink {

    @JsonProperty("activeFromDate")
    private String activeFromDate;

    @JsonProperty("activeToDate")
    private String activeToDate;

    @JsonProperty("relationshipCode")
    private String relationshipCode;

    @JsonProperty("defaultStartDate")
    private String defaultStartDate;

    @JsonProperty("defaultCeaseDate")
    private String defaultCeaseDate;

    @JsonProperty("sciDate")
    private String sciDate;

    @JsonProperty("sciIndicatorIndicator")
    private String sciIndicatorIndicator;
}
