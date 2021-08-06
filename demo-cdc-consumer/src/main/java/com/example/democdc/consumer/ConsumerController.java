package com.example.democdc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumerController.class);
    private RestTemplate restTemplate;
    private String producerUrl;

    public ConsumerController(RestTemplate restTemplate, @Value("${producer.url}") String producerUrl) {
        this.restTemplate = restTemplate;
        this.producerUrl = producerUrl;
    }

    @PostMapping("consumer")
    public ConsumerResponse consumer(@RequestBody ConsumerRequest request) {
        ResponseEntity<ProducerResponse> responseEntity =
                        restTemplate.postForEntity(producerUrl, new ProducerRequest(request.getId()), ProducerResponse.class);
        LOG.debug(responseEntity.toString());
        ProducerResponse response = responseEntity.getBody();
        return new ConsumerResponse(response.getId(), response.getLastName(), response.getFirstName());
    }

}
