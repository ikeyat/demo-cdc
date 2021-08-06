package com.example.democdcstub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
public class DemoCdcStubApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCdcStubApplication.class, args);
    }

}
