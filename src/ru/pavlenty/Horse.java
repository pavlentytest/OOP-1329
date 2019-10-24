package ru.pavlenty;

public class Horse extends Animal {

    Horse(String c, int a, String t) {
        // вызов конструктора родителя - Animal
        super(c, a, t);
    }

    @Override
    public void makeSound() {
        System.out.println("Igogog!");
    }

    @Overload
    public void makeSound(String s) {
        System.out.println(s);
    }

    public void doSmth() {
        String nnn = this.type;
        //String ccc = this.color;
    }

}
