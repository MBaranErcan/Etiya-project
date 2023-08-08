package com.etiya.project.DTOs;

import com.etiya.project.entities.GnlStEntity;
import com.etiya.project.entities.GnlTpEntity;

public class User {

    private Long userId;

    private String screenName;

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

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

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
