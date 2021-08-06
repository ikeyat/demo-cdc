package com.example.democdc.consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoCdcApplicationTests {

    @LocalServerPort
    private String port;

    @Autowired
    TestRestTemplate testRestTemplate;

    /**
     * Consumer->Stubの疎通確認のみ
     */
    @Test
//    @Disabled
    void testConsumer() {
        ConsumerRequest request = new ConsumerRequest("0");
        ResponseEntity<ConsumerResponse> responseEntity =
                        testRestTemplate.postForEntity("http://localhost:" + port + "/consumer", request, ConsumerResponse.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        ConsumerResponse response = responseEntity.getBody();

        assertEquals("0", response.getId());
        assertEquals("Toyosu", response.getLastName());
        assertEquals("Taro", response.getFirstName());
    }

}
