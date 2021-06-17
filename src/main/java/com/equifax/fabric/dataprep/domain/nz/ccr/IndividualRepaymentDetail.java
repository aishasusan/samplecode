/*
 * THIS PROGRAM IS CONFIDENTIAL AND PROPRIETARY TO EQUIFAX INC. AND MAY NOT BE REPRODUCED, PUBLISHED OR DISCLOSED TO
 * OTHERS WITHOUT ITS AUTHORIZATION.
 *
 * Copyright © Equifax Inc.
 *
 * All Rights Reserved. EQUIFAX is a trademark or registered trademarks of Equifax Inc. or its affiliates in the U.S.
 * and other  countries. Other names may be trademarks of their respective owners.
 */
package com.equifax.fabric.dataprep.domain.nz.ccr;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Individual repayment detail.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class IndividualRepaymentDetail {

    @JsonProperty("accountPaymentRecordId")
    private String accountPaymentRecordId;

    @JsonProperty("repaymentMonthYear")
    private String repaymentMonthYear;

    @JsonProperty("paymentStatus")
    private String paymentStatus;

    @JsonProperty("recordCreationDate")
    private String recordCreationDate;

    @JsonProperty("recordCreationTime")
    private String recordCreationTime;

    @JsonProperty("recordCreationUser")
    private String recordCreationUser;
}
