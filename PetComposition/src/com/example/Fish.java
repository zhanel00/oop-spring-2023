package com.example;

public class Fish extends Animal implements Pet {

    private Nameable nameable = new NameableImpl();

    private Ambulatory ambulatory;

    public Fish() {
    }

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }

    public void walk() {
        ambulatory.walk();
    }

    @Override
    public void play() {
        System.out.println("Just keep swimming.");
    }

    @Override
    public void setName(String name) {
        nameable.setName(name);
    }

    @Override
    public String getName() {
        return nameable.getName();
    }
}