package com.equifax.fabric.dataprep.domain.au.consumer.identity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Consumer supplied identity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ConsumerSuppliedIdentity {

    /**
     * The File no.
     */
    @JsonProperty("fileNo")
    private Integer fileNo;

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
     * The Surname.
     */
    @JsonProperty("surname")
    private String surname;

    /**
     * The Frstname.
     */
    @JsonProperty("frstname")
    private String frstname;

    /**
     * The Name last suppled.
     */
    @JsonProperty("nameLastSuppled")
    private String nameLastSuppled;

    /**
     * The Sex code.
     */
    @JsonProperty("sexCode")
    private String sexCode;

    /**
     * The Dob create date.
     */
    @JsonProperty("dobCreateDate")
    private String dobCreateDate;

    /**
     * The Dob lrd.
     */
    @JsonProperty("dobLrd")
    private String dobLrd;

    /**
     * The Mddname.
     */
    @JsonProperty("mddname")
    private String mddname;

    /**
     * The Birth date.
     */
    @JsonProperty("birthDate")
    private String birthDate;

    /**
     * The Drv lic no.
     */
    @JsonProperty("drvLicNo")
    private String drvLicNo;

    /**
     * The Drv lrd.
     */
    @JsonProperty("drvLrd")
    private String drvLrd;

    /**
     * The Drv create date.
     */
    @JsonProperty("drvCreateDate")
    private String drvCreateDate;

    /**
     * The Addresses.
     */
    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();

    /**
     * The Employments.
     */
    @JsonProperty("employments")
    private List<Employment> employments = new ArrayList<Employment>();

    /**
     * The Cross references.
     */
    @JsonProperty("crossReferences")
    private List<CrossReference> crossReferences = new ArrayList<CrossReference>();

}


