package net.feak.citest;

import com.codahale.metrics.health.HealthCheck;

/**
 * This is a low cost health check for the load balancer to establish that the
 * server is present and at least responding to HTTP requests.
 */
public class LoadBalancerHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
