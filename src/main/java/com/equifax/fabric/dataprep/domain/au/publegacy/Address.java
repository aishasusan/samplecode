
package com.equifax.fabric.dataprep.domain.au.publegacy;

import com.equifax.fabric.dataprep.commons.model.au.geocoder.AUGeocodedData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    private Integer seqNo;
    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("queryTypeRq")
    private Boolean queryTypeRq;
    @JsonProperty("queryTypeCq")
    private Boolean queryTypeCq;
    @JsonProperty("queryTypeCrCons")
    private Boolean queryTypeCrCons;
    @JsonProperty("queryTypeCrComm")
    private Boolean queryTypeCrComm;
    @JsonProperty("queryTypeMultSupplier")
    private Boolean queryTypeMultSupplier;
    @JsonProperty("queryTypeNonCr")
    private Boolean queryTypeNonCr;
    @JsonProperty("adDpid")
    private String adDpid;
    @JsonProperty("unitNo")
    private String unitNo;
    @JsonProperty("streetNo")
    private String streetNo;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetType")
    private String streetType;
    @JsonProperty("citySuburb")
    private String citySuburb;
    @JsonProperty("stateCode")
    private String stateCode;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("propertyName")
    private String propertyName;
    @JsonProperty("frdAdPubl")
    private String frdAdPubl;


    @JsonProperty("lrdAdPubl")
    private String lrdAdPubl;


    /**
     * The Geocoder response.
     */
    @JsonProperty("geocoderResponse")
    private AUGeocodedData geocoderResponse;
}
