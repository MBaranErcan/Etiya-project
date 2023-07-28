package com.etiya.project.DTOs;

import com.etiya.project.entities.GnlCharEntity;
import com.etiya.project.entities.ProdOfrCharValEntity;
import com.etiya.project.entities.ProdOfrEntity;

import java.util.List;

public class GeneralStatus {

    private Long generalStatusId;

/*    //Foreign Key:  User -> st_id
    private List<User> users;

    // Cust_Ord -> cust_ord_st_id
    private List<CustomerOrder> customerOrders;

    // Cust_Ord_Char_Val -> cust_ord_char_st_id
    private List<CustomerOrderCharacteristicValue> customerOrderCharacteristicValues;

    // ProdOfr -> stId
    private List<ProductOffer> productOffers;

    // GnlChar -> stId
    private List<GeneralCharacteristic> generalCharacteristics;

    // ProdOfrCharVal -> stId
    private List<ProdOfrCharValEntity> prodOfrCharValEntities;*/

    private String name;

    private String description;

    private String entityCodeName;

    private boolean isActive;

    private String shortCode;


    // GETTER & SETTER
    public Long getGeneralStatusId() {
        return generalStatusId;
    }

    public void setGeneralStatusId(Long generalStatusId) {
        this.generalStatusId = generalStatusId;
    }
/*
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<CustomerOrder> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }

    public List<CustomerOrderCharacteristicValue> getCustomerOrderCharacteristicValues() {
        return customerOrderCharacteristicValues;
    }

    public void setCustomerOrderCharacteristicValues(List<CustomerOrderCharacteristicValue> customerOrderCharacteristicValues) {
        this.customerOrderCharacteristicValues = customerOrderCharacteristicValues;
    }

    public List<ProductOffer> getProductOffers() {
        return productOffers;
    }

    public void setProductOffers(List<ProductOffer> productOffers) {
        this.productOffers = productOffers;
    }

    public List<GeneralCharacteristic> getGeneralCharacteristics() {
        return generalCharacteristics;
    }

    public void setGeneralCharacteristics(List<GeneralCharacteristic> generalCharacteristics) {
        this.generalCharacteristics = generalCharacteristics;
    }

    public List<ProdOfrCharValEntity> getProdOfrCharValEntities() {
        return prodOfrCharValEntities;
    }

    public void setProdOfrCharValEntities(List<ProdOfrCharValEntity> prodOfrCharValEntities) {
        this.prodOfrCharValEntities = prodOfrCharValEntities;
    }*/

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

    public String getEntityCodeName() {
        return entityCodeName;
    }

    public void setEntityCodeName(String entityCodeName) {
        this.entityCodeName = entityCodeName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }
}
