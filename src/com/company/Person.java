package com.company;

public class Person {
    String name;
    String lastname;
    Address add;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Address getAdd() {
        return add;
    }

    @Override
    public String toString() {
        return "Имя - " + name + '\n' + "Фамилия - " + lastname + '\n' + "Адрес:" +'\n'+ add;
    }

    public Person(String name, String lastname, Address add) {
        this.name = name;
        this.lastname = lastname;
        this.add = add;

    }
}
