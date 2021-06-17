package com.equifax.fabric.dataprep.domain.nz.consumer.identity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * The type MCF Notes Details.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MCFNotesDetails {

    @JsonProperty("productOrderNo")
    private String productOrderNo;

    @JsonProperty("noteID")
    private String noteID;

    @JsonProperty("noteText")
    private String noteText;

    @JsonProperty("mcfNotesRecordCreationUser")
    private String mcfNotesRecordCreationUser;

    @JsonProperty("mcfNotesRecordCreationDate")
    private String mcfNotesRecordCreationDate;

    @JsonProperty("mcfNotesRecordCreationTime")
    private String mcfNotesRecordCreationTime;

    @JsonProperty("mcfNotesRecordCreationProgram")
    private String mcfNotesRecordCreationProgram;

    @JsonProperty("mcfNotesRecordUpdateUser")
    private String mcfNotesRecordUpdateUser;

    @JsonProperty("mcfNotesRecordUpdateDate")
    private String mcfNotesRecordUpdateDate;

    @JsonProperty("mcfNotesRecordUpdateTime")
    private String mcfNotesRecordUpdateTime;

    @JsonProperty("mcfNotesRecordUpdateProgram")
    private String mcfNotesRecordUpdateProgram;

}
