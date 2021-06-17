package com.equifax.fabric.dataprep.domain.au.consumer.identity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The type Employment.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employment {

    /**
     * The Seq no.
     */
    @JsonProperty("seqNo")
    private Integer seqNo;

    /**
     * The Last update date.
     */
    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;

    /**
     * The Create date.
     */
    @JsonProperty("createDate")
    private String createDate;

    /**
     * The Create mbr code.
     */
    @JsonProperty("createMbrCode")
    private String createMbrCode;

    /**
     * The Create opr id.
     */
    @JsonProperty("createOprId")
    private String createOprId;

    /**
     * The Occ name.
     */
    @JsonProperty("occName")
    private String occName;

    /**
     * The Emp name.
     */
    @JsonProperty("empName")
    private String empName;
}
