package com.sports.sportfield.domain.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query("select r from Role r where r.user.id = ?1")
    Role findByUserId(Integer id);


}