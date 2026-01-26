package com.learning.rule_engine.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuleRequest {
    private String name;
    private String description;
    private String condition;
    private String action;
    private Integer priority;
    private Boolean isActive;
}
