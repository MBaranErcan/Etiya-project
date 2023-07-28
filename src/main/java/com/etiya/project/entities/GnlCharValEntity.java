package com.etiya.project.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "gnl_char_val")
public class GnlCharValEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gnl_char_val_id")
    private Long gnlCharValId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private GnlCharEntity charId;

    @Column(name = "default_selected")
    private boolean defaultSelected;

    @Column(name = "descr")
    private String descr;

    @Column(name = "name")
    private String name;

    @Column(name = "shrt_code")
    private String shrtCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "st_id")
    private GnlStEntity stId;

    @Column(name = "val")
    private String val;

    //GETTERS && SETTERS
    public Long getGnlCharValId() {
        return gnlCharValId;
    }

    public void setGnlCharValId(Long gnlCharValId) {
        this.gnlCharValId = gnlCharValId;
    }

    public GnlCharEntity getCharId() {
        return charId;
    }

    public void setCharId(GnlCharEntity charId) {
        this.charId = charId;
    }

    public boolean getDefaultSelected() {
        return defaultSelected;
    }

    public void setDefaultSelected(boolean defaultSelected) {
        this.defaultSelected = defaultSelected;
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

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
