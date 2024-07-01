package ru.kata.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.models.TestEntity;
import ru.kata.spring.boot_security.demo.repositories.TestEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TestEntityService {

    private final TestEntityRepository testEntityRepository;

    @Autowired
    public TestEntityService(TestEntityRepository testEntityRepository) {
        this.testEntityRepository = testEntityRepository;
    }

    public Optional<TestEntity> findOne(int id) {
        return testEntityRepository.findById(id);
    }

    public List<TestEntity> findAll() {
        return testEntityRepository.findAll();
    }
}