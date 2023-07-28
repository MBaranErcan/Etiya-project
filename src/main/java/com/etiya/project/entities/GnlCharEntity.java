package com.etiya.project.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_char")
public class GnlCharEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gnl_char_id")
    private Long gnlCharId;

    // FK: GnlChrValEntity -> char_id
    @OneToMany(mappedBy = "charId", cascade = CascadeType.ALL)
    private List<GnlCharValEntity> gnlCharValEntity;

    //FK: ProdOfrCharValEntity -> gnlCharEntity
    @OneToMany(mappedBy = "gnlCharEntity", cascade = CascadeType.ALL)
    private List<ProdOfrCharValEntity> prodOfrCharValEntities;

    @Column(name = "descr")
    private String descr;

    @Column(name = "name")
    private String name;

    @Column(name = "shrt_code")
    private String shrtCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;


    // GETTERS & SETTERS
    public Long getGnlCharId() {
        return gnlCharId;
    }

    public void setGnlCharId(Long gnlCharId) {
        this.gnlCharId = gnlCharId;
    }

    public List<GnlCharValEntity> getGnlCharValEntity() {
        return gnlCharValEntity;
    }

    public void setGnlCharValEntity(List<GnlCharValEntity> gnlCharValEntity) {
        this.gnlCharValEntity = gnlCharValEntity;
    }

    public List<ProdOfrCharValEntity> getProdOfrCharValEntities() {
        return prodOfrCharValEntities;
    }

    public void setProdOfrCharValEntities(List<ProdOfrCharValEntity> prodOfrCharValEntities) {
        this.prodOfrCharValEntities = prodOfrCharValEntities;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
