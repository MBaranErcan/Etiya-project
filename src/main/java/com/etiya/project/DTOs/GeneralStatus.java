package com.etiya.project.DTOs;

import com.etiya.project.entities.GnlCharEntity;
import com.etiya.project.entities.ProdOfrCharValEntity;
import com.etiya.project.entities.ProdOfrEntity;

import java.util.List;

public class GeneralStatus {

    private Long generalStatusId;

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
