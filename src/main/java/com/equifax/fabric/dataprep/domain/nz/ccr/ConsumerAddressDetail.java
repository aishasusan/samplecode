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

import com.equifax.fabric.dataprep.commons.model.nz.geocoder.NZGeocoderResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Consumer address detail.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ConsumerAddressDetail {

    @JsonProperty("consumerAddressNo")
    private String consumerAddressNo;

    @JsonProperty("addressType")
    private String addressType;

    @JsonProperty("propertyName")
    private String propertyName;

    @JsonProperty("unitNo")
    private String unitNo;

    @JsonProperty("streetNo")
    private String streetNo;

    @JsonProperty("streetName")
    private String streetName;

    @JsonProperty("streetTitle")
    private String streetTitle;

    @JsonProperty("suburb")
    private String suburb;

    @JsonProperty("town")
    private String town;

    @JsonProperty("postcode")
    private String postcode;

    @JsonProperty("deliveryPointDPID")
    private String deliveryPointDPID;

    @JsonProperty("country")
    private String country;

    @JsonProperty("streetType")
    private String streetType;

    @JsonProperty("efxAddressType")
    private String efxAddressType;

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

    @JsonProperty("geocoderResponse")
    private NZGeocoderResponse geocoderResponse;

}
