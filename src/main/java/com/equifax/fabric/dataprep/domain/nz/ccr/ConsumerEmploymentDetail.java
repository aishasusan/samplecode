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
 * The type Consumer employment detail.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ConsumerEmploymentDetail {

    @JsonProperty("uniqueConsumerOccupationId")
    private String uniqueConsumerOccupationId;

    @JsonProperty("employer")
    private String employer;

    @JsonProperty("previousEmployer")
    private String previousEmployer;

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("recordCreationDate")
    private String recordCreationDate;

    @JsonProperty("recordCreationTime")
    private String recordCreationTime;

    @JsonProperty("recordCreationUser")
    private String recordCreationUser;

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
}