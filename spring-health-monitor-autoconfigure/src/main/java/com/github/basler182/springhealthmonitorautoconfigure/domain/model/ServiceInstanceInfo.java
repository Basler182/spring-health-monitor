package com.github.basler182.springhealthmonitorautoconfigure.domain.model;

public record ServiceInstanceInfo (
     String instanceId,
     String host,
     int port,
     boolean secure,
    String healthUrl){
}
