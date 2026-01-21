package org.example;

import org.example.decorator.ChocolateSprinkleDecorator;
import org.example.decorator.DiscoDipDecorator;
import org.example.decorator.IIceCreamDecorator;
import org.example.decorator.IceCreamDecorator;

public class Main {
    public static void main(String[] args) {
        IIceCreamDecorator iceCreamDecorator = new ChocolateSprinkleDecorator(new IceCreamDecorator());
        System.out.println(iceCreamDecorator.toString());

        IIceCreamDecorator iceCreamDecorator2 = new DiscoDipDecorator(new ChocolateSprinkleDecorator(new IceCreamDecorator()));
        System.out.println(iceCreamDecorator2.toString());
    }
}