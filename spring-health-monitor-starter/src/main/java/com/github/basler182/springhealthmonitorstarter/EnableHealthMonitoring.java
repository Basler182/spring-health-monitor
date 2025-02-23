package com.github.basler182.springhealthmonitorstarter;

import com.github.basler182.springhealthmonitorautoconfigure.config.HealthMonitorAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HealthMonitorAutoConfiguration.class)
public @interface EnableHealthMonitoring {
}