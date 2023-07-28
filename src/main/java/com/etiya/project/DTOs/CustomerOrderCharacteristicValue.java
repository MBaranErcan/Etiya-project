package com.etiya.project.DTOs;

public class CustomerOrderCharacteristicValue {

    private Long customerOrderCharacteristicValueId;

    private String value;

    private GeneralStatus customerOrderCharacteristicStatus;

    private CustomerOrder customerOrder;

    // GETTER & SETTER
    public Long getCustomerOrderCharacteristicValueId() {
        return customerOrderCharacteristicValueId;
    }

    public void setCustomerOrderCharacteristicValueId(Long customerOrderCharacteristicValueId) {
        this.customerOrderCharacteristicValueId = customerOrderCharacteristicValueId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public GeneralStatus getCustomerOrderCharacteristicStatus() {
        return customerOrderCharacteristicStatus;
    }

    public void setCustomerOrderCharacteristicStatus(GeneralStatus customerOrderCharacteristicStatus) {
        this.customerOrderCharacteristicStatus = customerOrderCharacteristicStatus;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }
}
