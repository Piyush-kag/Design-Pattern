package org.designpattern.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {

        System.out.println("Changed the cursor...to brush icon");
    }
    @Override
    public void mouseUp() {

        System.out.println("Draw a line...");
    }
}
