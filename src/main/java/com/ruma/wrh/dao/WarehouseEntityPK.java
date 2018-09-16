package com.ruma.wrh.dao;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class WarehouseEntityPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "item_id", nullable = true)
    private long itemId;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}