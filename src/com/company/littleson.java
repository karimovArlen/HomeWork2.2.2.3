package com.company;

public class littleson extends Father implements Printable {
    private String school;

    public littleson(int age, String name, String school) {
        super(age, name);
        this.school = school;
    }


    @Override
    public void print() {
        System.out.println("Имя" + ":" + getName());
        System.out.println("Возвраст" + ":" + getAge());
        System.out.println("Название школы" + ":" + school);

    }
}
