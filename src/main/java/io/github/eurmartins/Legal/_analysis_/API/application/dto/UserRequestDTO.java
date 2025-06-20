package io.github.eurmartins.Legal._analysis_.API.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.eurmartins.Legal._analysis_.API.domain.enumerator.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("cellphone")
    private String cellphone;

    @JsonProperty("username")
    private String username;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("oab_number")
    private int oabNumber;

    @JsonProperty("oab_uf")
    private String oabUF;

    @JsonProperty("specialty")
    private String specialty;

    @JsonProperty("law_firm")
    private String lawFirm;

    @JsonProperty("role")
    private Role role;
}
