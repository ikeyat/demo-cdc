package com.example.democdc.producer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @PostMapping("producer")
    public ProducerResponse producer(@RequestBody ProducerRequest request) {
        switch (request.getId()) {
            case "0":
                return new ProducerResponse("0", "Toyosu", "Taro");
            case "1":
                return new ProducerResponse("1", "Tsukishima", "Jiro");
            case "2":
                return new ProducerResponse("2", "Shintomicho", "Saburo");
            default:
                return new ProducerResponse("-1", "N/A", "N/A");
        }
    }

}
