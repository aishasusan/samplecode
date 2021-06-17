/*
 * THIS PROGRAM IS CONFIDENTIAL AND PROPRIETARY TO EQUIFAX INC. AND MAY NOT BE REPRODUCED, PUBLISHED OR DISCLOSED TO OTHERS WITHOUT ITS AUTHORIZATION.
 *
 * Copyright © Equifax Inc.
 *
 * All Rights Reserved. EQUIFAX is a trademark or registered trademarks of Equifax Inc. or its affiliates in the U.S. and other  countries. Other names may be trademarks of their respective owners.
 */
package com.equifax.fabric.dataprep.domain.au.bureau;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


/**
 * The type Consumer enquiry.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class ConsumerEnquiry {


    @JsonProperty("seqNo")
    private String seqNo;

    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;

    @JsonProperty("createDate")
    private String createDate;

    @JsonProperty("createMbrCode")
    private String createMbrCode;

    @JsonProperty("assocCode")
    private String assocCode;

    @JsonProperty("acctType")
    private String acctType;

    @JsonProperty("actionDate")
    private String actionDate;

    @JsonProperty("enqyAmt")
    private String enqyAmt;

    @JsonProperty("refNo")
    private String refNo;

    @JsonProperty("memberShortName")
    private String memberShortName;

    @JsonProperty("typeOfService")
    private String typeOfService;

    @JsonProperty("scorecardType")
    private String scorecardType;
}
