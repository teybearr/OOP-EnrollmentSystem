package org.example.model;

public abstract class Person {
    private int id;
    private String name;

    public Person(){}

    public Person(int id){
        this.id = id;
    }

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public abstract void mainTask();
}
