package com.github.basler182.springhealthmonitorautoconfigure.infrastructure.service;

import com.github.basler182.springhealthmonitorautoconfigure.domain.model.ServiceStats;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    public void sendAlert(ServiceStats stats) {
        String text = String.format(
                ":warning: Service **%s** has %d of %d instances DOWN! (LastCheck: %s)",
                stats.getServiceId(),
                stats.getDownInstances(),
                stats.getTotalInstances(),
                stats.getLastCheckTime()
        );
        System.out.println("AlertService: " + text); // TODO use mattermost webhook library
    }
}
