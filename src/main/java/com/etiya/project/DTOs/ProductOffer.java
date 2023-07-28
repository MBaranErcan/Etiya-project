package com.etiya.project.DTOs;

import java.util.List;

public class ProductOffer {

    private Long productOfferId;

    // Foreign Key: Cust_Ord -> prod_ofr_id
    private List<CustomerOrder> customerOrders;

    // Foreign Key of Prod_Ofr_Char_Val -> prod_ofr_id
    private List<ProductOfferCharacteristicValue> productOfferCharacteristicValue;

    private String name;

    private String description;

    private GeneralStatus stId;

    private GeneralType tpId;

    // GETTER & SETTER
    public Long getProductOfferId() {
        return productOfferId;
    }

    public void setProductOfferId(Long productOfferId) {
        this.productOfferId = productOfferId;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }

    public List<ProductOfferCharacteristicValue> getProductOfferCharacteristicValue() {
        return productOfferCharacteristicValue;
    }

    public void setProductOfferCharacteristicValue(List<ProductOfferCharacteristicValue> productOfferCharacteristicValue) {
        this.productOfferCharacteristicValue = productOfferCharacteristicValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GeneralStatus getStId() {
        return stId;
    }

    public void setStId(GeneralStatus stId) {
        this.stId = stId;
    }

    public GeneralType getTpId() {
        return tpId;
    }

    public void setTpId(GeneralType tpId) {
        this.tpId = tpId;
    }
}