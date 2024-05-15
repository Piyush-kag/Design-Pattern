package org.designpattern;

import org.designpattern.decorator.CloudStream;
import org.designpattern.decorator.CompressedStreamDecorator;
import org.designpattern.decorator.EncryptedStreamDecorator;
import org.designpattern.decorator.RemoveSpaceStreamDecorator;
import org.designpattern.decorator.Stream;

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


        Stream stream = new CloudStream();
        stream = new CompressedStreamDecorator(stream);
        stream = new EncryptedStreamDecorator(stream);
        stream = new RemoveSpaceStreamDecorator(stream);

        // Perform the action
        stream.write("This is the data");
    }
}