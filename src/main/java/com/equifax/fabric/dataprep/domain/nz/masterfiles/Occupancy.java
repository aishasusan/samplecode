
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
    "employmentDate",
    "occupation",
    "employer"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type Occupancy
 */
public class Occupancy {

    /**
     * The employmentDate
     */
    @JsonProperty("employmentDate")
    private String employmentDate;
    /**
     * The occupation
     */
    @JsonProperty("occupation")
    private String occupation;
    /**
     * The employer
     */
    @JsonProperty("employer")
    private String employer;

}
