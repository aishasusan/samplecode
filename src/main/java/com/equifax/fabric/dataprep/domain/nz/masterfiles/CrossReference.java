
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
    "keyToZmbranTable",
    "keyToZmdrnoTable",
    "masterReferenceFileNo",
    "fileType"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type CrossReference
 */
public class CrossReference {

    /**
     * The keyToZmbranTable
     */
    @JsonProperty("keyToZmbranTable")
    private String keyToZmbranTable;
    /**
     * The keyToZmdrnoTable
     */
    @JsonProperty("keyToZmdrnoTable")
    private String keyToZmdrnoTable;
    /**
     * The masterReferenceFileNo
     */
    @JsonProperty("masterReferenceFileNo")
    private String masterReferenceFileNo;
    /**
     * The fileType
     */
    @JsonProperty("fileType")
    private String fileType;

}
