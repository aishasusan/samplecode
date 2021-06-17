
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
    "oldConsumerMasterfileNo"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
/**
 * The type Merge
 */
public class Merge {

    /**
     * The oldConsumerMasterfileNo
     */
    @JsonProperty("oldConsumerMasterfileNo")
    private String oldConsumerMasterfileNo;

}
