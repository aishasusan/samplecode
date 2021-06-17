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
 * The type Account default.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AccountDefault {

    @JsonProperty("defaultedAccountNo")
    private String defaultedAccountNo;

    @JsonProperty("originalDefaultAmount")
    private String originalDefaultAmount;

    @JsonProperty("defaultDate")
    private String defaultDate;

    @JsonProperty("dueDate")
    private String dueDate;

    @JsonProperty("defaultReason")
    private String defaultReason;

    @JsonProperty("defaultReasonDate")
    private String defaultReasonDate;

    @JsonProperty("defaultStatus")
    private String defaultStatus;

    @JsonProperty("defaultStatusDate")
    private String defaultStatusDate;

    @JsonProperty("remainingAmount")
    private String remainingAmount;

    @JsonProperty("lastPaymentDate")
    private String lastPaymentDate;

    @JsonProperty("defaultId")
    private String defaultId;

    @JsonProperty("batchId")
    private String batchId;

    @JsonProperty("batchRowId")
    private String batchRowId;

    @JsonProperty("batchExtractDate")
    private String batchExtractDate;

    @JsonProperty("batchExtractTime")
    private String batchExtractTime;

    @JsonProperty("batchNotificationEmail")
    private String batchNotificationEmail;

    @JsonProperty("batchProviderReference")
    private String batchProviderReference;

    @JsonProperty("batchVersion")
    private String batchVersion;
}
