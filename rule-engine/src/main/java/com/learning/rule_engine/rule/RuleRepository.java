package com.learning.rule_engine.rule;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RuleRepository extends JpaRepository<Rule, Long>{
    Optional<Rule> findByName(String name);
}
