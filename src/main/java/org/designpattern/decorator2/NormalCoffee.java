package org.designpattern.decorator2;

public class NormalCoffee implements Coffee {
    @Override
    public String getDescription() {

        return "Normal Coffee";
    }
    @Override
    public double cost() {

        return 2.00;
    }
}
