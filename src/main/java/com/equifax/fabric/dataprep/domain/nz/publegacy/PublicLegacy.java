
package com.equifax.fabric.dataprep.domain.nz.publegacy;

import java.util.ArrayList;
import java.util.List;

import com.equifax.fabric.dataprep.commons.model.nz.geocoder.NZGeocoderResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lastName",
    "firstName",
    "middleName",
    "streetNo",
    "streetName",
    "streetType",
    "suburb",
    "city",
    "postcode",
    "publicNoticeType",
    "noticeStatus",
    "noticeDate",
    "noticeText",
    "dischargeDate",
    "uniquePublicNoticeId",
    "masterfiles"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class PublicLegacy {

    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("streetNo")
    private String streetNo;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetType")
    private String streetType;
    @JsonProperty("suburb")
    private String suburb;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("publicNoticeType")
    private String publicNoticeType;
    @JsonProperty("noticeStatus")
    private String noticeStatus;
    @JsonProperty("noticeDate")
    private String noticeDate;
    @JsonProperty("noticeText")
    private String noticeText;
    @JsonProperty("dischargeDate")
    private String dischargeDate;
    @JsonProperty("uniquePublicNoticeId")
    private String uniquePublicNoticeId;
    @JsonProperty("masterfiles")
    private List<Masterfile> masterfiles = new ArrayList<Masterfile>();
    @JsonProperty("geocoderResponse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NZGeocoderResponse geocoderResponse;

}
