package net.feak.citest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class CiTestServer extends Application<CiTestConfiguration> {
    public static void main(String[] args) throws Exception {
        new CiTestServer().run(args);
    }

    @Override
    public String getName() {
        return "CognitoIdServer";
    }

    @Override
    public void initialize(Bootstrap<CiTestConfiguration> bootstrap) {
    }

    @Override
    public void run(CiTestConfiguration configuration, Environment environment) {
        TokenResource resource = new TokenResource();

        environment.healthChecks().register("lb-healthcheck", new LoadBalancerHealthCheck());
        environment.jersey().register(resource);
    }
}