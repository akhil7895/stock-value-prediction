// package com.example.stockApp.Service;

// import org.springframework.stereotype.Service;
// import org.springframework.web.client.RestTemplate;

// @Service
// public class StockService {

//     public String getPrediction(String stock) {

//         String url = "http://127.0.0.1:5001/predict?stock=" + stock;

//         RestTemplate restTemplate = new RestTemplate();

//         return restTemplate.getForObject(url, String.class);
//     }
// }

//http://192.168.197.90:10000


package com.example.stockApp.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class StockService {

    public Map<String, Object> getPrediction(String stock) {

        // String url = "http://127.0.0.1:5001/predict?stock=" + stock;
        String url = "http://127.0.0.1:10000/predict?stock=" + stock;

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, Map.class);
    }
}