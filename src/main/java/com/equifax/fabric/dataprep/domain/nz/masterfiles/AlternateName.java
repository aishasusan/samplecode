
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
    "nameChangeDate",
    "dateOfBirth",
    "lastName",
    "firstName",
    "middleName",
    "nameType"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type AlternateName.
 */
public class AlternateName {
    /**
     * The nameChangeDate
     */
    @JsonProperty("nameChangeDate")
    private String nameChangeDate;
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
     * The nameType
     */
    @JsonProperty("nameType")
    private String nameType;

}
