package com.learning.rule_engine.rule_engine_core.rule.ports.outbound;

import java.util.List;
import java.util.Optional;

import com.learning.rule_engine.rule_engine_core.rule.domain.Rule;

public interface RuleRepositoryPort {
    Rule save(Rule rule);
    Optional<Rule> findById(Long id);
    List<Rule> findAll();
    void deleteById(Long id);
}
