package io.github.eurmartins.Legal._analysis_.API.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDetailsDTO {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("username")
    private String username;

    @JsonProperty("email")
    private String email;
}
