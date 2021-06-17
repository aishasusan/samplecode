
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

        /**
         * The type Employment.
         */
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        @Setter
        @EqualsAndHashCode
        @ToString
        @Builder

        public class Employment {

            @JsonProperty("seqNo")
            private String seqNo;

            @JsonProperty("createMbrCode")
            private String createMbrCode;

            @JsonProperty("createOprId")
            private String createOprId;

            @JsonProperty("queryTypeMultSupplier")
            private boolean queryTypeMultSupplier;

            @JsonProperty("queryTypeNonCr")
            private boolean queryTypeNonCr;

            @JsonProperty("occName")
            private String occName;

            @JsonProperty("empName")
            private String empName;

            @JsonProperty("frdEmCons")
            private String frdEmCons;

            @JsonProperty("lrdEmCons")
            private String lrdEmCons;
        }
