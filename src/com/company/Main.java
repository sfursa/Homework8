package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(null, "Хоревич", new Address(""));
        Person p2 = new Person("Ольга",null, add2);
        Person p3 = new Person("Илья","Скадорва",null);
        Person p4 = new Person("Иван","Кайль",add4);
        Person p5 = new Person("Артем","Ганжажаров",add5);
        Person p6 = new Person("Дмитрий","Маковский",add6);

        List<Person> Plist = new LinkedList<>();
        Plist.add(p1);
        Plist.add(p2);
        Plist.add(p3);
        Plist.add(p4);
        Plist.add(p5);
        Plist.add(p6);

        for (Person person : Plist) {
            System.out.println(person);
            System.out.println();
        }
        Plist
                .stream()
                .filter(noNull->noNull.name!=null && noNull.lastname != null && noNull.add != null)
                .sorted((h1,h2)->h1.add.getHouse()-h2.add.getHouse())
                .map(a->a.toString())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
