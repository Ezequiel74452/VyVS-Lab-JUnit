package org.example;

public class Persona {

    private final String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            this.age = 0;
        } else {
            this.age = newAge;
        }
    }

    public void birthday() {
        this.age += 1;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }
}