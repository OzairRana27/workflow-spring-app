package com.learning.rule_engine.controller;

import org.springframework.web.bind.annotation.*;

import com.learning.rule_engine.model.Rule;
import com.learning.rule_engine.objects.RuleRequest;
import com.learning.rule_engine.service.RuleService;

import java.util.List;

@RestController
@RequestMapping("/rules")
public class RuleController {
    private final RuleService ruleService;

    RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @PostMapping
    public Rule createRule(@RequestBody RuleRequest ruleRequest) {
        return ruleService.createRule(ruleRequest);
    }

    @GetMapping("/{id}")
    public Rule getRuleById(@PathVariable Long id) {
        return ruleService.getRuleById(id);
    }

    @GetMapping
    public List<Rule> getAllRules() {
        return ruleService.getAllRules();
    }
}
