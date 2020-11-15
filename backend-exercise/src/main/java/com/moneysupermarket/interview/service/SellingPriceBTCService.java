package com.moneysupermarket.interview.service;

import com.moneysupermarket.interview.pojo.ExchangeDetailsBTC;
import com.moneysupermarket.interview.pojo.ExchangeDetailsBTCObject;
import com.moneysupermarket.interview.pojo.ResponseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

public class SellingPriceBTCService  implements SellingPriceDetails{

    @Autowired
    RestTemplate template;

    public ResponseType getSellingPrice() throws Exception {
        try {
            //ExchangeDetailsObject exchageDetails = template.getForObject("https://blockchain.info/ticker", ExchangeDetailsObject.class);
            ExchangeDetailsBTCObject mapObject = template.getForObject("https://api.exmo.com/v1/ticker",ExchangeDetailsBTCObject.class);
        }catch(Exception e){
            throw new Exception();
        }
        return null;
    }
}
