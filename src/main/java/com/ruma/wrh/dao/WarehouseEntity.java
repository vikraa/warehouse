package com.ruma.wrh.dao;

import javax.persistence.*;
import javax.swing.text.html.Option;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "warehouse_items")
@NamedQueries({ @NamedQuery(name = "WarehouseEntity.findAll", query = "select w from WarehouseEntity w")})
public class WarehouseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected WarehouseEntityPK warehouseEntityPK;

    //private long itemId;

    @Basic(optional = false)
    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Basic(optional = false)
    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Basic(optional = false)
    @Column(name = "created_date", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Basic(optional = false)
    @Column(name = "updated_date", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;

    public long getItemId() {
        return warehouseEntityPK.getItemId();
    }

    public void setItemId(long itemId) {
        this.warehouseEntityPK.setItemId(itemId);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public WarehouseEntityPK getWarehouseEntityPK() {
        return warehouseEntityPK;
    }

    public void setWarehouseEntityPK(WarehouseEntityPK warehouseEntityPK) {
        this.warehouseEntityPK = warehouseEntityPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}