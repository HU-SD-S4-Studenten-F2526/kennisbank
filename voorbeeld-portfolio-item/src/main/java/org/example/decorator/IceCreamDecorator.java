package org.example.decorator;

public class IceCreamDecorator implements IIceCreamDecorator{
    public String name = "Yummy ice cream";

    public String toString() {
        return name;
    }

    @Override
    public void Decorate() {

    }
}
