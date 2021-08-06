package com.example.democdc.contracts;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import com.example.democdc.producer.DemoCdcApplication;

import io.restassured.RestAssured;

// Producerのテスト用親クラス
@SpringBootTest(classes = DemoCdcApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class ContractsTestBase {

    @LocalServerPort
    int port;

    @BeforeEach
    public void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = this.port;
    }


}
