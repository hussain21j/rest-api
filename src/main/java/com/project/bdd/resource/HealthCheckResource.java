package com.project.bdd.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckResource {
    public final String status = "OK";

    @RequestMapping("/healthcheck")
    public String getHealthStatus() {
        return status;
    }
}
