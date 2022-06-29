package com.example.helloworld;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(String lastName, Integer age) {
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        if (this.firstName == null)
            return "Last name: " + this.lastName + ", Age: " + this.age;
        else
            return "First name: " + this.firstName + ", Last name: " + this.lastName + ", Age: " + this.age;
    }
}
