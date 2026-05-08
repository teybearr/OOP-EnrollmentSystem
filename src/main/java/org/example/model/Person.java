package org.example.model;

public abstract class Person {
    private int id;
    private String name;

    // constructors
    public Person(){}
    public Person(int id){
        this.id = id;
    }
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    // id getters & setters
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    // name getters & setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // main task
    public abstract void mainTask();
}
