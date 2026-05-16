package org.example.decorator;

public class ChocolateSprinkleDecorator implements IIceCreamDecorator {
    private final IIceCreamDecorator iceCreamDecorator;

    public ChocolateSprinkleDecorator(IIceCreamDecorator iceCreamDecorator) {
        this.iceCreamDecorator = iceCreamDecorator;
    }

    public String toString() {
        return iceCreamDecorator.toString() + " with chocolate sprinkle";
    }
}
