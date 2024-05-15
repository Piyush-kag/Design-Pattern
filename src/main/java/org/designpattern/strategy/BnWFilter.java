package org.designpattern.strategy;

public class BnWFilter implements ImageFilter{
    @Override
    public void applyFilter(String image) {

        System.out.println("Applying Black and White Filter to image" + image);
    }
}
