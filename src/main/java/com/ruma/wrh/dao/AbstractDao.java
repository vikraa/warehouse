package com.ruma.wrh.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManagerFactory;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractDao<E, PK extends Serializable> {

    protected final EntityManagerFactory emf;
    private final JpaRepository<E, PK> repo;

    public AbstractDao(EntityManagerFactory emf, JpaRepository<E, PK> repo) {
        this.emf = emf;
        this.repo = repo;
    }

    public List<E> findAll() {
        return repo.findAll();
    }

    public List<E> findAll(Sort sort) {
        return repo.findAll(sort);
    }

    public List<E> findAll(Iterable<PK> ids) {
        return repo.findAll(ids);
    }

    public <S extends E> List<S> save(Iterable<S> entities) {
        return repo.save(entities);
    }

    public <S extends E> S save(S entity) {
        return repo.save(entity);
    }

    public void delete(PK id) {
        repo.delete(id);
    }

    public void delete(E entity) {
        repo.delete(entity);
    }

    public void delete(Iterable<? extends E> entities) {
        repo.delete(entities);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

}