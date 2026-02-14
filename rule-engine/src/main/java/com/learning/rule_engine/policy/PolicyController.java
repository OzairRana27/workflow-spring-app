package com.learning.rule_engine.policy;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class PolicyController {
    private final PolicyService policyService;

    PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Policy createPolicy(@RequestBody PolicyRequest policyRequest) {
        return policyService.createPolicy(policyRequest);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}") 
    public Policy getPolicyById(@PathVariable Long id) {
        return policyService.getPolicyById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Policy> getAllPolicies(){
        return this.policyService.getAllPolicies();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public Policy deletePolicyById(@PathVariable Long id) {
        return policyService.deletePolicyById(id);
    }
}