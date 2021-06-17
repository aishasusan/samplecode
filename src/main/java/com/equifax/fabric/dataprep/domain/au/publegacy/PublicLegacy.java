
package com.equifax.fabric.dataprep.domain.au.publegacy;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class PublicLegacy {

    @JsonProperty("fileNo")
    private Integer fileNo;
    @JsonProperty("seqNo")
    private Integer seqNo;
    @JsonProperty("lastUpdateDate")
    private String lastUpdateDate;
    @JsonProperty("createDate")
    private String createDate;
    @JsonProperty("createMbrCode")
    private String createMbrCode;
    @JsonProperty("createOprId")
    private String createOprId;
    @JsonProperty("surname")
    private String surname;
    @JsonProperty("frstname")
    private String frstname;
    @JsonProperty("mddname")
    private String mddname;
    @JsonProperty("surnameConfirmedDate")
    private String surnameConfirmedDate;
    @JsonProperty("frstnameConfirmedDate")
    private String frstnameConfirmedDate;
    @JsonProperty("mddnameConfirmedDate")
    private String mddnameConfirmedDate;
    @JsonProperty("surnameMbrCode")
    private String surnameMbrCode;
    @JsonProperty("frstnameMbrCode")
    private String frstnameMbrCode;
    @JsonProperty("mddnameMbrCode")
    private String mddnameMbrCode;
    @JsonProperty("sexCode")
    private String sexCode;
    @JsonProperty("drvLicNo")
    private String drvLicNo;
    @JsonProperty("drvCreateDate")
    private String drvCreateDate;
    @JsonProperty("drvConfirmedDate")
    private String drvConfirmedDate;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("dobCreateDate")
    private String dobCreateDate;
    @JsonProperty("dobConfirmedDate")
    private String dobConfirmedDate;
    @JsonProperty("dobMbrCode")
    private String dobMbrCode;
    @JsonProperty("dobLrd")
    private String dobLrd;
    @JsonProperty("drvLrd")
    private String drvLrd;
    @JsonProperty("addresses")
    private List<Address> addresses = new ArrayList<Address>();
    @JsonProperty("bankruptcies")
    private List<Bankruptcy> bankruptcies = new ArrayList<Bankruptcy>();
    @JsonProperty("defaultJudgments")
    private List<DefaultJudgment> defaultJudgments = new ArrayList<DefaultJudgment>();
    @JsonProperty("directorships")
    private List<Directorship> directorships = new ArrayList<Directorship>();
    @JsonProperty("previousDirectorships")
    private List<PreviousDirectorship> previousDirectorships = new ArrayList<PreviousDirectorship>();
    @JsonProperty("disqualifiedDirectorships")
    private List<DisqualifiedDirectorship> disqualifiedDirectorships = new ArrayList<DisqualifiedDirectorship>();
    @JsonProperty("crossReferences")
    private List<CrossReference> crossReferences = new ArrayList<CrossReference>();

}
