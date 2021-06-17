
package com.equifax.fabric.dataprep.domain.nz.masterfiles;

import com.equifax.fabric.dataprep.commons.model.nz.geocoder.NZGeocoderResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addressAddDate",
    "addressType",
    "streetNo",
    "streetName",
    "streetType",
    "suburb",
    "city",
    "postcode",
    "addressNo",
    "geocoderResponse"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type Address.
 */
public class Address {
    /**
     * The addressAddDate.
     */
    @JsonProperty("addressAddDate")
    private String addressAddDate;
    /**
     * The addressType.
     */
    @JsonProperty("addressType")
    private String addressType;
    /**
     * The streetNo.
     */
    @JsonProperty("streetNo")
    private String streetNo;
    /**
     * The streetName.
     */
    @JsonProperty("streetName")
    private String streetName;
    /**
     * The streetType.
     */
    @JsonProperty("streetType")
    private String streetType;
    /**
     * The suburb.
     */
    @JsonProperty("suburb")
    private String suburb;
    /**
     * The city.
     */
    @JsonProperty("city")
    private String city;
    /**
     * The postcode.
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * The addressNo.
     */
    @JsonProperty("addressNo")
    private String addressNo;
    /**
     * The geocoderResponse.
     */
    @JsonProperty("geocoderResponse")
    private NZGeocoderResponse geocoderResponse;

}
