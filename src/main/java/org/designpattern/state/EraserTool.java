package org.designpattern.state;

public class EraserTool implements Tool{
    @Override
    public void mouseDown() {

        System.out.println("Changed the cursor to eraser...");
    }
    @Override
    public void mouseUp() {

        System.out.println("Erased the rectangle...");
    }
}
