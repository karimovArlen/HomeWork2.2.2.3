package com.company;

public class Youngson extends  Father implements Printable {
    private String dance;

    public Youngson (int age, String name,String dance){
        super(age, name);
        this.dance = dance;

    }

    @Override
    public void print() {
        System.out.println("имя" + ":" +  getName());
        System.out.println( "Возвраст "+ ":" +getAge());
        System.out.println("СТиль танца" + ":" + dance);
        System.out.println("========================================");

    }
}
