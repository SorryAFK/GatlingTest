package com.shpp.pzobenko.gatling.gatling;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.ScenarioBuilder;

public class Scenario {
  public static ScenarioBuilder sendMessageScenario1 = CoreDsl.scenario("Send message scenario1")
      .exec(Steps.sendMessageReq1);
  public static ScenarioBuilder sendMessageScenario2 = CoreDsl.scenario("Send message scenario2")
      .exec(Steps.sendMessageReq2);
  public static ScenarioBuilder sendMessageScenario3 = CoreDsl.scenario("Send message scenario3")
      .exec(Steps.sendMessageReq3);
  public static ScenarioBuilder sendMessageScenario4 = CoreDsl.scenario("Send message scenario4")
      .exec(Steps.sendMessageReq4);
}
