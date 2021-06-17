package com.equifax.fabric.dataprep.domain.nz.consumer.identity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 *  The type BToCProdOrderTasks.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BToCProdOrderTasks {

    @JsonProperty("productOrderNo")
    private String productOrderNo;

    @JsonProperty("taskTypeRecordId")
    private String taskTypeRecordId;

    @JsonProperty("productTaskId")
    private String productTaskId;

    @JsonProperty("taskCompleteFlag")
    private String taskCompleteFlag;

    @JsonProperty("taskReference")
    private String taskReference;

    @JsonProperty("taskLinkText")
    private String taskLinkText;

    @JsonProperty("bToCProdOrderTaskRecordCreationUser")
    private String bToCProdOrderTaskRecordCreationUser;

    @JsonProperty("bToCProdOrderTaskRecordCreationDate")
    private String bToCProdOrderTaskRecordCreationDate;

    @JsonProperty("bToCProdOrderTaskRecordCreationTime")
    private String bToCProdOrderTaskRecordCreationTime;

    @JsonProperty("bToCProdOrderTaskRecordCreationProgram")
    private String bToCProdOrderTaskRecordCreationProgram;

    @JsonProperty("bToCProdOrderTaskRecordUpdateUser")
    private String bToCProdOrderTaskRecordUpdateUser;

    @JsonProperty("bToCProdOrderTaskRecordUpdateDate")
    private String bToCProdOrderTaskRecordUpdateDate;

    @JsonProperty("bToCProdOrderTaskRecordUpdateTime")
    private String bToCProdOrderTaskRecordUpdateTime;

    @JsonProperty("bToCProdOrderTaskRecordUpdateProgram")
    private String bToCProdOrderTaskRecordUpdateProgram;

}
