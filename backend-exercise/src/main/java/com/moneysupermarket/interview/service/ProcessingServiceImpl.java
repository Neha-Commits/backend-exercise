package com.moneysupermarket.interview.service;

import com.moneysupermarket.interview.pojo.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ProcessingServiceImpl  implements  ProcessingService {

    @Autowired
    SellingPriceUSDService usdService;

    @Autowired
    SellingPriceBTCService btcService;

    @Override
    public ResponseType getExchangeValues() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<ResponseType> callableTask1= () -> {
            try {
                ResponseType type = usdService.getSellingPrice();
                return type;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        };

        Callable<ResponseType> callableTask2 = () -> {
            try {
                ResponseType type = btcService.getSellingPrice();
                return type;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        };


        //List<Future<ResponseType>> futures = executor.invokeAll(callableTasks);


        return null;
    }
}
