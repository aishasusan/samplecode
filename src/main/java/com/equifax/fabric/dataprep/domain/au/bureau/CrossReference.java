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
public class CrossReference {

    @JsonProperty("seqNo")
    private String seqNo;

    @JsonProperty("xrefFileNo")
    private String xrefFileNo;
}
