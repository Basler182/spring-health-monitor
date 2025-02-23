package com.github.basler182.springhealthmonitorautoconfigure.domain.model;

import java.util.List;

public record MonitoredService(
        String serviceId,
        List<ServiceInstanceInfo> instances) {
}