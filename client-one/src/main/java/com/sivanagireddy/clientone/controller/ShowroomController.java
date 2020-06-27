package com.sivanagireddy.clientone.controller;

import com.sivanagireddy.clientone.client.CarClient;
import com.sivanagireddy.clientone.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/showroom")
public class ShowroomController {

    @Autowired
    private CarClient carClient;

    @GetMapping("/cars/{id}")
    public ResponseEntity<Car> findCarById(@PathVariable Long id){
        return ResponseEntity.ok(carClient.findById(id));
    }
}
