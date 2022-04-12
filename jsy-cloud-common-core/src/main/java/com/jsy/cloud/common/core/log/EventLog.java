package com.jsy.cloud.common.core.log;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EventLog {
    private String description;
}
