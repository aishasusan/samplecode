
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
public class Bankruptcy {

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
    @JsonProperty("brTypeCode")
    private String brTypeCode;
    @JsonProperty("brText")
    private String brText;
    @JsonProperty("idNum")
    private String idNum;
    @JsonProperty("brYear")
    private String brYear;
    @JsonProperty("brState")
    private String brState;
    @JsonProperty("brStatus")
    private String brStatus;
    @JsonProperty("actionDate")
    private String actionDate;
    @JsonProperty("dischDate")
    private String dischDate;
    @JsonProperty("dischInd")
    private String dischInd;
    @JsonProperty("coBorrower")
    private String coBorrower;

}
