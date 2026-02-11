package com.learning.rule_engine.rule_engine_core.rule.service;

import org.springframework.stereotype.Service;

import com.learning.rule_engine.rule_engine_core.rule.domain.Rule;
import com.learning.rule_engine.rule_engine_core.rule.ports.inbound.CreateRuleUseCase;
import com.learning.rule_engine.rule_engine_core.rule.ports.outbound.RuleRepositoryPort;

@Service
public class RuleService implements CreateRuleUseCase{
    private final RuleRepositoryPort ruleRepositoryPort;

    // public RuleService(RuleRepositoryPort ruleRepositoryPort) {
    //     this.ruleRepositoryPort = ruleRepositoryPort;
    // }

    // public Rule createRule(RuleRequest ruleRequest) {
    //     Rule rule = new Rule();
    //     rule.setName(ruleRequest.getName());
    //     rule.setDescription((ruleRequest.getDescription()));
    //     rule.setConditionJson(ruleRequest.getCondition());
    //     rule.setActionJson(ruleRequest.getAction());
    //     rule.setPriority(ruleRequest.getPriority());
    //     return ruleRepository.save(rule);
    // }

    // public Rule getRuleById(Long id) {
    //     return ruleRepository.findById(id)
    //             .orElseThrow(() -> new IllegalArgumentException("Rule not found with Id: " + id));

    // }

    // public List<Rule> getAllRules() {
    //     return ruleRepository.findAll();
    // }

    // public Rule updateRuleById(Long id, RuleRequest ruleRequest) {
    //     Rule existingRule = ruleRepository.findById(id).orElseThrow(() -> new RuntimeException("Rule not found with ID:" + id));

    //     existingRule.setName(ruleRequest.getName());
    //     existingRule.setDescription(ruleRequest.getDescription());
    //     existingRule.setConditionJson(ruleRequest.getCondition());
    //     existingRule.setActionJson(ruleRequest.getAction());
    //     existingRule.setPriority(ruleRequest.getPriority());
    //     existingRule.setActive(ruleRequest.getIsActive());

    //     return ruleRepository.save(existingRule);
    // }

    // public Rule deleteRuleById(Long id) {
    //     Rule ruleItem = ruleRepository.findById(id)
    //                     .orElseThrow(() -> new RuntimeException("Rule not found with ID:" + id));
    //     ruleRepository.deleteById(id);
    //     return ruleItem;
    // }

    @Override
    public Rule createRule(Rule rule) {
        // Business logic only: e.g., set default active status if needed [cite: 11]
        return ruleRepositoryPort.save(rule);
    }

    // @Override
    // public Rule getRuleById(Long id) {
    //     return ruleRepositoryPort.findById(id)
    //             .orElseThrow(() -> new IllegalArgumentException("Rule not found with Id: " + id));
    // }

    // @Override
    // public List<Rule> getAllRules() {
    //     return ruleRepositoryPort.findAll();
    // }

    // @Override
    // public Rule updateRule(Long id, Rule rule) {
    //     // Core doesn't care about IDs in the body vs URL; it just updates 
    //     Rule existing = getRuleById(id);
    //     existing.updateFrom(rule); // Domain method for updating fields
    //     return ruleRepositoryPort.save(existing);
    // }

    // @Override
    // public Rule deleteRule(Long id) {
    //     Rule rule = getRuleById(id);
    //     ruleRepositoryPort.deleteById(id);
    //     return rule;
    // }
}
