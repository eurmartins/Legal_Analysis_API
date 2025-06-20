package io.github.eurmartins.Legal._analysis_.API.domain.model;


import io.github.eurmartins.Legal._analysis_.API.domain.enumerator.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fullName;

    @Column
    private String cpf;

    @Column
    private String cellphone;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column
    private String password;

    @Column
    private int oabNumber;

    @Column
    private String oabUF;

    @Column
    private String specialty;

    @Column
    private String lawFirm;

    @Column
    private Role role;
}
