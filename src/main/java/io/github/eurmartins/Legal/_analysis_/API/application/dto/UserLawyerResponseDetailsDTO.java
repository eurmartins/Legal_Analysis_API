package io.github.eurmartins.Legal._analysis_.API.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLawyerResponseDetailsDTO {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("oab_number")
    private int oabNumber;

    @JsonProperty("oab_uf")
    private String oabUF;

    @JsonProperty("specialty")
    private String specialty;

    @JsonProperty("law_firm")
    private String lawFirm;
}
