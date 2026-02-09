package com.learning.rule_engine.rule;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleService {
    private final RuleRepository ruleRepository;

    public RuleService(RuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    public Rule createRule(RuleRequest ruleRequest) {
        Rule rule = new Rule();
        rule.setName(ruleRequest.getName());
        rule.setDescription((ruleRequest.getDescription()));
        rule.setConditionJson(ruleRequest.getCondition());
        rule.setActionJson(ruleRequest.getAction());
        rule.setPriority(ruleRequest.getPriority());
        return ruleRepository.save(rule);
    }

    public Rule getRuleById(Long id) {
        return ruleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rule not found with Id: " + id));

    }

    public List<Rule> getAllRules() {
        return ruleRepository.findAll();
    }

    public Rule updateRuleById(Long id, RuleRequest ruleRequest) {
        Rule existingRule = ruleRepository.findById(id).orElseThrow(() -> new RuntimeException("Rule not found with ID:" + id));

        existingRule.setName(ruleRequest.getName());
        existingRule.setDescription(ruleRequest.getDescription());
        existingRule.setConditionJson(ruleRequest.getCondition());
        existingRule.setActionJson(ruleRequest.getAction());
        existingRule.setPriority(ruleRequest.getPriority());
        existingRule.setActive(ruleRequest.getIsActive());

        return ruleRepository.save(existingRule);
    }

    public Rule deleteRuleById(Long id) {
        Rule ruleItem = ruleRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Rule not found with ID:" + id));
        ruleRepository.deleteById(id);
        return ruleItem;
    }
}
