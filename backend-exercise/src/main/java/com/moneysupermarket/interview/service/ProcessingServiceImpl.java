package com.moneysupermarket.interview.service;

import com.moneysupermarket.interview.pojo.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcessingServiceImpl  implements  ProcessingService {

    @Autowired
    SellingPriceUSDService usdService;

    @Override
    public ResponseType getExchangeValues() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            try {
                ResponseType type = usdService.getSellingPrice();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        return null;
    }
}
