package com.equifax.fabric.dataprep.domain.nz.consumer.identity;

import com.equifax.fabric.dataprep.commons.model.nz.geocoder.NZGeocoderResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 *  The type Consumer supplied identity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class NZConsumerSuppliedIdentity {

    @JsonProperty("recordId")
    private String recordId;

    @JsonProperty("systemCode")
    private String systemCode;

    @JsonProperty("orderNo")
    private String orderNo;

    @JsonProperty("title")
    private String title;

    @JsonProperty("primaryLastName")
    private String primaryLastName;

    @JsonProperty("primaryFirstName")
    private String primaryFirstName;

    @JsonProperty("primaryMiddleName")
    private String primaryMiddleName;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("dateOfBirth")
    private String dateOfBirth;

    @JsonProperty("hasAlternateName")
    private String hasAlternateName;

    @JsonProperty("previousLastName")
    private String previousLastName;

    @JsonProperty("previousFirstName")
    private String previousFirstName;

    @JsonProperty("previousLastName2")
    private String previousLastName2;

    @JsonProperty("previousFirstName2")
    private String previousFirstName2;

    @JsonProperty("previousLastName3")
    private String previousLastName3;

    @JsonProperty("previousFirstName3")
    private String previousFirstName3;

    @JsonProperty("hasDrivingLicense")
    private String hasDrivingLicense;

    @JsonProperty("nzDrivingLicenseNo")
    private String nzDrivingLicenseNo;

    @JsonProperty("nzDrivingLicenseVersion")
    private String nzDrivingLicenseVersion;

    @JsonProperty("isDriverLicenseVerified")
    private String isDriverLicenseVerified;

    @JsonProperty("nzDriverLicenseMask")
    private String nzDriverLicenseMask;

    @JsonProperty("neverBeenEmployed")
    private String neverBeenEmployed;

    @JsonProperty("notCurrentlyEmployed")
    private String notCurrentlyEmployed;

    @JsonProperty("currentEmployer")
    private String currentEmployer;

    @JsonProperty("currentOccupation")
    private String currentOccupation;

    @JsonProperty("previousEmployer")
    private String previousEmployer;

    @JsonProperty("previousOccupation")
    private String previousOccupation;

    @JsonProperty("previousCreditProviderFlag")
    private String previousCreditProviderFlag;

    @JsonProperty("lastCreditProvider")
    private String lastCreditProvider;

    @JsonProperty("isAdverse")
    private String isAdverse;

    @JsonProperty("adverseDetailText")
    private String adverseDetailText;

    @JsonProperty("isCompanyDirector")
    private String isCompanyDirector;

    @JsonProperty("companyName")
    private String companyName;

    @JsonProperty("telephoneNumber")
    private String telephoneNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("isLivingAtAddressfor3Years")
    private String isLivingAtAddressfor3Years;

    @JsonProperty("currentStreetNo")
    private String currentStreetNo;

    @JsonProperty("currentStreetName")
    private String currentStreetName;

    @JsonProperty("currentStreetType")
    private String currentStreetType;

    @JsonProperty("currentSuburb")
    private String currentSuburb;

    @JsonProperty("currentCity")
    private String currentCity;

    @JsonProperty("currentCountry")
    private String currentCountry;

    @JsonProperty("previousStreetNo")
    private String previousStreetNo;

    @JsonProperty("previousStreetName")
    private String previousStreetName;

    @JsonProperty("previousStreetType")
    private String previousStreetType;

    @JsonProperty("previousSuburb")
    private String previousSuburb;

    @JsonProperty("previousTown")
    private String previousTown;

    @JsonProperty("previousCountry")
    private String previousCountry;

    @JsonProperty("earlierStreetNo")
    private String earlierStreetNo;

    @JsonProperty("earlierStreetName")
    private String earlierStreetName;

    @JsonProperty("earlierStreetType")
    private String earlierStreetType;

    @JsonProperty("earlierSuburb")
    private String earlierSuburb;

    @JsonProperty("earlierTown")
    private String earlierTown;

    @JsonProperty("earlierCountry")
    private String earlierCountry;

    @JsonProperty("deliveryMethod")
    private String deliveryMethod;

    @JsonProperty("postalStreetNo")
    private String postalStreetNo;

    @JsonProperty("postalStreetName")
    private String postalStreetName;

    @JsonProperty("postalStreetType")
    private String postalStreetType;

    @JsonProperty("postalSuburb")
    private String postalSuburb;

    @JsonProperty("postalTown")
    private String postalTown;

    @JsonProperty("postalCountry")
    private String postalCountry;

    @JsonProperty("ipAddress")
    private String ipAddress;

    @JsonProperty("dpsTransactionCode")
    private String dpsTransactionCode;

    @JsonProperty("savedDpsTransactionCode")
    private String savedDpsTransactionCode;

    @JsonProperty("verificationScore")
    private String verificationScore;

    @JsonProperty("recordVersionNumber")
    private String recordVersionNumber;

    @JsonProperty("recordLockedUser")
    private String recordLockedUser;

    @JsonProperty("newOrderNo")
    private String newOrderNo;

    @JsonProperty("billRenewalOrder")
    private String billRenewalOrder;

    @JsonProperty("emailRenewalOrder")
    private String emailRenewalOrder;

    @JsonProperty("hasConsentForPersonalDetails")
    private String hasConsentForPersonalDetails;

    @JsonProperty("hasConsentForCommunications")
    private String hasConsentForCommunications;

    @JsonProperty("mcfInquiryDetailsRecordCreationUser")
    private String mcfInquiryDetailsRecordCreationUser;

    @JsonProperty("mcfInquiryDetailsRecordCreationDate")
    private String mcfInquiryDetailsRecordCreationDate;

    @JsonProperty("mcfInquiryDetailsRecordCreationTime")
    private String mcfInquiryDetailsRecordCreationTime;

    @JsonProperty("mcfInquiryDetailsRecordCreationProgram")
    private String mcfInquiryDetailsRecordCreationProgram;

    @JsonProperty("mcfInquiryDetailsRecordUpdateUser")
    private String mcfInquiryDetailsRecordUpdateUser;

    @JsonProperty("mcfInquiryDetailsRecordUpdateDate")
    private String mcfInquiryDetailsRecordUpdateDate;

    @JsonProperty("mcfInquiryDetailsRecordUpdateTime")
    private String mcfInquiryDetailsRecordUpdateTime;

    @JsonProperty("mcfInquiryDetailsRecordUpdateProgram")
    private String mcfInquiryDetailsRecordUpdateProgram;

    @JsonProperty("productSystemCode")
    private String productSystemCode;

    @JsonProperty("isActive")
    private String isActive;

    @JsonProperty("clockStopped")
    private String clockStopped;

    @JsonProperty("stoppedCountDownDays")
    private String stoppedCountDownDays;

    @JsonProperty("originalDeadlineDate")
    private String originalDeadlineDate;

    @JsonProperty("originalDeadlineTime")
    private String originalDeadlineTime;

    @JsonProperty("currentDeadlineDate")
    private String currentDeadlineDate;

    @JsonProperty("currentDeadlineTime")
    private String currentDeadlineTime;

    @JsonProperty("businessDaysToGo")
    private String businessDaysToGo;

    @JsonProperty("currentStatusDate")
    private String currentStatusDate;

    @JsonProperty("productPrice")
    private String productPrice;

    @JsonProperty("orderRenewalDate")
    private String orderRenewalDate;

    @JsonProperty("mcfProductInquiryDetailsRecordCreationUser")
    private String mcfProductInquiryDetailsRecordCreationUser;

    @JsonProperty("mcfProductInquiryDetailsRecordCreationDate")
    private String mcfProductInquiryDetailsRecordCreationDate;

    @JsonProperty("mcfProductInquiryDetailsRecordCreationTime")
    private String mcfProductInquiryDetailsRecordCreationTime;

    @JsonProperty("mcfProductInquiryDetailsRecordCreationProgram")
    private String mcfProductInquiryDetailsRecordCreationProgram;

    @JsonProperty("mcfProductInquiryDetailsRecordUpdateUser")
    private String mcfProductInquiryDetailsRecordUpdateUser;

    @JsonProperty("mcfProductInquiryDetailsRecordUpdateDate")
    private String mcfProductInquiryDetailsRecordUpdateDate;

    @JsonProperty("mcfProductInquiryDetailsRecordUpdateTime")
    private String mcfProductInquiryDetailsRecordUpdateTime;

    @JsonProperty("mcfProductInquiryDetailsRecordUpdateProgram")
    private String mcfProductInquiryDetailsRecordUpdateProgram;

    @JsonProperty("verificationResult")
    private String verificationResult;

    @JsonProperty("verificationNumber")
    private String verificationNumber;

    @JsonProperty("resultType")
    private String resultType;

    @JsonProperty("resultValue")
    private String resultValue;

    @JsonProperty("mcfVerificationResultRecordCreationUser")
    private String mcfVerificationResultRecordCreationUser;

    @JsonProperty("mcfVerificationResultRecordCreationDate")
    private String mcfVerificationResultRecordCreationDate;

    @JsonProperty("mcfVerificationResultRecordCreationTime")
    private String mcfVerificationResultRecordCreationTime;

    @JsonProperty("mcfVerificationResultRecordUpdateUser")
    private String mcfVerificationResultRecordUpdateUser;

    @JsonProperty("mcfVerificationResultRecordUpdateDate")
    private String mcfVerificationResultRecordUpdateDate;

    @JsonProperty("mcfVerificationResultRecordUpdateTime")
    private String mcfVerificationResultRecordUpdateTime;

    @JsonProperty("currentAddressGeocoderResponse")
    private NZGeocoderResponse currentAddressGeocoderResponse;

    @JsonProperty("previousAddressGeocoderResponse")
    private NZGeocoderResponse previousAddressGeocoderResponse;

    @JsonProperty("earlierAddressGeocoderResponse")
    private NZGeocoderResponse earlierAddressGeocoderResponse;

    @JsonProperty("postalAddressGeocoderResponse")
    private NZGeocoderResponse postalAddressGeocoderResponse;

    @JsonProperty("mcfProductInquiryDetails")
    private List<MCFNotesDetails> MCFNotesDetails = new ArrayList<MCFNotesDetails>();

    @JsonProperty("bToCProdOrderTasks")
    private List<BToCProdOrderTasks> bToCProdOrderTasks  = new ArrayList<BToCProdOrderTasks>();

}
