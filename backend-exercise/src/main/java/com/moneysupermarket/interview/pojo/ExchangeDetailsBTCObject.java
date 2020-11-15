package com.moneysupermarket.interview.pojo;

import java.util.LinkedHashMap;

public class ExchangeDetailsBTCObject {

    LinkedHashMap<String,ExchangeDetailsBTCArray> BtcMap;

    public LinkedHashMap<String, ExchangeDetailsBTCArray> getBtcMap() {
        return BtcMap;
    }

    public void setBtcMap(LinkedHashMap<String, ExchangeDetailsBTCArray> btcMap) {
        BtcMap = btcMap;
    }
}
