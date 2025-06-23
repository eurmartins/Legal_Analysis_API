package io.github.eurmartins.Legal._analysis_.API.web.controller;

import io.github.eurmartins.Legal._analysis_.API.application.dto.UserLawyerResponseDetailsDTO;
import io.github.eurmartins.Legal._analysis_.API.application.dto.UserRequestDTO;
import io.github.eurmartins.Legal._analysis_.API.application.dto.UserResponseDetailsDTO;
import io.github.eurmartins.Legal._analysis_.API.application.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDetailsDTO> createUser(@RequestBody UserRequestDTO dto) {
        return ResponseEntity.ok(userService.createUser(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDetailsDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDetailsDTO>> listAllUsers() {
        return ResponseEntity.ok(userService.listAllUsers());
    }

    @GetMapping("/{id}/lawyer-details")
    public ResponseEntity<UserLawyerResponseDetailsDTO> getLawyerDetails(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getLawyerDetails(id));
    }
}
