package com.etiya.project.requests;

public class CreateUserRequest {

    private String scrName;
    private String pwd;
    private String uName;
    private String userType;
    private String userStatus;


    // GETTERS & SETTERS
    public String getScrName() {
        return scrName;
    }

    public void setScrName(String scrName) {
        this.scrName = scrName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
