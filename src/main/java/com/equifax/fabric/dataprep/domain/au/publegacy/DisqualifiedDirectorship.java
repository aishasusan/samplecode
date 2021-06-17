
package com.equifax.fabric.dataprep.domain.au.publegacy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class DisqualifiedDirectorship {

    @JsonProperty("seqNo")
    private Integer seqNo;
    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("createMbrCode")
    private String createMbrCode;
    @JsonProperty("createOprId")
    private String createOprId;
    @JsonProperty("dateDisqualified")
    private String dateDisqualified;
    @JsonProperty("disqualifiedUntil")
    private String disqualifiedUntil;
    @JsonProperty("asicAddDate")
    private String asicAddDate;
    @JsonProperty("asicAddTime")
    private String asicAddTime;

}
