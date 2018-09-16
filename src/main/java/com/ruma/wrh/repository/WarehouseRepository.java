package com.ruma.wrh.repository;

import com.ruma.wrh.dao.WarehouseEntity;
import com.ruma.wrh.dao.WarehouseEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<WarehouseEntity, WarehouseEntityPK> {

}