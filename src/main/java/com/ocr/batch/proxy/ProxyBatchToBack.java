package com.ocr.batch.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "microservice-back", url = "localhost:9000")
public interface ProxyBatchToBack {

    @GetMapping("/envoie-mail")
    void envoieMail();


}
