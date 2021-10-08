package com.company;

public class Oldson extends  Father implements  Printable {
    private int height;


    public Oldson(int age, String name, int height) {
        super(age, name);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println("имя" + ":" +  getName());
        System.out.println("Возвраст" + ":" +  getAge());
        System.out.println("Рост" + ":" +  height);
        System.out.println("=====================================");

    }
}

