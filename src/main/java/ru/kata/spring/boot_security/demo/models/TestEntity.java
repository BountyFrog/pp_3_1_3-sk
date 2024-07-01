package ru.kata.spring.boot_security.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_entity")
public class TestEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "tester")
    private String tester;

    @Column(name = "count")
    private int count;

    public TestEntity() {
    }

    public TestEntity(int id, String tester, int count) {
        this.id = id;
        this.tester = tester;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", testName='" + tester + '\'' +
                ", count=" + count +
                '}';
    }
}