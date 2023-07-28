package com.etiya.project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseEntity {

    //create information
    @Column(name = "cdate", updatable = false)
    private LocalDate cdate;
    @Column(name = "cuser", updatable = false)
    private String cuser;

    //update information
    @Column(name = "udate")
    private LocalDate udate;
    @Column(name = "uuser")
    private String uuser;


    // Getter & Setters
    public LocalDate getCdate() {
        return cdate;
    }

    public void setCdate(LocalDate cdate) {
        this.cdate = cdate;
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    public LocalDate getUdate() {
        return udate;
    }

    public void setUdate(LocalDate udate) {
        this.udate = udate;
    }

    public String getUuser() {
        return uuser;
    }

    public void setUuser(String uuser) {
        this.uuser = uuser;
    }
}
