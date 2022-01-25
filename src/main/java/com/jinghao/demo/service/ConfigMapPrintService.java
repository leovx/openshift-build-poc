package com.jinghao.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConfigMapPrintService {

    @Value("${poc_var:abc}")
    private String pocVar;

    @Scheduled(fixedRate = 1000)
    public void printVar() {
        log.info(pocVar + "!@#");
    }

}
