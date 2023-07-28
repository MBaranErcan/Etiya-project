package com.etiya.project.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gnl_tp")
public class GnlTpEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gnl_tp_id")
    private Long gnlTpId;


    // Foreign Key: User -> user_tp_id
    @OneToMany(mappedBy = "gnlTpEntity", cascade = CascadeType.ALL)
    private List<UserEntity> userEntity;

    // Foreign Key: ProdOfrEntity -> tpId
    @OneToMany(mappedBy = "tpId", cascade = CascadeType.ALL)
    private List<ProdOfrEntity> prodOfrEntities;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "descr")
    private String descr;

    @Column(name = "shrt_code", nullable = false)
    private String shrtCode;

    @Column(name = "ent_code_name")
    private String entCodeName;

    @Column(name = "is_actv", nullable = false)
    private boolean actv;

    // Getters & Setters
    public Long getGnlTpId() {
        return gnlTpId;
    }

    public void setGnlTpId(Long gnlTpId) {
        this.gnlTpId = gnlTpId;
    }

    public List<UserEntity> getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(List<UserEntity> userEntity) {
        this.userEntity = userEntity;
    }

    public List<ProdOfrEntity> getProdOfrEntities() {
        return prodOfrEntities;
    }

    public void setProdOfrEntities(List<ProdOfrEntity> prodOfrEntities) {
        this.prodOfrEntities = prodOfrEntities;
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
        actv = actv;
    }
}
