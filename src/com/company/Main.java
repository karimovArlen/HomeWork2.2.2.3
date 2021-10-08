package com.company;

public class Main {

    public static void main(String[] args) {
        Father[] arrayFather = {createObject("Oldson"), createObject("Youngson"),
                createObject("Littleson")};
        for (Father a :arrayFather) {
            a.print();

        }
    }



    public static Father createObject(String className) {
        switch (className) {
            case "Oldson":
                Oldson Alex = new Oldson(23, "Alex", 12);
                return Alex;

            case "Youngson":
                Youngson James = new Youngson(19, "James", "Hip hop");
                return James;
            case "Littleson":
                littleson Mike = new littleson(10, "Mike", "Sema");
                return Mike;
        }
                 return null;


        }

        }


