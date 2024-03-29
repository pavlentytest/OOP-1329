package ru.pavlenty;

public class Animal {
    // public - доступен везде
    // private - доступен внутри класса
    // protected - доступен в классах наследниках (объектах)

    private String color;
    private int age;
    protected String type;

    // final - неизменяемая

    public static final int LEGS = 4;

    // статичная
    // можно обратиться без создания объекта
    // класса
    
    public static String cht = "asdfasdf";


    Animal (String c, int a, String t) {
        this.age = a;
        this.color = c;
        this.type = t;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String s) {
        this.color = s;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void makeSound() {
        System.out.println("Buuuu!");
    }

}
