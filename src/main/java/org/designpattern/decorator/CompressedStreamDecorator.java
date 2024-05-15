package org.designpattern.decorator;

public class CompressedStreamDecorator implements Stream{
    private Stream stream;

    public CompressedStreamDecorator(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        String compressedData = compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        System.out.println("Compressing the data... " + data);
        return data.substring(0, 5);
    }
}
