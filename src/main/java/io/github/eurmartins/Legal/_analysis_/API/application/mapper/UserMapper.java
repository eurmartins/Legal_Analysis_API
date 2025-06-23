package io.github.eurmartins.Legal._analysis_.API.application.mapper;

import io.github.eurmartins.Legal._analysis_.API.application.dto.UserLawyerResponseDetailsDTO;
import io.github.eurmartins.Legal._analysis_.API.application.dto.UserRequestDTO;
import io.github.eurmartins.Legal._analysis_.API.application.dto.UserResponseDetailsDTO;
import io.github.eurmartins.Legal._analysis_.API.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User userRequestDTOToEntity(UserRequestDTO dto);

    UserResponseDetailsDTO userToResponseDTO(User user);

    UserLawyerResponseDetailsDTO userToLawyerResponseDTO(User user);

    List<UserResponseDetailsDTO> listToResponseDTO(List<User> users);
}
