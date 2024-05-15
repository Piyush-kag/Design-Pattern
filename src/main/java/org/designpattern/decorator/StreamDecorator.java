package org.designpattern.decorator;

public abstract class StreamDecorator implements Stream{
    private Stream stream;

    public StreamDecorator(Stream stream) {
        this.stream = stream;
    }

    public void write(String data) {
        stream.write(data);
    }
}
