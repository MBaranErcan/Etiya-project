package com.etiya.project.DTOs;

import com.etiya.project.entities.CustOrdCharValEntity;

public class CustomerOrder {

    private Long customerOrderId;

    // Foreign Key for Cust_Ord_Char_Val -> cust_ord_id;
    private CustOrdCharValEntity custOrdCharValEntity;

    private ProductOffer productOffer;

    private User user;

    private GeneralStatus generalStatus;


    // GETTER & SETTER
    public Long getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(Long customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public CustOrdCharValEntity getCustOrdCharValEntity() {
        return custOrdCharValEntity;
    }

    public void setCustOrdCharValEntity(CustOrdCharValEntity custOrdCharValEntity) {
        this.custOrdCharValEntity = custOrdCharValEntity;
    }

    public ProductOffer getProductOffer() {
        return productOffer;
    }

    public void setProductOffer(ProductOffer productOffer) {
        this.productOffer = productOffer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GeneralStatus getGeneralStatus() {
        return generalStatus;
    }

    public void setGeneralStatus(GeneralStatus generalStatus) {
        this.generalStatus = generalStatus;
    }
}
