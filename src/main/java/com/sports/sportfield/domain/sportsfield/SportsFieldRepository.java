package com.sports.sportfield.domain.sportsfield;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SportsFieldRepository extends JpaRepository<SportsField, Integer> {
    @Query("select s from SportsField s where s.field.id = ?1")
    List<SportsField> findByFieldId(Integer id);

}