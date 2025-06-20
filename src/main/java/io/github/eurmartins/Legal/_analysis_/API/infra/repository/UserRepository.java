package io.github.eurmartins.Legal._analysis_.API.infra.repository;

import io.github.eurmartins.Legal._analysis_.API.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
