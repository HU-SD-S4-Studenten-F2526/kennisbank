package org.example.decorator;

public class DiscoDipDecorator implements IIceCreamDecorator {
    private final IIceCreamDecorator iceCreamDecorator;

    public DiscoDipDecorator(IIceCreamDecorator iceCreamDecorator) {
        this.iceCreamDecorator = iceCreamDecorator;
    }

    public String toString() {
        return iceCreamDecorator.toString() + " with disco dip";
    }
}
