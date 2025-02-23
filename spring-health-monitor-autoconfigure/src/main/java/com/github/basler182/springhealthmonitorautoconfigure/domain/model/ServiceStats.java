package com.github.basler182.springhealthmonitorautoconfigure.domain.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiceStats {
    private String serviceId;
    private int totalInstances;
    private int upInstances;
    private int downInstances;
    private Instant lastCheckTime;
    private Instant lastDowntimeStart;
    private long accumulatedDowntimeSec;
    private Map<String, Object> details;

    private List<DowntimeIncident> incidents = new ArrayList<>();

    public static class DowntimeIncident {
        private final Instant start;
        private Instant end; // null => ongoing

        public DowntimeIncident(Instant start) {
            this.start = start;
        }

        public Instant getEnd() {
            return end;
        }

        public void setEnd(Instant end) {
            this.end = end;
        }

        public Instant getStart() {
            return start;
        }
    }

    public ServiceStats() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public ServiceStats setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    public int getTotalInstances() {
        return totalInstances;
    }

    public ServiceStats setTotalInstances(int totalInstances) {
        this.totalInstances = totalInstances;
        return this;
    }

    public int getUpInstances() {
        return upInstances;
    }

    public ServiceStats setUpInstances(int upInstances) {
        this.upInstances = upInstances;
        return this;
    }

    public int getDownInstances() {
        return downInstances;
    }

    public ServiceStats setDownInstances(int downInstances) {
        this.downInstances = downInstances;
        return this;
    }

    public Instant getLastCheckTime() {
        return lastCheckTime;
    }

    public ServiceStats setLastCheckTime(Instant lastCheckTime) {
        this.lastCheckTime = lastCheckTime;
        return this;
    }

    public Instant getLastDowntimeStart() {
        return lastDowntimeStart;
    }

    public ServiceStats setLastDowntimeStart(Instant lastDowntimeStart) {
        this.lastDowntimeStart = lastDowntimeStart;
        return this;
    }

    public long getAccumulatedDowntimeSec() {
        return accumulatedDowntimeSec;
    }

    public ServiceStats setAccumulatedDowntimeSec(long accumulatedDowntimeSec) {
        this.accumulatedDowntimeSec = accumulatedDowntimeSec;
        return this;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public ServiceStats setDetails(Map<String, Object> details) {
        this.details = details;
        return this;
    }

    public List<DowntimeIncident> getIncidents() {
        return incidents;
    }

    public ServiceStats setIncidents(List<DowntimeIncident> incidents) {
        this.incidents = incidents;
        return this;
    }
}
