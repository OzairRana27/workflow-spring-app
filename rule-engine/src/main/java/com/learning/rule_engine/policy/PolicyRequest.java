package com.learning.rule_engine.policy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PolicyRequest {
    private String name;
    private String version;
    private String description;
    private boolean isActive;
}
