package com.etiya.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cust_ord_char_val")
public class CustOrdCharValEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_ord_char_val_id")
    private Long custOrdCharValId;

    @Column(name = "val")
    private String val;

    // Foreign Key for Gnl_St -> gnl_st_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_char_st_id")
    private GnlStEntity gnlStEntity;

    // Foreign Key: Cust_Ord -> cust_ord_id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_ord_id")
    private CustOrdEntity custOrdId;


    // GETTERS & SETTERS
    public Long getCustOrdCharValId() {
        return custOrdCharValId;
    }

    public void setCustOrdCharValId(Long custOrdCharValId) {
        this.custOrdCharValId = custOrdCharValId;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public GnlStEntity getGnlStEntity() {
        return gnlStEntity;
    }

    public void setGnlStEntity(GnlStEntity gnlStEntity) {
        this.gnlStEntity = gnlStEntity;
    }

    public CustOrdEntity getCustOrdId() {
        return custOrdId;
    }

    public void setCustOrdId(CustOrdEntity custOrdId) {
        this.custOrdId = custOrdId;
    }
}
