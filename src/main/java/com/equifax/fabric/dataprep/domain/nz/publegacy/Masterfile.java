
package com.equifax.fabric.dataprep.domain.nz.publegacy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consumerMasterfileNo"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Masterfile {

    @JsonProperty("consumerMasterfileNo")
    private String consumerMasterfileNo;

}
