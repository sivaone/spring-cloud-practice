package com.sivanagireddy.clientone.client;

import com.sivanagireddy.clientone.domain.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-one")
public interface CarClient {

    @GetMapping("/cars/{id}")
    Car findById(@PathVariable Long id);
}
