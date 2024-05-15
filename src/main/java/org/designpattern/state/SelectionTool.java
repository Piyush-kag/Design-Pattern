package org.designpattern.state;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Changed the cursor... to select icon");
    }
    @Override
    public void mouseUp() {
        System.out.println("Draw the Shape..");
    }
}
