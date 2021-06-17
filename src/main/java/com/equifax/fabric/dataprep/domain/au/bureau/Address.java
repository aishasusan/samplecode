/*
 * THIS PROGRAM IS CONFIDENTIAL AND PROPRIETARY TO EQUIFAX INC. AND MAY NOT BE REPRODUCED, PUBLISHED OR DISCLOSED TO OTHERS WITHOUT ITS AUTHORIZATION.
 *
 * Copyright © Equifax Inc.
 *
 * All Rights Reserved. EQUIFAX is a trademark or registered trademarks of Equifax Inc. or its affiliates in the U.S. and other  countries. Other names may be trademarks of their respective owners.
 */
package com.equifax.fabric.dataprep.domain.au.bureau;

import com.equifax.fabric.dataprep.commons.model.au.geocoder.AUGeocodedData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.*;

/**
 * The type Address.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Address {

    @JsonProperty("seqNo")
    String seqNo;

    @JsonProperty("queryTypeMultSupplier")
    String queryTypeMultSupplier;

    @JsonProperty("queryTypeNonCr")
    String queryTypeNonCr;

    @JsonProperty("adDpid")
    String adDpid;

    @JsonProperty("unitNo")
    String unitNo;

    @JsonProperty("streetNo")
    String streetNo;

    @JsonProperty("streetName")
    String streetName;

    @JsonProperty("citySuburb")
    String citySuburb;

    @JsonProperty("stateCode")
    String stateCode;

    @JsonProperty("postCode")
    String postCode;

    @JsonProperty("propertyName")
    String propertyName;

    @JsonProperty("frdAdCons")
    String frdAdCons;

    @JsonProperty("lrdAdCons")
    String lrdAdCons;

    @JsonProperty("streetType")
    String streetType;

    @JsonProperty("createMbrCodes")
    String createMbrCode;

    @JsonProperty("createOprCode")
    String createOprCode;

    @JsonProperty("geocoderResponse")
    private AUGeocodedData geocoderResponse;
}
