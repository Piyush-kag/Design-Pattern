package org.designpattern;

import org.designpattern.decorator2.Coffee;
import org.designpattern.decorator2.MilkDecorator;
import org.designpattern.decorator2.NormalCoffee;
import org.designpattern.decorator2.SugarDecorator;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        //State Pattern
        //        Canvas canvas = new Canvas();
        //        canvas.setCurrentTool(new EraserTool());
        //        canvas.mouseDown();
        //        canvas.mouseUp();
        //        canvas.setCurrentTool(new SelectionTool());
        //        canvas.mouseDown();
        //        canvas.mouseUp();

        //Strategy Pattern
        //var imageStorage = new ImageStorage(new VividFilter(), new PngCompressor());
        //imageStorage.store(" image.png");

        //Command Pattern
        //        var csObject = new CustomerService();
        //        var command = new AddCustomerCommand(csObject);
        //        var button = new Button(command);
        //        button.click();
        //        System.out.println("Customer Added Successfully.");
        //        System.out.println("Now removing the added customer...");
        //        var remCommand = new RemoveCustomerCommand(csObject);
        //        button = new Button(remCommand);
        //        button.click();
        //        System.out.println("Removed the added customer.");

        //Composite Command Pattern Undo Mechanism
        //        var history = new History();
        //        var editor = new VideoEditor();
        //        editor.setVideo("Testing Video");
        //
        //        var addVideoOnFieldCommand = new AddVideoOnField(editor, history);
        //        addVideoOnFieldCommand.execute();
        //        System.out.println(editor.getVideo() + " Video Added to Field");
        //
        //        var contrastedVideo = new AddContrastOnVideo(editor, history);
        //        contrastedVideo.execute();
        //        System.out.println("Added contrast to the video " + editor.getVideo());
        //        var undoContrast = new UndoVideoCommand(history);
        //        undoContrast.execute();
        //        System.out.println("Removed contrast from " + editor.getVideo());
        //
        //        var undoVideo = new UndoVideoCommand(history);
        //        undoVideo.execute();
        //        System.out.println("Video removed from the field");

        //Decorator pattern - 1 = CLOUD DATA COMPRESSION, ENCRYPTION OR STORAGE.
        //        Stream stream = new CloudStream();
        //        stream = new CompressedStreamDecorator(stream);
        //        stream = new EncryptedStreamDecorator(stream);
        //        stream = new RemoveSpaceStreamDecorator(stream);
        //
        //        // Perform the action
        //        stream.write("This is the data");

        //Decorator pattern - 2 = COFFEE SHOP.
        Coffee coffee = new NormalCoffee();
        out.println("Description: " + coffee.getDescription() + " | Cost: $" + coffee.cost());

        // Adding Milk
        coffee = new MilkDecorator(coffee);
        out.println("Description: " + coffee.getDescription() + " | Cost: $" + coffee.cost());

        //Adding Sugar
        coffee = new SugarDecorator(coffee);
        out.println("Description: " + coffee.getDescription() + " | Cost: $" + coffee.cost());

        //Adapter Pattern
        //        Pen pen = new PenAdapter();
        //        AssignmentWork assignmentWork = new AssignmentWork();
        //        assignmentWork.setPen(pen);
        //        pen.write("I am going to write this assignment on monday.");
    }
}