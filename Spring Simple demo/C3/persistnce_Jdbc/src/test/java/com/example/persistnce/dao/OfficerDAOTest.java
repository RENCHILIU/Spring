package com.example.persistnce.dao;

import com.example.persistnce.entities.Officer;
import com.example.persistnce.entities.Rank;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Transactional
        //TODO: dealing with DB ,this is important
//TODO: if you don't have Transactional, the delete test func will influence the rest testing func
//Check doc for Transactional type : isolation/ propagation
class OfficerDAOTest {

    @Autowired
    private OfficeDAO dao;

    @Test
    void save() {
        Officer officer = new Officer(Rank.ENSIGN, "Paul", "Chekov");
        officer = dao.save(officer);
        assertNotNull(officer.getId());
    }

    @Test
    void findByIdThatExists() {
        Optional<Officer> officer = dao.findById(1);
        assertTrue(officer.isPresent());
        assertEquals(1, officer.get().getId().intValue());
    }

    @Test
    void findByIdThatNotExists() {
        Optional<Officer> officer = dao.findById(999);
        assertFalse(officer.isPresent());
    }

    @Test
    void count() {
        assertEquals(5, dao.count());
    }

    @Test
    void delete() {
        IntStream.rangeClosed(1, 5)
                .forEach(id -> {
                    Optional<Officer> officer = dao.findById(id);
                    assertTrue(officer.isPresent());
                    dao.delete(officer.get());
                });
        assertEquals(0, dao.count());
    }

    @Test
    void findAll() {
        List<String> dbNames = dao.findAll().stream()
                .map(Officer::getLast)
                .collect(Collectors.toList());
        assertThat(dbNames, containsInAnyOrder("Kirk", "Powell", "J", "Liu", "Beck"));
    }

    @Test
    void existById() {
        IntStream.rangeClosed(1, 5)
                .forEach(id -> assertTrue(dao.existsById(id)));
    }
}