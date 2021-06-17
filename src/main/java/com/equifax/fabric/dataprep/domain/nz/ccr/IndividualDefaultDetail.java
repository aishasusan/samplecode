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
 * The type Individual default detail.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class IndividualDefaultDetail {

    @JsonProperty("defaultDate")
    private String defaultDate;

    @JsonProperty("consumerDefaulterDetailNumber")
    private String consumerDefaulterDetailNumber;

    @JsonProperty("defaultId")
    private String defaultId;

    @JsonProperty("defaultRecordId")
    private String defaultRecordId;

    @JsonProperty("individualDefaultId")
    private String individualDefaultId;

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
