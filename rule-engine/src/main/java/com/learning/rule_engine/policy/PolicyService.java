package com.learning.rule_engine.policy;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PolicyService {
    private final PolicyRepository policyRepository;

    PolicyService(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    public Policy createPolicy(PolicyRequest policyRequest) {
        Policy policy = new Policy();
        policy.setName(policyRequest.getName());
        policy.setDescription(policyRequest.getDescription());
        return policyRepository.save(policy);
    }

    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id).orElseThrow(() -> new RuntimeException("Policy not found with Id: " + id));
    }
    
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy deletePolicyById(Long id) {
        Policy policyItem = policyRepository.findById(id).orElseThrow(() -> new RuntimeException("Policy not found with ID:" + id));
        policyRepository.deleteById(id);
        return policyItem;
    }
}