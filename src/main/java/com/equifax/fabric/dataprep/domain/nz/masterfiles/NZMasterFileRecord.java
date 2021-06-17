
package com.equifax.fabric.dataprep.domain.nz.masterfiles;

import java.util.ArrayList;
import java.util.List;
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
    "consumerMasterfileNo",
    "dateOfBirth",
    "lastName",
    "firstName",
    "middleName",
    "gender",
    "maritalStatus",
    "fileType",
    "crossRefFileNo",
    "multiBirthDateOfBirth",
    "multiBirthGender",
    "addresses",
    "alternateNames",
    "occupancies",
    "driversLicences",
    "crossReferences",
    "merges",
    "narrations",
    "fileNotes"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type NZMasterFileRecord
 */
public class NZMasterFileRecord {

    /**
     * The consumerMasterfileNo
     */
    @JsonProperty("consumerMasterfileNo")
    private String consumerMasterfileNo;
    /**
     * The dateOfBirth
     */
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    /**
     * The lastName
     */
    @JsonProperty("lastName")
    private String lastName;
    /**
     * The firstName
     */
    @JsonProperty("firstName")
    private String firstName;
    /**
     * The middleName
     */
    @JsonProperty("middleName")
    private String middleName;
    /**
     * The gender
     */
    @JsonProperty("gender")
    private String gender;
    /**
     * The maritalStatus
     */
    @JsonProperty("maritalStatus")
    private String maritalStatus;
    /**
     * The file type
     */
    @JsonProperty("fileType")
    private String fileType;
    /**
     * The crossRefFileNo
     */
    @JsonProperty("crossRefFileNo")
    private String crossRefFileNo;
    /**
     * The multiBirthDateOfBirth
     */
    @JsonProperty("multiBirthDateOfBirth")
    private String multiBirthDateOfBirth;
    /**
     * The multiBirthGender
     */
    @JsonProperty("multiBirthGender")
    private String multiBirthGender;
    /**
     * The addresses
     */
    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * The alternateNames
     */
    @JsonProperty("alternateNames")
    private List<AlternateName> alternateNames = new ArrayList<AlternateName>();
    /**
     * The occupancies
     */
    @JsonProperty("occupancies")
    private List<Occupancy> occupancies = new ArrayList<Occupancy>();
    /**
     * The driver's licences
     */
    @JsonProperty("driversLicences")
    private List<DriversLicence> driversLicences = new ArrayList<DriversLicence>();
    /**
     * The crossReferences
     */
    @JsonProperty("crossReferences")
    private List<CrossReference> crossReferences = new ArrayList<CrossReference>();
    /**
     * The merges
     */
    @JsonProperty("merges")
    private List<Merge> merges = new ArrayList<Merge>();
    /**
     * The narrations
     */
    @JsonProperty("narrations")
    private List<Narration> narrations = new ArrayList<Narration>();
    /**
     * The fileNotes
     */
    @JsonProperty("fileNotes")
    private List<FileNote> fileNotes = new ArrayList<FileNote>();

}
