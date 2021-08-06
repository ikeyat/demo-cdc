package com.example.democdcstub;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;

@SpringBootTest
@AutoConfigureStubRunner(ids = {"com.example:demo-cdc:+:stubs:8082"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
class DemoCdcStubApplicationTests {

	@Test
	void contextLoads() {
	}

}
