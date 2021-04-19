package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Address add1 = new Address ("Слуцк", "Пионерская", 21);
        Address add2 = new Address("Минск", "Фабричная", 25);
        Address add3 = new Address("Минск", "Соломенная", 12);
        Person p1 = new Person(null, "Хоревич", add1);
        Person p2 = new Person("Ольга",null, add2);
        Person p3 = new Person("Илья","Скадорва",null);

        List<Person> Plist = new LinkedList<>();
        Plist.add(p1);
        Plist.add(p2);
        Plist.add(p3);
        for (Person person : Plist) {
            System.out.println(person);
            System.out.println();
        }

    }
}
