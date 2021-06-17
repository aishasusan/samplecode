
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
public class Directorship {

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
    @JsonProperty("compName")
    private String compName;
    @JsonProperty("compType")
    private String compType;
    @JsonProperty("compStatus")
    private String compStatus;
    @JsonProperty("acn")
    private String acn;
    @JsonProperty("appointmentDate")
    private String appointmentDate;
    @JsonProperty("xrefFileNo")
    private Integer xrefFileNo;
    @JsonProperty("abn")
    private String abn;

}
