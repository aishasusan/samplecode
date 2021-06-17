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
public class ConsumerDefault {

    @JsonProperty("createDate")
    private String createDate;

    @JsonProperty("createTime")
    private String createTime;

    @JsonProperty("createMbrCode")
    private String createMbrCode;

    @JsonProperty("createOprId")
    private String createOprId;

    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;

    @JsonProperty("lastUpdateTime")
    private String lastUpdateTime;

    @JsonProperty("lastUpdateId")
    private String lastUpdateId;

    @JsonProperty("origSource")
    private String origSource;

    @JsonProperty("defaultStatus")
    private String defaultStatus;

    @JsonProperty("defaultStatusDate")
    private String defaultStatusDate;

    @JsonProperty("lastCorrectionDate")
    private String lastCorrectionDate;

    @JsonProperty("origDefAmt")
    private String origDefAmt;

    @JsonProperty("origActionDate")
    private String origActionDate;

    @JsonProperty("origRsnCode")
    private String origRsnCode;

    @JsonProperty("latestDefAmt")
    private String latestDefAmt;

    @JsonProperty("latestActionDate")
    private String latestActionDate;

    @JsonProperty("latestRsnCode")
    private String latestRsnCode;

    @JsonProperty("typeOfService")
    private String typeOfService;

    @JsonProperty("defaultAccelerated")
    private String defaultAccelerated;
}
