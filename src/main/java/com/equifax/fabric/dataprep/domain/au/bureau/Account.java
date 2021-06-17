package com.equifax.fabric.dataprep.domain.au.bureau;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Account {

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

    @JsonProperty("acctNo")
    private String acctNo;

    @JsonProperty("acctSubid")
    private String acctSubid;

    @JsonProperty("mbrCode")
    private String mbrCode;

    @JsonProperty("origSource")
    private String origSource;

    @JsonProperty("prevUpdateDate")
    private String prevUpdateDate;

    @JsonProperty("effectiveDate")
    private String effectiveDate;

    @JsonProperty("lastCorrectionDate")
    private String lastCorrectionDate;

    @JsonProperty("transferFromDate")
    private String transferFromDate;

    @JsonProperty("transferReason")
    private String transferReason;

    @JsonProperty("bchCode")
    private String bchCode;

    @JsonProperty("mbrShortName")
    private String mbrShortName;

    @JsonProperty("origMbr_ShortName")
    private String origMbr_ShortName;

    @JsonProperty("acctType")
    private String acctType;

    @JsonProperty("monitor")
    private String monitor;

    @JsonProperty("acctSuffix")
    private String acctSuffix;

    @JsonProperty("reuseCntr")
    private String reuseCntr;

    @JsonProperty("accountHistory")
    private List<AccountHistory> accountHistory;

    @JsonProperty("consumerDefault")
    private List<ConsumerDefault> consumerDefault;


}
