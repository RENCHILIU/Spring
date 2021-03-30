package com.example.persistnce.dao;

import com.example.persistnce.entities.Officer;
import org.springframework.data.jpa.repository.JpaRepository;

//TODO: this way is from Spring Data JPA
//TODO: you automatically get the method
public interface OfficerRepository extends JpaRepository<Officer, Integer> {
}
