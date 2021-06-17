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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Nzccr record.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class NZCCRRecord {

    @JsonProperty("consumerAccountNo")
    private String consumerAccountNo;

    @JsonProperty("clientNumber")
    private String clientNumber;

    @JsonProperty("accountNo")
    private String accountNo;

    @JsonProperty("accountSubid")
    private String accountSubid;

    @JsonProperty("accountHolderNames")
    private String accountHolderNames;

    @JsonProperty("accountStatus")
    private String accountStatus;

    @JsonProperty("accountStatusDate")
    private String accountStatusDate;

    @JsonProperty("industryCode")
    private String industryCode;

    @JsonProperty("creditPurpose")
    private String creditPurpose;

    @JsonProperty("accountType")
    private String accountType;

    @JsonProperty("numberOfAccountHolders")
    private String numberOfAccountHolders;

    @JsonProperty("accountOpenDate")
    private String accountOpenDate;

    @JsonProperty("accountCloseDate")
    private String accountCloseDate;

    @JsonProperty("paymentType")
    private String paymentType;

    @JsonProperty("creditType")
    private String creditType;

    @JsonProperty("securedCreditType")
    private String securedCreditType;

    @JsonProperty("termOfLoan")
    private String termOfLoan;

    @JsonProperty("paymentFrequency")
    private String paymentFrequency;

    @JsonProperty("maximumCreditAmount")
    private String maximumCreditAmount;

    @JsonProperty("creditLimitDate")
    private String creditLimitDate;

    @JsonProperty("accountCorrectionDate")
    private String accountCorrectionDate;

    @JsonProperty("recordCreationDate")
    private String recordCreationDate;

    @JsonProperty("recordCreationTime")
    private String recordCreationTime;

    @JsonProperty("recordCreationUser")
    private String recordCreationUser;

    @JsonProperty("recordUpdateDate")
    private String recordUpdateDate;

    @JsonProperty("recordUpdateTime")
    private String recordUpdateTime;

    @JsonProperty("recordUpdateUser")
    private String recordUpdateUser;

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

    @JsonProperty("accountRepayments")
    private List<AccountRepayment> accountRepayments;

    @JsonProperty("accountDefaults")
    private List<AccountDefault> accountDefaults;

    @JsonProperty("accountHolderDetails")
    private List<AccountHolderDetails> accountHolderDetails;


}

