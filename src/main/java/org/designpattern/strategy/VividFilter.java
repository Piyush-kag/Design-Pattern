package org.designpattern.strategy;

public class VividFilter implements ImageFilter{
    @Override
    public void applyFilter(String image) {

        System.out.println("Appying Vivid Filter to image" + image);
    }
}
