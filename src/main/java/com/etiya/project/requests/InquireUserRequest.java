package com.etiya.project.requests;

public class InquireUserRequest {


    private String uName;
    private String pwd;


    // GETTERS & SETTERS
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
