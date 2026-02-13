package com.learning.rule_engine.policy;

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
}