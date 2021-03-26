package com.example.persistnce.dao;

import com.example.persistnce.entities.Officer;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@SuppressWarnings({"SqlResolve", "SqlNoDataSourceInspection", "ConstantConditions"})
@Repository
public class JdbcOfficerDAO implements OfficeDAO {

    //TODO: when hibernate comes, it has its own methods
    //TODO: later, we can get Spring manager hibernate, people convert it to generate concept ->JPA api  .
    // Hibernate works well with JPA(name changed, concept is the same )

    //TODO: spring boot even simplify the work .
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Optional<Officer> findById(Integer id) {
        return Optional.ofNullable(entityManager.find(Officer.class, id));
    }

    @Override
    public Officer save(Officer officer) {
        entityManager.persist(officer);
        return officer;
    }

    @Override
    public List<Officer> findAll() {
        //TODO: JPQL
        return entityManager.createQuery("select o from Officer o", Officer.class).getResultList();
    }

    @Override
    public long count() {
        return entityManager.createQuery("select count(o.id) from Officer o", Long.class)
                .getSingleResult();
    }

    @Override
    public void delete(Officer officer) {
        entityManager.remove(officer);
    }

    @Override
    public boolean existsById(Integer id) {
        Long count = entityManager.createQuery("select count(o.id) from Officer o where o.id=:id", Long.class)
                .setParameter("id", id)
                .getSingleResult();
        return (count > 0);
    }
}
