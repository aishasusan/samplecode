
package com.equifax.fabric.dataprep.domain.nz.masterfiles;

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
    "driverLicenceRecordId",
    "nzDrivingLicenceNo",
    "nzDrivingLicenceVersion",
    "nzDrivingLicenceReceiveDate",
    "nzDrivingLicenceInfoSource",
    "driverLicenceSourceRecordId"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type DriversLicence
 */
public class DriversLicence {

    /**
     * The driverLicenceRecordId
     */
    @JsonProperty("driverLicenceRecordId")
    private String driverLicenceRecordId;
    /**
     * The nzDrivingLicenceNo
     */
    @JsonProperty("nzDrivingLicenceNo")
    private String nzDrivingLicenceNo;
    /**
     * The nzDrivingLicenceVersion
     */
    @JsonProperty("nzDrivingLicenceVersion")
    private String nzDrivingLicenceVersion;
    /**
     * The nzDrivingLicenceReceive Date
     */
    @JsonProperty("nzDrivingLicenceReceiveDate")
    private String nzDrivingLicenceReceiveDate;
    /**
     * The nzDrivingLicenceInfoSource
     */
    @JsonProperty("nzDrivingLicenceInfoSource")
    private String nzDrivingLicenceInfoSource;
    /**
     * The driverLicenceSourceRecordId
     */
    @JsonProperty("driverLicenceSourceRecordId")
    private String driverLicenceSourceRecordId;

}
