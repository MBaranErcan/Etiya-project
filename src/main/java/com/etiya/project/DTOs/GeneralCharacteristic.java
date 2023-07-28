package com.etiya.project.DTOs;

import java.util.List;

public class GeneralCharacteristic {

    private Long generalCharacteristicId;

    private List<GeneralCharacteristicValue> generalCharacteristicValue;

    private List<ProductOfferCharacteristicValue> productOfferCharacteristicValues;

    private String description;

    private String name;

    private String shortCode;

    private GeneralStatus statusId;


    // GETTERS & SETTERS
    public Long getGeneralCharacteristicId() {
        return generalCharacteristicId;
    }

    public void setGeneralCharacteristicId(Long generalCharacteristicId) {
        this.generalCharacteristicId = generalCharacteristicId;
    }

    public List<GeneralCharacteristicValue> getGeneralCharacteristicValue() {
        return generalCharacteristicValue;
    }

    public void setGeneralCharacteristicValue(List<GeneralCharacteristicValue> generalCharacteristicValue) {
        this.generalCharacteristicValue = generalCharacteristicValue;
    }

    public List<ProductOfferCharacteristicValue> getProductOfferCharacteristicValues() {
        return productOfferCharacteristicValues;
    }

    public void setProductOfferCharacteristicValues(List<ProductOfferCharacteristicValue> productOfferCharacteristicValues) {
        this.productOfferCharacteristicValues = productOfferCharacteristicValues;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public GeneralStatus getStatusId() {
        return statusId;
    }

    public void setStatusId(GeneralStatus statusId) {
        this.statusId = statusId;
    }
}
