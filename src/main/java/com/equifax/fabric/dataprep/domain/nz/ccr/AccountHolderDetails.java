/*
 * THIS PROGRAM IS CONFIDENTIAL AND PROPRIETARY TO EQUIFAX INC. AND MAY NOT BE REPRODUCED, PUBLISHED OR DISCLOSED TO OTHERS WITHOUT ITS AUTHORIZATION.
 *
 * Copyright © Equifax Inc.
 *
 * All Rights Reserved. EQUIFAX is a trademark or registered trademarks of Equifax Inc. or its affiliates in the U.S. and other  countries. Other names may be trademarks of their respective owners.
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
 * The type Nzccr.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AccountHolderDetails {

    @JsonProperty("consumerNo")
    private String consumerNo;

    @JsonProperty("dataProvidersCustomerRefId")
    private String dataProvidersCustomerRefId;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("title")
    private String title;

    @JsonProperty("dateOfBirth")
    private String dateOfBirth;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("deceasedFlag")
    private String deceasedFlag;

    @JsonProperty("nzDrivingLicenseNo")
    private String nzDrivingLicenseNo;

    @JsonProperty("nzDrivingLicenseVersion")
    private String nzDrivingLicenseVersion;

    @JsonProperty("consumerAccountHolderNo")
    private String consumerAccountHolderNo;

    @JsonProperty("hRelationshipType")
    private String hRelationshipType;

    @JsonProperty("relationshipStartDate")
    private String relationshipStartDate;

    @JsonProperty("relationshipEndDate")
    private String relationshipEndDate;

    @JsonProperty("holderBatchId")
    private String holderBatchId;

    @JsonProperty("holderBatchRowId")
    private String holderBatchRowId;

    @JsonProperty("holderBatchExtractDate")
    private String holderBatchExtractDate;

    @JsonProperty("holderBatchExtractTime")
    private String holderBatchExtractTime;

    @JsonProperty("holderBatchNotificationEmail")
    private String holderBatchNotificationEmail;

    @JsonProperty("holderBatchProviderReference")
    private String holderBatchProviderReference;

    @JsonProperty("holderBatchVersion")
    private String holderBatchVersion;

    @JsonProperty("individualConsumerAccountId")
    private String individualConsumerAccountId;

    @JsonProperty("clientName")
    private String clientName;

    @JsonProperty("individualAccountHoldersName")
    private String individualAccountHoldersName;

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("accountOpenDate")
    private String accountOpenDate;

    @JsonProperty("accountCloseDate")
    private String accountCloseDate;

    @JsonProperty("maximumCreditAmount")
    private String maximumCreditAmount;

    @JsonProperty("accountStatus")
    private String accountStatus;

    @JsonProperty("paymentFrequency")
    private String paymentFrequency;

    @JsonProperty("accountType")
    private String accountType;

    @JsonProperty("industryCode")
    private String industryCode;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("lastCreditLimitIncreaseDate")
    private String lastCreditLimitIncreaseDate;

    @JsonProperty("doNotDisplayAccountFlag")
    private String doNotDisplayAccountFlag;

    @JsonProperty("recordUpdateDate")
    private String recordUpdateDate;

    @JsonProperty("securedCreditType")
    private String securedCreditType;

    @JsonProperty("individualRepaymentDetails")
    private List<IndividualRepaymentDetail> individualRepaymentDetails;

    @JsonProperty("individualDefaultDetails")
    private List<IndividualDefaultDetail> individualDefaultDetails;

    @JsonProperty("consumerAlternateNames")
    private List<ConsumerAlternateName> consumerAlternateNames;

    @JsonProperty("consumerAddressDetails")
    private List<ConsumerAddressDetail> consumerAddressDetails;

    @JsonProperty("consumerEmploymentDetails")
    private List<ConsumerEmploymentDetail> consumerEmploymentDetails;
}


