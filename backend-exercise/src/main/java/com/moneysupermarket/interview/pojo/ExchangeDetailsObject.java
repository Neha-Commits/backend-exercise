package com.moneysupermarket.interview.pojo;

import java.util.LinkedHashMap;
import java.util.Objects;

public class ExchangeDetailsObject {

    LinkedHashMap<String,ExchangeDetailsArray> detailsObject;

    public LinkedHashMap<String, ExchangeDetailsArray> getDetailsObject() {
        return detailsObject;
    }

    public void setDetailsObject(LinkedHashMap<String, ExchangeDetailsArray> detailsObject) {
        this.detailsObject = detailsObject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeDetailsObject that = (ExchangeDetailsObject) o;
        return Objects.equals(detailsObject, that.detailsObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsObject);
    }
}
