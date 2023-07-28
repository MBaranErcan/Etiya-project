package com.etiya.project.DTOs;

import com.etiya.project.entities.GnlStEntity;
import com.etiya.project.entities.GnlTpEntity;

public class User {

    private Long userId;

    // Foreign Key of Cust_Ord -> user_id
//    private List<CustomerOrder> customerOrders;

    private String screenName;

//    private String password;

    private String userName;

    private GeneralStatus generalStatus;

    private GeneralType generalType;


    // GETTER & SETTER
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

//    public List<CustomerOrder> getCustomerOrders() {
//        return customerOrders;
//    }
//
//    public void setCustomerOrders(List<CustomerOrder> customerOrders) {
//        this.customerOrders = customerOrders;
//    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public GeneralStatus getGeneralStatus() {
        return generalStatus;
    }

    public void setGeneralStatus(GeneralStatus generalStatus) {
        this.generalStatus = generalStatus;
    }

    public GeneralType getGeneralType() {
        return generalType;
    }

    public void setGeneralType(GeneralType generalType) {
        this.generalType = generalType;
    }
}
