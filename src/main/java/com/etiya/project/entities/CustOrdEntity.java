package com.etiya.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cust_ord")
public class CustOrdEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_ord_id")
    private Long custOrdId;

    //Foreign Key for Prod_Ofr -> prod_ofr_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_ofr_id")
    private ProdOfrEntity prodOfrEntity;

    //Foreign Key: User -> user_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userId;

    // Foreign Key of Gnl_St -> gnl_st_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_st_id")
    private GnlStEntity gnlStEntity;


    // Getters & Setters
    public Long getCustOrdId() {
        return custOrdId;
    }

    public void setCustOrdId(Long custOrdId) {
        this.custOrdId = custOrdId;
    }

    public ProdOfrEntity getProdOfrEntity() {
        return prodOfrEntity;
    }

    public void setProdOfrEntity(ProdOfrEntity prodOfrEntity) {
        this.prodOfrEntity = prodOfrEntity;
    }

    public UserEntity getUserId() {
        return userId;
    }

    public void setUserId(UserEntity userId) {
        this.userId = userId;
    }

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }
}
