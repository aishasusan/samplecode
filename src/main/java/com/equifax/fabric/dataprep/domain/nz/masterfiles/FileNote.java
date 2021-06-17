
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
    "noteType",
    "noteDate",
    "noteText",
    "fileNoteIdentifier",
    "crossRefFileNo"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type FileNote
 */
public class FileNote {

    /**
     * The noteType
     */
    @JsonProperty("noteType")
    private String noteType;
    /**
     * The noteDate
     */
    @JsonProperty("noteDate")
    private String noteDate;
    /**
     * The noteText
     */
    @JsonProperty("noteText")
    private String noteText;
    /**
     * The fileNoteIdentifier
     */
    @JsonProperty("fileNoteIdentifier")
    private String fileNoteIdentifier;
    /**
     * The crossRefFileNo
     */
    @JsonProperty("crossRefFileNo")
    private String crossRefFileNo;

}
