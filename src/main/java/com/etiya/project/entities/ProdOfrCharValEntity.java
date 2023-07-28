package com.etiya.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "prod_ofr_char_val")
public class ProdOfrCharValEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_ofr_char_val_id")
    private Long prodOfrCharValId;

    //Foreign Key: Prod_Ofr -> prod_ofr_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private ProdOfrEntity prodOfrId;

    // Foreign Key of Gnl_Char -> char_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private GnlCharEntity gnlCharEntity;

    @Column(name = "name")
    private String name;

    @Column(name = "descr")
    private String descr;

    @Column(name = "shrt_code")
    private String shrtCode;

    // Foreign Key of GnlStEntity -> stId;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    // Getters & Setters
    public Long getProdOfrCharValId() {
        return prodOfrCharValId;
    }

    public void setProdOfrCharValId(Long prodOfrCharValId) {
        this.prodOfrCharValId = prodOfrCharValId;
    }

    public ProdOfrEntity getProdOfrId() {
        return prodOfrId;
    }

    public void setProdOfrId(ProdOfrEntity prodOfrId) {
        this.prodOfrId = prodOfrId;
    }

    public GnlCharEntity getGnlCharEntity() {
        return gnlCharEntity;
    }

    public void setGnlCharEntity(GnlCharEntity gnlCharEntity) {
        this.gnlCharEntity = gnlCharEntity;
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

    public String getShrtCode() {
        return shrtCode;
    }

    public void setShrtCode(String shrtCode) {
        this.shrtCode = shrtCode;
    }

    public GnlStEntity getStId() {
        return stId;
    }

    public void setStId(GnlStEntity stId) {
        this.stId = stId;
    }
}
