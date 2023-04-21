package com.example.springedu.domain;

public class PersonVO {
    private String name;
    private int age;
    public PersonVO() {

    }
    public PersonVO(final String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + '}';
    }
}