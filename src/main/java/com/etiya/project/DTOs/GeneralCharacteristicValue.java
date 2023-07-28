package com.etiya.project.DTOs;

import com.etiya.project.entities.GnlCharEntity;
import com.etiya.project.entities.GnlStEntity;

public class GeneralCharacteristicValue {

    private Long generalCharacteristicValueId;

    private GeneralCharacteristic charId;

    private boolean defaultSelected;

    private String description;

    private String name;

    private String shortCode;

    private GeneralStatus statusId;

    private String value;

    //GETTERS && SETTERS
    public Long getGeneralCharacteristicValueId() {
        return generalCharacteristicValueId;
    }

    public void setGeneralCharacteristicValueId(Long generalCharacteristicValueId) {
        this.generalCharacteristicValueId = generalCharacteristicValueId;
    }

    public GeneralCharacteristic getCharId() {
        return charId;
    }

    public void setCharId(GeneralCharacteristic charId) {
        this.charId = charId;
    }

    public boolean getDefaultSelected() {
        return defaultSelected;
    }

    public void setDefaultSelected(boolean defaultSelected) {
        this.defaultSelected = defaultSelected;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
