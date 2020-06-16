package garbageCollections;

import domain.Human;

public class GarbageCollectionsExample {
    public static void main(String[] args) {
/*
        for(int i = 0 ; i < 500000 ; i++){
            new Human("SSN "+i);
        }*/

        callOne();
    }


    public static void callOne(){
        callTwo();
    }

    public static void callTwo(){
        callThree();
    }

    public static void callThree(){
        System.out.println("Called");
    }

    public static void reacheableExample(){
        Human h1 = null;//new Human("SSN 1");
        Human h2 = null;//new Human("SSN 2");
        Human h3 = null;//new Human("SSN 2");

        System.out.println(h1.getName());

        System.out.println(h2.getAge());

        for(int i = 0 ; i < 5; i++){
            System.out.println(h3.getName());
        }


        System.out.println(h1.getSsn());
        //new Human("Som");

    }


}
