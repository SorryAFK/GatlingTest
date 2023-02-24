package com.shpp.pzobenko.gatling.gatling;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.http.HttpDsl;

import static io.gatling.javaapi.core.CoreDsl.StringBody;
public class Steps {

  public static ChainBuilder sendMessageReq1 = CoreDsl.exec(
      HttpDsl.http("sendMessage")
          .post("/bot")
          .header("Content-Type", "application/json")
          .header("user-hash","gatlingUser1")
          .body(StringBody("{\"message\": \"string\", \"model\": \"BABBAGE\"}"))
          .check(HttpDsl.status().is(200))
  );

  public static ChainBuilder sendMessageReq2 = CoreDsl.exec(
      HttpDsl.http("sendMessage")
          .post("/bot")
          .header("Content-Type", "application/json")
          .header("user-hash","gatlingUser2")
          .body(StringBody("{\"message\": \"string\", \"model\": \"ADA\"}"))
          .check(HttpDsl.status().is(200))
  );

  public static ChainBuilder sendMessageReq3 = CoreDsl.exec(
      HttpDsl.http("sendMessage")
          .post("/bot")
          .header("Content-Type", "application/json")
          .header("user-hash","gatlingUser3")
          .body(StringBody("{\"message\": \"string\", \"model\": \"DAVINCI\"}"))
          .check(HttpDsl.status().is(200))
  );

  public static ChainBuilder sendMessageReq4 = CoreDsl.exec(
      HttpDsl.http("sendMessage")
          .post("/bot")
          .header("Content-Type", "application/json")
          .header("user-hash","gatlingUser4")
          .body(StringBody("{\"message\": \"string\", \"model\": \"CURIE\"}"))
          .check(HttpDsl.status().is(200))
  );


//  public static ChainBuilder getAnswer = CoreDsl.exec(
//      HttpDsl.http("getAnswer")
//          .get()
//  )
}
