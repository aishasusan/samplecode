
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
public class DefaultJudgment {

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
    @JsonProperty("assocCode")
    private String assocCode;
    @JsonProperty("creditorName")
    private String creditorName;
    @JsonProperty("actionAmt")
    private Integer actionAmt;
    @JsonProperty("actionDate")
    private String actionDate;
    @JsonProperty("datePaid")
    private String datePaid;
    @JsonProperty("courtCode")
    private String courtCode;
    @JsonProperty("plaintNoIdNum")
    private String plaintNoIdNum;
    @JsonProperty("plaintNoYear")
    private String plaintNoYear;
    @JsonProperty("plaintNoCourtAbbrev")
    private String plaintNoCourtAbbrev;
    @JsonProperty("djStatus")
    private String djStatus;
    @JsonProperty("coBorrower")
    private String coBorrower;

}
