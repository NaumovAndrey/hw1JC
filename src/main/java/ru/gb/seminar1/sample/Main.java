package ru.gb.seminar1.sample;

import ru.gb.seminar1.regular.Decorator;
import ru.gb.seminar1.regular.OtherClass;


public class Main {

    /**
     * Тоска входа
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 3);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 4);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 8);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(6, 3);
        System.out.println(Decorator.decorate(result));
    }
}