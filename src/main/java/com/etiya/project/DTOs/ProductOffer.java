package com.etiya.project.DTOs;

public class ProductOffer {

    private Long productOfferId;

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