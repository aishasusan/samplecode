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
public class Bans {

    @JsonProperty("seqNo")
    private String seqNo;

    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;

    @JsonProperty("createDate")
    private String createDate;

    @JsonProperty("createMbrCode")
    private String createMbrCode;

    @JsonProperty("createOprCode")
    private String createOprCode;

    @JsonProperty("banLevel")
    private String banLevel;

    @JsonProperty("banAplDate")
    private String banAplDate;

    @JsonProperty("banEndDate")
    private String banEndDate;

    @JsonProperty("banStatus")
    private String banStatus;

    @JsonProperty("banStatusDate")
    private String banStatusDate;

    @JsonProperty("banNoteSentDate")
    private String banNoteSentDate;

    @JsonProperty("banInitExtd")
    private String banInitExtd;

    @JsonProperty("subscriberCode")
    private String subscriberCode;

    @JsonProperty("branchCode")
    private String branchCode;

}
