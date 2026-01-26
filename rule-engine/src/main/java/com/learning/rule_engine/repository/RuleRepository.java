package com.learning.rule_engine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.rule_engine.model.Rule;

public interface RuleRepository extends JpaRepository<Rule, Long>{
    Optional<Rule> findByName(String name);
    Optional<Rule> findById(String id);
    List<Rule> findAll();
}
