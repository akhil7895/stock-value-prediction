package com.example.stockApp.controller;

import com.example.stockApp.Service.StockService;

import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
@CrossOrigin(origins = "*")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    // @GetMapping("/predict")
    // public String predict(@RequestParam String symbol) {
    //     return stockService.getPrediction(symbol);
    // }

    @GetMapping("/predict")
public Map<String, Object> predict(@RequestParam String symbol) {
    return stockService.getPrediction(symbol);
}
}