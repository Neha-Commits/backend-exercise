package com.moneysupermarket.interview.service;

import com.moneysupermarket.interview.pojo.ExchangeDetailsObject;
import com.moneysupermarket.interview.pojo.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class SellingPriceUSDService {

    @Autowired
    RestTemplate template;

    public ResponseType getSellingPrice() throws Exception {
    try {
        //ExchangeDetailsObject exchageDetails = template.getForObject("https://blockchain.info/ticker", ExchangeDetailsObject.class);
        Object obj = template.getForObject("https://blockchain.info/ticker",Object.class);
    }catch(Exception e){
        throw new Exception();
    }
    return null;
    }
}
