package io.github.eurmartins.Legal._analysis_.API.application.service;

import io.github.eurmartins.Legal._analysis_.API.application.dto.UserLawyerResponseDetailsDTO;
import io.github.eurmartins.Legal._analysis_.API.application.dto.UserRequestDTO;
import io.github.eurmartins.Legal._analysis_.API.application.dto.UserResponseDetailsDTO;
import io.github.eurmartins.Legal._analysis_.API.application.mapper.UserMapper;
import io.github.eurmartins.Legal._analysis_.API.domain.model.User;
import io.github.eurmartins.Legal._analysis_.API.infra.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponseDetailsDTO createUser(UserRequestDTO dto){
        User request = userMapper.userRequestDTOToEntity(dto);
        User response = userRepository.save(request);
        return userMapper.userToResponseDTO(response);
    }

    public UserResponseDetailsDTO getUserById(Long id){
        User response = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com ID: " + id));
        return userMapper.userToResponseDTO(response);
    }

    public List<UserResponseDetailsDTO> listAllUsers(){
        List<User> response = userRepository.findAll();
        return userMapper.listToResponseDTO(response);
    }

    public UserLawyerResponseDetailsDTO getLawyerDetails(Long id) {
        User response = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado com ID: " + id));
        return userMapper.userToLawyerResponseDTO(response);
    }
}
