package org.designpattern.decorator;

public class EncryptedStreamDecorator implements Stream {
    private Stream stream;

    public EncryptedStreamDecorator(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        String encryptedData = encrypt();
        stream.write(encryptedData);
    }

    private String encrypt() {
        System.out.println("Encrypting the data");
        return "435oir48oi#@%%w38b&&wneho";
    }
}
