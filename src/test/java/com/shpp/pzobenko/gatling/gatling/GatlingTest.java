package com.shpp.pzobenko.gatling.gatling;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class GatlingTest extends Simulation  {
  HttpProtocolBuilder httpProtocol = HttpDsl.http.baseUrl("http://127.0.0.1:5000");
//      "http://gptua-env.eba-8ie5nmtu.eu-central-1.elasticbeanstalk.com/");

  public GatlingTest() {
    this.setUp(
        Scenario.sendMessageScenario1.injectOpen(
            CoreDsl.constantUsersPerSec(1000).during(5)
        ),
        Scenario.sendMessageScenario2.injectOpen(
            CoreDsl.constantUsersPerSec(1000).during(5)
        ),
        Scenario.sendMessageScenario3.injectOpen(
            CoreDsl.constantUsersPerSec(1000).during(5)
        ),
        Scenario.sendMessageScenario4.injectOpen(
            CoreDsl.constantUsersPerSec(1000).during(5)
        )
    ).protocols(httpProtocol);
  }
}
