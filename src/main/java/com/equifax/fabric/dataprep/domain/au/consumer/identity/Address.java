package com.equifax.fabric.dataprep.domain.au.consumer.identity;

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

    /**
     * The Seq no.
     */
    @JsonProperty("seqNo")
    private Integer seqNo;

    /**
     * The Last update date.
     */
    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;

    /**
     * The Create date.
     */
    @JsonProperty("createDate")
    private String createDate;

    /**
     * The Create mbr code.
     */
    @JsonProperty("createMbrCode")
    private String createMbrCode;

    /**
     * The Create opr id.
     */
    @JsonProperty("createOprId")
    private String createOprId;

    /**
     * The Ad dpid.
     */
    @JsonProperty("adDpid")
    private String adDpid;

    /**
     * The Unit no.
     */
    @JsonProperty("unitNo")
    private String unitNo;

    /**
     * The Street no.
     */
    @JsonProperty("streetNo")
    private String streetNo;

    /**
     * The Street name.
     */
    @JsonProperty("streetName")
    private String streetName;

    /**
     * The Street type.
     */
    @JsonProperty("streetType")
    private String streetType;

    /**
     * The City suburb.
     */
    @JsonProperty("citySuburb")
    private String citySuburb;

    /**
     * The State code.
     */
    @JsonProperty("stateCode")
    private String stateCode;

    /**
     * The Post code.
     */
    @JsonProperty("postCode")
    private String postCode;

    /**
     * The Property name.
     */
    @JsonProperty("propertyName")
    private String propertyName;

    /**
     * The Geocoder response.
     */
    @JsonProperty("geocoderResponse")
    private AUGeocodedData geocoderResponse;
}
