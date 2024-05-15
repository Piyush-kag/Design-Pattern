package org.designpattern.strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compressImage(String image) {

        System.out.println("Compressing PNG image...");
    }
}
