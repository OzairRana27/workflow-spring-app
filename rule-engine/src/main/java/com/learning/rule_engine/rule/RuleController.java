package com.learning.rule_engine.rule;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rules")
public class RuleController {
    private final RuleService ruleService;

    RuleController(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Rule createRule(@RequestBody RuleRequest ruleRequest) {
        return ruleService.createRule(ruleRequest);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Rule getRuleById(@PathVariable Long id) {
        return ruleService.getRuleById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Rule> getAllRules() {
        return ruleService.getAllRules();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Rule deleteRuleById(@PathVariable Long id) {
        return ruleService.deleteRuleById(id);
    }
}
