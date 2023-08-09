package com.etiya.project.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "scr_name")
    private String scrName;

    @Column(name = "pwd", nullable = false)
    @Size(min = 5, message = "Min password length is 5 characters!")
    private String pwd;

    @Column(name = "uname", unique = true, nullable = false)
    @Size(min = 2, message = "Name should be at least 2 characters!")
    private String uName;

    // Foreign Key of Gnl_St -> gnl_st_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity gnlStEntity;

    // Foreign Key of Gnl_Tp -> user_tp_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_tp_id")
    private GnlTpEntity gnlTpEntity;

    // Getters & Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }

    public GnlTpEntity getGnlTpEntity() {
        return gnlTpEntity;
    }

    public void setGnlTpEntity(GnlTpEntity gnlTpEntity) {
        this.gnlTpEntity = gnlTpEntity;
    }
}