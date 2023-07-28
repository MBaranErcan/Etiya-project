package com.etiya.project.DTOs;

import com.etiya.project.entities.ProdOfrEntity;

import java.util.List;

public class GeneralType {

    private Long generalTypeId;

/*    // Foreign Key: User -> user_tp_id
    private List<User> users;

    // Foreign Key: ProdOfrEntity -> tpId
    private List<ProductOffer> productOffers;*/

    private String name;

    private String description;

    private String shortCode;

    private  String entityCodeName;

    private boolean isActive;


    // Getters & Setters


    public Long getGeneralTypeId() {
        return generalTypeId;
    }

    public void setGeneralTypeId(Long generalTypeId) {
        this.generalTypeId = generalTypeId;
    }

/*
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<ProductOffer> getProductOffers() {
        return productOffers;
    }

    public void setProductOffers(List<ProductOffer> productOffers) {
        this.productOffers = productOffers;
    }
*/

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

    public String getEntityCodeName() {
        return entityCodeName;
    }

    public void setEntityCodeName(String entityCodeName) {
        this.entityCodeName = entityCodeName;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }
}
