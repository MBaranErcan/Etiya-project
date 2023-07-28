package com.etiya.project.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prod_ofr")
public class ProdOfrEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodOfrId;

    // Foreign Key: Cust_Ord -> prod_ofr_id
    @OneToMany(mappedBy = "prodOfrEntity", cascade = CascadeType.ALL)
    private List<CustOrdEntity> custOrdEntityList;

    // Foreign Key of Prod_Ofr_Char_Val -> prod_ofr_id
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private List<ProdOfrCharValEntity> prodOfrCharValEntity;

    @Column(name = "name")
    private String name;

    @Column(name = "descr")
    private String descr;

    // Foreign Key of GnlStEntity -> gnl_st_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    // FK: GnlTpEntity -> gnl_tp_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tp_id")
    private GnlTpEntity tpId;

    // Getters & Setters
    public Long getProdOfrId() {
        return prodOfrId;
    }

    public void setProdOfrId(Long prodOfrId) {
        this.prodOfrId = prodOfrId;
    }

    public List<CustOrdEntity> getCustOrdEntityList() {
        return custOrdEntityList;
    }

    public void setCustOrdEntityList(List<CustOrdEntity> custOrdEntityList) {
        this.custOrdEntityList = custOrdEntityList;
    }

    public List<ProdOfrCharValEntity> getProdOfrCharValEntity() {
        return prodOfrCharValEntity;
    }

    public void setProdOfrCharValEntity(List<ProdOfrCharValEntity> prodOfrCharValEntity) {
        this.prodOfrCharValEntity = prodOfrCharValEntity;
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

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
    }

    public GnlTpEntity getTpId() {
        return tpId;
    }

    public void setTpId(GnlTpEntity tpId) {
        this.tpId = tpId;
    }
}
