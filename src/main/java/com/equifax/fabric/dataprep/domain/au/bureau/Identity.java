
        /*
         * THIS PROGRAM IS CONFIDENTIAL AND PROPRIETARY TO EQUIFAX INC. AND MAY NOT BE REPRODUCED, PUBLISHED OR DISCLOSED TO OTHERS WITHOUT ITS AUTHORIZATION.
         *
         * Copyright © Equifax Inc.
         *
         * All Rights Reserved. EQUIFAX is a trademark or registered trademarks of Equifax Inc. or its affiliates in the U.S. and other  countries. Other names may be trademarks of their respective owners.
         */
        package com.equifax.fabric.dataprep.domain.au.bureau;

        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import lombok.*;

        import java.util.ArrayList;
        import java.util.List;


        /**
         * The type Identity.
         */
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @Builder
        public class Identity {

            @JsonProperty("fileNo")
            private String fileNo;

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

            @JsonProperty("nameCrLoad")
            private String nameCrLoad;

            @JsonProperty("nameNonCrLoad")
            private String nameNonCrLoad;

            @JsonProperty("nameMultSupplierSurname")
            private String nameMultSupplierSurname;

            @JsonProperty("nameMultSupplierFrstname")
            private String nameMultSupplierFrstname;

            @JsonProperty("nameMultSupplierMddname")
            private String nameMultSupplierMddname;

            @JsonProperty("surnameConfirmedDate")
            private String surnameConfirmedDate;

            @JsonProperty("frstnameConfirmedDate")
            private String frstnameConfirmedDate;

            @JsonProperty("mddnameConfirmedDate")
            private String mddnameConfirmedDate;

            @JsonProperty("nameLastSuppled")
            private String nameLastSuppled;

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

            @JsonProperty("drvLicCrLoad")
            private String drvLicCrLoad;

            @JsonProperty("drvLicNonCrLoad")
            private String drvLicNonCrLoad;

            @JsonProperty("drvLicMultSupplier")
            private String drvLicMultSupplier;

            @JsonProperty("drvCreateDate")
            private String drvCreateDate;

            @JsonProperty("drvConfirmedDate")
            private String drvConfirmedDate;

            @JsonProperty("birthDate")
            private String birthDate;

            @JsonProperty("dobCrLoad")
            private String dobCrLoad;

            @JsonProperty("dobNonCrLoad")
            private String dobNonCrLoad;

            @JsonProperty("dobMultSupplier")
            private String dobMultSupplier;

            @JsonProperty("dobCreateDate")
            private String dobCreateDate;

            @JsonProperty("dobMbrCode")
            private String dobMbrCode;

            @JsonProperty("dobConfirmedDate")
            private String dobConfirmedDate;

            @JsonProperty("dobLrd")
            private String dobLrd;

            @JsonProperty("drvLrd")
            private String drvLrd;

            @JsonProperty("drvMbrCode")
            private String drvMbrCode;


            @JsonProperty("addresses")
            private List<Address> addresses;

            @JsonProperty("employments")
            private List<Employment> employment;

            @JsonProperty("accountLink")
            private AccountLink accountLink;

            @JsonProperty("account")
            private List<Account> account;


            @JsonProperty("consumerEnquiries")
            private List<ConsumerEnquiry> consumerEnquiries;

            @JsonProperty("bans")
            private List<Bans> bans;

            @JsonProperty("crossReferences")
            private List<CrossReference> crossReferences;


        }
