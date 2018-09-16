package com.ruma.wrh.dao;

import com.ruma.wrh.repository.WarehouseRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class WarehouseDao extends AbstractDao<WarehouseEntity, WarehouseEntityPK> {

    public WarehouseDao(EntityManagerFactory emf, WarehouseRepository repo) {
        super(emf, repo);
    }

}