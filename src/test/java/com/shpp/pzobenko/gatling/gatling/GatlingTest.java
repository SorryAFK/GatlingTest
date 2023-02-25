package com.shpp.pzobenko.gatling.gatling;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class GatlingTest extends Simulation {

  HttpProtocolBuilder httpProtocol = HttpDsl.http
      .baseUrl("http://gptua-env.eba-8ie5nmtu.eu-central-1.elasticbeanstalk.com/");

  public GatlingTest() {
    this.setUp(
        Scenario.sendMessageScenario1.injectOpen(
            CoreDsl.constantUsersPerSec(100).during(10)
        ),
        Scenario.sendMessageScenario2.injectOpen(
            CoreDsl.constantUsersPerSec(100).during(10)
        ),
        Scenario.sendMessageScenario3.injectOpen(
            CoreDsl.constantUsersPerSec(100).during(10)
        ),
        Scenario.sendMessageScenario4.injectOpen(
            CoreDsl.constantUsersPerSec(100).during(10)
        )
    ).protocols(httpProtocol);
  }
}
