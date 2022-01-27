package com.example.persistnce.dao;

import com.example.persistnce.entities.Officer;

import java.util.List;
import java.util.Optional;

public interface OfficeDAO {
    public Optional<Officer> findById(Integer id);

    public Officer save(Officer officer);

    public List<Officer> findAll();

    public long count();

    public void delete(Officer officer);

    public boolean existsById(Integer id);
}
