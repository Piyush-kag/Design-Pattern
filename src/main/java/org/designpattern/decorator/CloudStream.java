package org.designpattern.decorator;

public class CloudStream implements Stream{
    public void write(String data){
        System.out.println("Storing data..." );
        System.out.println("Stored " + data);
    }
}
