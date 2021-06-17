
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
    "narrationText",
    "narrationDate",
    "narrationTime",
    "userProfile"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type Narration
 */
public class Narration {

    /**
	 * The narrationText
	 */
	@JsonProperty("narrationText")
    private String narrationText;
    /**
	 * The narrationDate
	 */
	@JsonProperty("narrationDate")
    private String narrationDate;
    /**
	 * The narrationTime
	 */
	@JsonProperty("narrationTime")
    private String narrationTime;
    /**
	 * The userProfile
	 */
	@JsonProperty("userProfile")
    private String userProfile;

}
