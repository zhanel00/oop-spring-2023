package com.example;

public class Cat extends Animal implements Pet {

    private Ambulatory ambulatory;

    private Nameable nameable = new NameableImpl();
    
    public Cat() {
        this("Fluffy");
    }
    
    public Cat(String name) {
//        this.name = name;
        ambulatory = new AmbulatoryImpl(4);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    public void walk() {
        ambulatory.walk();
    }

    @Override
    public void setName(String name) {
        nameable.setName(name);
    }

    @Override
    public String getName() {
        return nameable.getName();
    }

    @Override
    public void play() {
        System.out.println(this.getName() + " likes to play with string.");
    }
    
}