package com.etiya.project.DTOs;

import com.etiya.project.entities.GnlCharEntity;

public class ProductOfferCharacteristicValue {

    private Long productOfferCharacteristicValueId;

    //Foreign Key: Prod_Ofr -> prod_ofr_id
    private ProductOffer productOffer;

    // Foreign Key of Gnl_Char -> char_id
    private GeneralCharacteristic generalCharacteristic;

    private String name;

    private String description;

    private String shortCode;

    private GeneralStatus statusId;

    // GETTER & SETTER

    public Long getProductOfferCharacteristicValueId() {
        return productOfferCharacteristicValueId;
    }

    public void setProductOfferCharacteristicValueId(Long productOfferCharacteristicValueId) {
        this.productOfferCharacteristicValueId = productOfferCharacteristicValueId;
    }

    public ProductOffer getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(ProductOffer productOffer) {
        this.productOffer = productOffer;
    }

    public GeneralCharacteristic getGeneralCharacteristic() {
        return generalCharacteristic;
    }

    public void setGeneralCharacteristic(GeneralCharacteristic generalCharacteristic) {
        this.generalCharacteristic = generalCharacteristic;
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
