package com.example.helloworld;

class Person {
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

public class HelloWorld {
    public static void main(String[] args) {
        Person person1 = new Person("Groza", 19);
        System.out.println(person1.toString());
        Person person2 = new Person("Razvan","Miclea",19);
        System.out.println(person2.toString());

    }
}
