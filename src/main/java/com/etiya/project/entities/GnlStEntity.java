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

    @OneToMany(mappedBy = "gnlStEntity", cascade = CascadeType.ALL)
    private List<UserEntity> userEntityList;

    @OneToMany(mappedBy = "gnlStEntity", cascade = CascadeType.ALL)
    private List<CustOrdEntity> custOrdEntity;

    @OneToMany(mappedBy = "gnlStEntity", cascade = CascadeType.ALL)
    private List<CustOrdCharValEntity> custOrdCharValEntity;

    @OneToMany(mappedBy = "stId", cascade = CascadeType.ALL)
    private List<ProdOfrEntity> prodOfrEntities;

    @OneToMany(mappedBy = "stId", cascade = CascadeType.ALL)
    private List<GnlCharEntity> gnlCharEntities;

    @OneToMany(mappedBy = "stId", cascade = CascadeType.ALL)
    private List<GnlCharValEntity> gnlCharValEntities;

    @OneToMany(mappedBy = "stId", cascade = CascadeType.ALL)
    private List<ProdOfrCharValEntity> prodOfrCharValEntities;

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

    public List<UserEntity> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<UserEntity> userEntityList) {
        this.userEntityList = userEntityList;
    }

    public List<CustOrdEntity> getCustOrdEntity() {
        return custOrdEntity;
    }

    public void setCustOrdEntity(List<CustOrdEntity> custOrdEntity) {
        this.custOrdEntity = custOrdEntity;
    }

    public List<CustOrdCharValEntity> getCustOrdCharValEntity() {
        return custOrdCharValEntity;
    }

    public void setCustOrdCharValEntity(List<CustOrdCharValEntity> custOrdCharValEntity) {
        this.custOrdCharValEntity = custOrdCharValEntity;
    }

    public List<ProdOfrEntity> getProdOfrEntities() {
        return prodOfrEntities;
    }

    public void setProdOfrEntities(List<ProdOfrEntity> prodOfrEntities) {
        this.prodOfrEntities = prodOfrEntities;
    }

    public List<GnlCharEntity> getGnlCharEntities() {
        return gnlCharEntities;
    }

    public void setGnlCharEntities(List<GnlCharEntity> gnlCharEntities) {
        this.gnlCharEntities = gnlCharEntities;
    }

    public List<GnlCharValEntity> getGnlCharValEntities() {
        return gnlCharValEntities;
    }

    public void setGnlCharValEntities(List<GnlCharValEntity> gnlCharValEntities) {
        this.gnlCharValEntities = gnlCharValEntities;
    }

    public List<ProdOfrCharValEntity> getProdOfrCharValEntities() {
        return prodOfrCharValEntities;
    }

    public void setProdOfrCharValEntities(List<ProdOfrCharValEntity> prodOfrCharValEntities) {
        this.prodOfrCharValEntities = prodOfrCharValEntities;
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
