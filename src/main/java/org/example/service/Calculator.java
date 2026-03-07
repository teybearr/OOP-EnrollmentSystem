package org.example.service;

public class Calculator {
    private int answer;

    public void sum (int a, int b){
        answer = a+b;
    }

    public void diff (int a, int b){
        answer = a-b;
    }

    public int getAnswer(){
        return answer;
    }
}
