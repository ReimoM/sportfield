package com.sports.sportfield.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsernameAndPassword(String username, String password);

    @Query("select (count(u) > 0) from User u where u.username = ?1")
    boolean existsByUsername(String username);


}