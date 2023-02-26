package com.shpp.pzobenko.gatling.gatling;

import static io.gatling.javaapi.core.CoreDsl.incrementConcurrentUsers;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;

public class GatlingTest extends Simulation {

  HttpProtocolBuilder httpProtocol = HttpDsl.http
      .baseUrl("http://gptua-env.eba-8ie5nmtu.eu-central-1.elasticbeanstalk.com/");

  public GatlingTest() {
    this.setUp(
        Scenario.sendMessageScenario1.injectClosed(
            incrementConcurrentUsers(1)
                .times(10)
                .eachLevelLasting(1)
                .separatedByRampsLasting(1)
                .startingFrom(1)),
        Scenario.sendMessageScenario2.injectClosed(
            incrementConcurrentUsers(1)
                .times(10)
                .eachLevelLasting(1)
                .separatedByRampsLasting(1)
                .startingFrom(1)),
        Scenario.sendMessageScenario3.injectClosed(
            incrementConcurrentUsers(1)
                .times(10)
                .eachLevelLasting(1)
                .separatedByRampsLasting(1)
                .startingFrom(1)),
        Scenario.sendMessageScenario4.injectClosed(
            incrementConcurrentUsers(1)
                .times(10)
                .eachLevelLasting(1)
                .separatedByRampsLasting(1)
                .startingFrom(1)
        )
    ).protocols(httpProtocol);
  }
}
