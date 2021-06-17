package com.equifax.fabric.dataprep.domain.nz.defaults;

import com.equifax.fabric.dataprep.commons.model.nz.geocoder.NZGeocoderResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type NZDefaults record.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class NZDefaultsRecord {
    @JsonProperty("consumerDefaulterDetailNumber")
    private String consumerDefaulterDetailNumber;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("middleName")
    private String middleName;

    @JsonProperty("firstNameInitial")
    private String firstNameInitial;

    @JsonProperty("middleNameInitial")
    private String middleNameInitial;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("dateOfBirth")
    private String dateOfBirth;

    @JsonProperty("occupation")
    private String occupation;

    @JsonProperty("employer")
    private String employer;

    @JsonProperty("spouseLastName")
    private String spouseLastName;

    @JsonProperty("spouseFirstName")
    private String spouseFirstName;

    @JsonProperty("spouseMiddleName")
    private String spouseMiddleName;

    @JsonProperty("spouseGender")
    private String spouseGender;

    @JsonProperty("spouseDateOfBirth")
    private String spouseDateOfBirth;

    @JsonProperty("jointLiability")
    private String jointLiability;

    @JsonProperty("jointHolderLastName")
    private String jointHolderLastName;

    @JsonProperty("jointHolderFirstName")
    private String jointHolderFirstName;

    @JsonProperty("jointHolderMiddleName")
    private String jointHolderMiddleName;

    @JsonProperty("jointHolderGender")
    private String jointHolderGender;

    @JsonProperty("jointHolderDateOfBirth")
    private String jointHolderDateOfBirth;

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

    @JsonProperty("postCode")
    private String postCode;

    @JsonProperty("previousStreetNo")
    private String previousStreetNo;

    @JsonProperty("previousStreetName")
    private String previousStreetName;

    @JsonProperty("previousStreetType")
    private String previousStreetType;

    @JsonProperty("previousSuburb")
    private String previousSuburb;

    @JsonProperty("previousCity")
    private String previousCity;

    @JsonProperty("previousPostcode")
    private String previousPostcode;

    @JsonProperty("defaultOpenedDate")
    private String defaultOpenedDate;

    @JsonProperty("defaultAmount")
    private String defaultAmount;

    @JsonProperty("defaultActionCode")
    private String defaultActionCode;

    @JsonProperty("defaultStatusDate")
    private String defaultStatusDate;

    @JsonProperty("defaultBalance")
    private String defaultBalance;

    @JsonProperty("defaultText")
    private String defaultText;

    @JsonProperty("clientNumber")
    private String clientNumber;

    @JsonProperty("dataProvidersAccountReference")
    private String dataProvidersAccountReference;

    @JsonProperty("accountType")
    private String accountType;

    @JsonProperty("dateFiled")
    private String dateFiled;

    @JsonProperty("dateLoaded")
    private String dateLoaded;

    @JsonProperty("defaultRefNo")
    private String defaultRefNo;

    @JsonProperty("totalLoanAmount")
    private String totalLoanAmount;

    @JsonProperty("companyDefaultDetailNumber")
    private String companyDefaultDetailNumber;

    @JsonProperty("defaultRelType")
    private String defaultRelType;

    @JsonProperty("deliveryType")
    private String deliveryType;

    @JsonProperty("defaultDate")
    private String defaultDate;

    @JsonProperty("collectionAgent")
    private String collectionAgent;

    @JsonProperty("recordCreationDate")
    private String recordCreationDate;

    @JsonProperty("recordCreationTime")
    private String recordCreationTime;

    @JsonProperty("recordCreationUser")
    private String recordCreationUser;

    @JsonProperty("recordUpdateDate")
    private String recordUpdateDate;

    @JsonProperty("recordUpdateTime")
    private String recordUpdateTime;

    @JsonProperty("recordUpdateUser")
    private String recordUpdateUser;

    @JsonProperty("consumerMasterfileNumber")
    private String consumerMasterfileNumber;

    @JsonProperty("currentAddressGeocoderResponse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NZGeocoderResponse currentAddressGeocoderResponse;

    @JsonProperty("previousAddressGeocoderResponse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private NZGeocoderResponse previousAddressGeocoderResponse;
}
