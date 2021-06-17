package com.equifax.fabric.dataprep.domain.au.consumer.identity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Cross reference.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CrossReference {

    /**
     * The Seq no.
     */
    @JsonProperty("seqNo")
    private Integer seqNo;
    /**
     * The Xref file no.
     */
    @JsonProperty("xrefFileNo")
    private Integer xrefFileNo;

}
