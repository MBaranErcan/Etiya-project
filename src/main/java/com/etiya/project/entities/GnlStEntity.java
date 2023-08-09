package com.etiya.project.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_st")
public class GnlStEntity extends BaseEntity{

    //Foreign Key:  User -> st_id
    //              Cust_Ord -> cust_ord_st_id
    //              Cust_Ord_Char_Val -> cust_ord_char_st_id
    //              ProdOfr -> stId
    //              GnlChar -> stId
    //              GnlCharVal -> stId
    //              ProdOfrCharVal -> stId

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gnl_st_id")
    private Long gnlStId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "descr")
    private String descr;

    @Column(name = "ent_code_name")
    private String entCodeName;

    @Column(name = "is_actv")
    public boolean actv;

    @Column(name = "shrt_code", nullable = false)
    private String shrtCode;


    // GETTERS & SETTERS
    public Long getGnlStId() {
        return gnlStId;
    }

    public void setGnlStId(Long gnlStId) {
        this.gnlStId = gnlStId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getEntCodeName() {
        return entCodeName;
    }

    public void setEntCodeName(String entCodeName) {
        this.entCodeName = entCodeName;
    }

    public boolean getActv() {
        return actv;
    }

    public void setActv(boolean actv) {
        this.actv = actv;
    }

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }
}
